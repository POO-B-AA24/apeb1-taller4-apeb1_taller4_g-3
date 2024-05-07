# Taller 4 (Laboratorio) - GRUPAL

## Creación de programas usando estructuras condicionales y repetitivas

* Leer detenidamente cada problemática propuesta.
* Usar el programa **DIA-UML** _(Open source)_ para generar la representación de su solución _(modelado)_, vía diagramas de clases.
* Para cada diagrama/solución _(modelado de su solución)_, genere/agregue 2 archivos _(fuente e img: \*.dia y \*.png \*.jpeg, etc)_. No olvide titular a cada clase, con el nombre representativo del análisis/solución. Para el nombre de cada archivo use el formato: _Problema-NroProbl_NombClase_. Ejemplo **Problema-1_Trabajador**. Todos estos archivos agréguelos en el subDirectorio: **Modelos_UML**
* En el subDirectorio **Solucion_Codigo** cree un único proyecto NetBeans - _Java Aplication_ (o con el IDE de su preferencia) y en él, agregue todas las clases necesarias para la solución de cada problema _(no use paquetes aun)_. Y para facilitar la revisión, utilice para la clase base el formato _Problema-NroProbl_NombClaseBase_, y para la clase de prueba/ejecutor use _Problema-NroProbl_NombClaseEjecutor_ (Ésta última es la clase de prueba que genera/instancia con objetos cada entidad/clase y verifica su funcionalidad). 
* Respete la arquitectura **MVC**, es decir, no implemente entradas/salidas desde/hacia teclado-consola directamente en la clase base. Los datos de entrada y resultados deben ser ingresados/mostrados desde/hacia teclado-consola, en la clase de prueba/ejecutor.
* Para retornar los datos del objeto, usar el método _**toString()**_, vía cadena con formato legible. 
* Recuerde, según el problema, puede existir método _**establecer()**_ que no requieren argumentos, pero si un procesamiento. 

___


## Problema 1 - Aplicación de _if()_

Desarrolla un programa que automatice la venta de **_X_** productos. El programa debe permitir al usuario ingresar el precio de un producto y determinar el descuento aplicable según las siguientes reglas:

* Si el precio del producto es mayor o igual a $1000, y el número de productos al menos 10, se aplica un descuento del 10%.
* Si el precio del producto es menor a $1000, se aplica un descuento del 5%, independientemente del número de productos.

Una vez determinado el descuento, el programa debe calcular y mostrar el precio final la la compra después de aplicar el descuento.

El programa debe implementar una clase respectiva base que contenga al menos los métodos:

* Un método llamado "calcularDescuento" que tome como parámetro el precio y número de productos y devuelva el descuento correspondiente.
* Un método llamado "calcularPrecioFinal" que devuelva el precio final después de aplicar el descuento.

Además, el programa debe solicitar al usuario ingresar el precio y número de productos y utilizar los métodos de la clase para calcular y mostrar el descuento aplicado y el precio final. No olvide que la clase de prueba (que contiene el método main), es quien realiza la gestión de ingreso de datos y/o visualización de resultados.

> [!Note]
> - Implemente los constructores y propiedades _**set(tipo arg)**_ y _**get()**__ unicamente necesarios/usados.

## Problema 2 - Aplicación de ciclos _for(), while(), do-while()_

Desarrolla un programa que permita gestionar una lista de empleados de una empresa y su nómina de pagos. El programa debe permitir al usuario realizar las siguientes acciones:

1.	Agregar un empleado: El usuario debe ingresar el nombre, el salario y la edad del empleado. El programa debe crear un objeto de la clase "Empleado" con esta información y agregarlo a la lista de empleados.
2.	Mostrar información de los empleados: El programa debe mostrar en pantalla la información de todos los empleados registrados, incluyendo su nombre, salario y edad.
3.	Calcular aumento de salario: El programa debe solicitar al usuario ingresar un porcentaje de aumento salarial. Luego, para cada empleado cuyo salario sea menor al salario promedio de todos los empleados, se debe aplicar el aumento correspondiente y mostrar en pantalla el nuevo salario.

La clase "Empleado" debe tener los siguientes atributos:
•	Nombre: nombre del empleado (cadena de caracteres).
•	Salario: salario del empleado (número decimal).
•	Edad: edad del empleado (entero).

> [!Note]
> - Clase "Empleado" debe tener un método llamado "mostrarInformacion" (toString) que imprima en pantalla la información del empleado.