package ejercicio4;
import java.util.Scanner;
public class Punto4 {
     public static void main(String[] args) {
        //Encontrar un número natural N más pequeño de forma que la suma de los N primeros números exceda una cantidad
        //introducida por el teclado.
        int obj;
        int suma = 0;
        int n = 1;
        Scanner entra = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros a exceder: ");
        obj = entra.nextInt();
        
        while(suma <= obj){
            suma += n;
            n++;
        }
         System.out.println("El numero natural mas pequeño cuya suma de los primeros N números excede "+ obj + " es: "+(n-1));
     }
}
