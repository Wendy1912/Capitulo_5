public class Ejercicio_524 {
    public static void main (String[] args) {
    int centro=9/2 + 1;
    //En este caso es un rombo de 9 filas
    for (int fila=1; fila<=9; fila++) {
    for (int columna = 1; columna <= 9; columna++) {
    if (fila <= centro) {
    if (((centro - fila) < columna)&& (columna <
    (centro + fila)))
    System.out.print("*");
    else
    System.out.print(" ");
    }
    else {
    if (((fila - centro) < columna)&& (columna <
    (centro * 2 - (fila - centro))))
    System.out.print("*");
    else
    System.out.print(" ");
    }
    }
    System.out.println();
    }
    }
    }
    
