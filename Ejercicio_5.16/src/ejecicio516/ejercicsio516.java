package ejecicio516;
import java.util.Scanner;
public class ejercicsio516 {
    public static void main(String[] args) {
        System.out.print("\nIntroduzca cinco enteros entre 1 y 30");
        System.out.println(" y se imprimira el grafico.\n");
        Scanner entrada = new Scanner(System.in);
        int num;
        int count = 1;
        while ( count <= 5 )
        { // Abre while
            System.out.printf("\nPor favor introduzca el numero %d:\n ", count);
 num = entrada.nextInt();
 if ((1 <= num) && ( 30 >= num))
 { // Abre if
    for ( int i = 1; i <= num; i++ )
    System.out.print("*");
    System.out.println("");
    count++;
}
else
System.out.println("Numero incorrecto");
}
}
}