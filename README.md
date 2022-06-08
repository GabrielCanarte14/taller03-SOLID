# taller03-SOLID

Luis Gabriel Cañarte Lucio
Cristopher Alejandro Arroba 

Enunciado 1 

Este enunciado viola el principio de responsabilidad unica debido a que la clase helado y pastel no solo
se encargaban de generar el objeto como tal sino que también eran responsables de generar calculos de precios,
para corregir esto se creo una interfaz la cual tiene el método de calcular y luego se implemento en cada una
de estas clases. Tambien se creo una clase padre de donde estas dos subclases heredan sus constructores y solo
difieren en el argumento de precio parcial. 

Enunciado 2 

La clase OperacionesAderezo no es necesaria debido a dos razones, la primera y mas grave es que su existencia crea
conflictos con el principio de abierto cerrado ya que si queremos crear una nueva clase hija de postres, nos tocaria 
añadirle a la clase OperacionesAderezo los metodos de añadir y quitar aderezo. La segunda razón por la cual su 
existencia es innecesaria es que añadir estos dos metodos a cada clase hija no incurre en ningun otro principio por lo
cual separarlos no es necesario. Respecto a si se podría o no se podría incluir estos metodos a postre, si se puede hacer
pero no es una condición necesaria.

Enunciado 3

Este cambio sería innecesario ya que si la formula de calculo se modifica, el método showPrecioFinal no se vería afectado
de ninguna forma y no estaría causando un problema en el principio de inversión de dependencias.

Enunciado 4 

Este cambio fue necesario paa evitar incurrir en el principio de Open Close ya que si dejabamos a la clase aderezo como
una clase de tipo Enum, cada vez que quisieramos agregar un nuevo tipo tendriamos que editar el módulo, para esto como 
solucion se crea las clases individuales para cada uno.