# En Bogotá durante el año 2017, para infraestructura y personal docente en educación se hizo la mayor inversión,la mayor cantidad de ingreso efectivo proviene del pago del impuesto de industria y comercio.

El registro FUT es un mecanismo para que los Departamentos, Distritos y Municipios reporten datos oficiales básicos al Gobierno Nacional. Por medio de la plataforma de datos abiertos, la contaduría General de la Nacion ha publicado su reporte FUT respecto de ingresos, pagos de inversión y gastos operativos para todas las ciudades y municipios de Colombia durante los años 2016 y 2017. El presente trabajo se centra en el reporte ingresos y gastos para la ciudad de Bogotá durante el año de 2016 y 2017.

## URL visualización: https://observablehq.com/@hpuentes/distribucion-de-ingreso-efectivo-y-pagos-realizados-duran

### Objetivo 

El principal objetivo de este trabajo, es la presentación de una visualización dentro de la cual se pueda presentar de una forma clara, como es la distribución del monto por las diferentes fuentes de ingreso y por concepto de gasto bien sea de inversión o de funcionamiento en la ciudad de Bogotá durante los años 2016 y 2017.

### Alcance

La visualización presenta una vista interactiva de la distribución del monto por las diferentes fuentes de ingreso y por concepto de gasto bien sea de inversión o de funcionamiento en la ciudad de Bogotá durante los años 2016 y 2017. Se hace presentación de un treemap, el cual se actualiza de forma interactiva dependiendo del año seleccionado y de la fuente que se desea visualizar (Ingreso efectivo, pagos por gastos de inversión y pagos por gastos de funcionamiento).

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
Se debe seleccionar el año 2016 o 2017 sobre el cual se desea presentar la vizualización, adicional se debe seleccionar la fuente de datos, dentro de lo cual se encuentra las opciones: ingreso efectivo, pagos por gastos de inversión y pagos por gastos de funcionamiento.

![Gastos e ingresos en bogota 2016-2017](https://github.com/hpuentes/gastos_ingresos_bogota_2016_2017/blob/master/ingreso-gasto.png?raw=true)

## Conclusiones 
Para el año 2016, los dos principales conceptos de ingreso efectivo por su cuantia son los siguientes:
1. Impuesto de industria y comercio: $3.4 billones.
2. Impuesto predial unificado: $2.2 billones.

... Para el año 2017:
1. Impuesto de industria y comercio: $3.5 billones (0.1 billones más que el 2016).
2. Impuesto predial unificado: $2.4 billones. (0.2 billones más que el 2016).

Para el año 2016, los dos principales conceptos de pagos por gastos por inversión por su cuantia son los siguientes: 
1. Personal docente en educación: $1 billón
2. Afiliación al regimen subsidiado: $1 billón

... Para el año 2017.
1. Personal docente en educación: $1,2 billones (0.2 billones más que el 2016)
2. Construcción, mejoramiento y mantenimiento de infraestructura física: $1,88 billones (Aumento superior al 100% respecto al 2016)

Para el año 2016, los dos principales conceptos de pagos por gastos de funcionamiento por su cuantia son los siguientes:
1. Mesadas pensionales: $0.63 billones
2. Servicios personales asociados a la nómina: $0.68 billones

## Tecnologías usadas
* D3@5
* Javascript
* Despliegue en el sitio observablehq.
* Apache Spark.
