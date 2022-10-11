public class Ejercicio_526 {
    public static void main(String args[]){
    int cuenta;
    int centinela = 0;
    for ( cuenta = 1; cuenta <= 10 && 0 == centinela; cuenta++ ){
    if ( 5 == cuenta ){
    centinela++;
    cuenta--;
    System.out.println("\nSalida anticipada debido a una condición de interrupción");
    }
    else
    System.out.printf( "%d ", cuenta );
    }
    System.out.printf("\nSalio de ciclo en cuenta = %d\n",cuenta );
    }
    }
