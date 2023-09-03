package ejercicio3;
import java.util.Scanner;
import java.lang.Math;

public class Punto3 {
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);
        int n;
        int i;
        double suma=0;
        System.out.println("Ingrese el numero de datos a Sumar");
        n = entra.nextInt();
        for(i=1;i<=n;i++){
            suma=suma+ (i/Math.pow(2, i));
        }
        System.out.println("La suma es : " + suma);
    }
    
}
