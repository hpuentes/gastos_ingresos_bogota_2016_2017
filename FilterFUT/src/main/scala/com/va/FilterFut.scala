package com.va

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD.rddToPairRDDFunctions
import java.util.regex.Matcher
import java.util.regex.Pattern
import org.apache.spark.rdd.RDD
import java.math.BigInteger

object FilterFut {
  def main(args: Array[String]) = {
    
    val filterFit = new FilterFutProcess()
    filterFit.process("FUT_GASTOS_DE_FUNCIONAMIENTO.csv","FUT_GASTOS_DE_FUNCIONAMIENTO_BOGOTA")
    filterFit.process("FUT_GASTOS_DE_INVERSION.csv","FUT_GASTOS_DE_INVERSION_BOGOTA")
    filterFit.process("FUT_INGRESOS.csv","FUT_INGRESOS")
    
  }
  
  class FilterFutProcess {
  
    def process(inFile : String, outFolder : String) = {
      //Start the Spark context
      val conf = new SparkConf()
        .setAppName("FilterFut")
        .setMaster("local")
      val sc = new SparkContext(conf)
  
      //Read some example file to a test RDD
      val origin = sc.textFile(inFile)
      var data: RDD[(String,BigDecimal)] = origin.filter((line) => {
        if(line.startsWith("AÑO")){
          false
        }
        else{
          val words = line.split(",")
          if(words(2).equals("VAL") || words(3).equals("VAL"))
            false
          else if(words(1).equals("Bogotá D.C."))
            true
          else
            false
        }
      }).map((line) => {
        var newLine = line
        if(line.contains("\"")){
          val p = Pattern.compile("\"([^\"]*)\"")
          val m = p.matcher(line)
          while (m.find()) {
            var value = m.group(1)
            var replacement = value.replaceAll(",", "")
            newLine = newLine.replace(value,replacement)
          }
          newLine = newLine.replace("\"", "")
        }
        val words = newLine.split(",")
        
        if(words.length == 11){//Funcionamiento{
          if(words(2).contains(".") || words(2).equals("1")){
            if(words(2).contains(".")){
              var parent = words(2).substring(0,words(2).lastIndexOf("."))
              (words(2)+","+parent+","+words(0)+","+words(3), BigDecimal(words(10)))
            }
            else
              (words(2)+",,"+words(0)+","+words(3), BigDecimal(words(10)))
          }
          else{
            if(words(3).contains(".")){
              var parent = words(3).substring(0,words(3).lastIndexOf("."))
              (words(3)+","+parent+","+words(0)+","+words(2), BigDecimal(words(10)))
            }
            else
              (words(3)+",,"+words(0)+","+words(2), BigDecimal(words(10)))
          }
        } 
        else if(words.length == 10){//Inversion
          if(words(2).contains(".")){
            var parent = words(2).substring(0,words(2).lastIndexOf("."))
            (words(2)+","+parent+","+words(0)+","+words(3), BigDecimal(words(9)))
          }
          else
            (words(2)+",,"+words(0)+","+words(3), BigDecimal(words(9)))
        }
        else{ //if(words.length == 13)//Ingresos
          if(words(2).contains(".")){
            var parent = words(2).substring(0,words(2).lastIndexOf("."))
            (words(2)+","+parent+","+words(0)+","+words(3), BigDecimal(words(6))) //Posicion 6 = Recaudo efectivo
          }
          else
            (words(2)+",,"+words(0)+","+words(3), BigDecimal(words(6)))
        }
      })
      data.reduceByKey(_ + _).saveAsTextFile(outFolder) //Save to a text file
  
      //Stop the Spark context
      sc.stop
    }
  }
}