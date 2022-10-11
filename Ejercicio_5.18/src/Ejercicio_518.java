public class Ejercicio_518 {
    public static void main( String args[] ){
        int monto;
int principal = 100000; // monto inicial en centimos
double tasa = 0.05; // tasa de interés
// muestra los encabezados
System.out.printf("%5s %20s\n","Anio","Monto en deposito");
// calcula el monto en deposito para cada uno de diez años
for ( int anio = 1; anio <= 10; anio++ ){
    // calcula el nuevo monto para el año especificado
monto = (int)(principal * Math.pow( 1.0 + tasa, anio ));
// muestra el año y el monto
System.out.printf("%4d%,17d.%02d\n",anio, monto/100,monto%100 );

}
    }
}
