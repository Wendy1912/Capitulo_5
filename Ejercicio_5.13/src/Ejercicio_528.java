/*Para evitar el uso de continue en el código debemos modificar el
if, la condición del if debe ser contraria (cuenta!=5) y luego
dentro del if poner la instrucción System.out.printf(“%d”,cuenta).
*/
public class Ejercicio_528 {
public static void main(String args[]){
for ( int cuenta = 1; cuenta <= 10; cuenta++ ){
if (cuenta != 5)
System.out.printf("%d ",cuenta);
}
System.out.print("\nNO se uso continue, pero igual se omitio la impresion de 5.");
}
}

