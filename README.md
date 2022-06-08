# taller03-SOLID

Luis Gabriel Cañarte Lucio
Cristopher Alejandro Arroba 

Enunciado 1 

Este enunciado viola el principio de responsabilidad unica debido a que la clase helado y pastel no solo
se encargaban de generar el objeto como tal sino que también eran responsables de generar calculos de precios,
para corregir esto se creo una interfaz la cual tiene el método de calcular y luego se implemento en cada una
de estas clases. Tambien se creo una clase padre de donde estas dos subclases heredan sus constructores y solo
difieren en el argumento de precio parcial. 