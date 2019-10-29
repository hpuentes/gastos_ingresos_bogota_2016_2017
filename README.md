# En Bogotá durante el año 2017, para infraestructura y personal docente en educación se hizo la mayor inversión,la mayor cantidad de ingreso efectivo proviene del pago del impuesto de industria y comercio.

El registro FUT es un mecanismo para que los Departamentos, Distritos y Municipios reporten datos oficiales básicos al Gobierno Nacional. Por medio de la plataforma de datos abiertos, la contaduría General de la Nacion ha publicado su reporte FUT respecto de ingresos, pagos de inversión y gastos operativos para todas las ciudades y municipios de Colombia durante los años 2016 y 2017. El presente trabajo se centra en el reporte ingresos y gastos para la ciudad de Bogotá durante el año de 2016 y 2017.

## URL visualización: https://observablehq.com/@hpuentes/distribucion-de-ingreso-efectivo-y-pagos-realizados-duran

### Objetivo 

### Alcance

## Autor
Hermes Puentes Navarro https://www.linkedin.com/in/hermes-puentes-navarro-1898b2b3/
Combining code from Mike Bostock block https://observablehq.com/@d3/nested-treemap

## Preparación de datos
Código desarrollado para las actividades de limpieza, filtrado y calidad de datos.
https://github.com/hpuentes/gastos_ingresos_bogota_2016_2017/tree/master/FilterFUT

### Fuente: Datos Abiertos 
### Entidad: Unidad Administrativa Especial Contaduría General de la Nación.
### Area o dependencia: Contaduría General de la Nacion. 
## Información del Formulario Único Territorial sobre la Categoría: ingresos, gastos de inversión y gastos de funcionamiento. Contaduría General de la Nación.
* FUT Ingresos: https://www.datos.gov.co/Hacienda-y-Cr-dito-P-blico/FUT-INGRESOS/u2vs-ghyn
* FUT Gastos de inversión: https://www.datos.gov.co/Hacienda-y-Cr-dito-P-blico/FUT-GASTOS-DE-INVERSION/g3mg-je4i
* FUT Gastos de funcionamiento: https://www.datos.gov.co/Hacienda-y-Cr-dito-P-blico/FUT-GASTOS-DE-FUNCIONAMIENTO/jfaj-6c7i


## Tarea Principal.
T1. Presentar la distribución de ingresos o gastos de Bogotá. 
(Present)-(Distribution)

### Tareas secundarias.
T2. Indentificar los conceptos de ingreso o gasto de mayor cuantia. 
(Identify)-(Outliers)

T3. Presentar los conceptos y subconceptos de ingreso y gasto distribuido por nivel de detalle. 
(Present)-(Dependency)

T4. Descubrir el valor total de ingreso y gastos en cada nivel de detalle por concepto y subconceptos. 
(Lookup)-(Distribution)

## WHAT?
### Attributes: 
* Ciudad: Categorical.
* Código(Indica jerarquía): Ordered, sequential.
* Nombre(Del ingreso o gasto): Categorical.
* Valor(Del ingreso o gasto): Quantitative, sequential.
* Año: Quantitative, sequential.

### Dataset:
Tree

## WHY?
1. Presentar la distribución de ingresos o gastos de Bogotá. (Present)-(Distribution)
2. Indentificar los conceptos de ingreso o gasto de mayor cuantia. (Identify)-(Outliers)
3. Presentar los conceptos y subconceptos de ingreso y gasto distribuido por nivel de detalle. (Present)-(Dependency)
4. Descubrir el valor total de ingreso y gastos en cada nivel de detalle por concepto y subconceptos. (Lookup)-(Distribution)

## HOW?
* Idiom: Treemap.
* Size: Tamaño indica cantidad de ingreso o gasto.
* Orientation: Rectilinea
* HUE: Naranja
* Luminance: Por la profundidad dentro del arbol.
* Área 2D.
* Order: Ordena por nivel de profundidad en el arbol.
* Separate: Separa los grupos de ingreso y gasto.
* Select: Presenta detalles de cada cuadro de ingreso o gasto, indica path y valor.
* Change: Al seleccionar año se cambia la distribución de ingreso o gasto al año correspondiente. Al seleccionar ingreso o tipo de gasto se actualiza la visualización a la distribución del elemento seleccionado.
* Partition: Representa división de ingresos o gastos.

## Distribución del gasto y del ingreso efectivo para la ciudad de Bogotá durante los años 2016 y 2017

![Gastos e ingresos en bogota 2016-2017](https://github.com/hpuentes/gastos_ingresos_bogota_2016_2017/blob/master/ingreso-gasto.png?raw=true)


## Conclusiones 


## Tecnologías usadas
* D3@5
* Javascript
* Despliegue en el sitio observablehq.
* Apache Spark.
