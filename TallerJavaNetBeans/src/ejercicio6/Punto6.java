package ejercicio6;
import java.util.Scanner;
import java.lang.Math;

public class Punto6 {
    public static void main(String[] args) {
        //Escribir un programa para obtener la hipotenusa y los ángulos agudos de un triángulo rectángulo a partir de las
        //longitudes de los catetos.
        Scanner entra = new Scanner(System.in);
        float c_a;
        float c_b;
        float hipotenusa = 0;
        float angulos_ag;
        float angulos_beta;
        
        System.out.print("Ingrese uno de los catetos: ");
        c_a = entra.nextFloat();
        System.out.print("Ingrese el segundo cateto: ");
        c_b = entra.nextFloat();
        
        //Calcular la Hipotenusa
        hipotenusa = (float) Math.sqrt(Math.pow(c_a,2) + Math.pow(c_b, 2));
        
        //Calcular los Angulos Agudos
        angulos_ag = (float) Math.toDegrees(Math.atan(c_a/c_b));
        angulos_beta = (float) Math.toDegrees(Math.atan(c_b/c_a));
        
        //Imprimimos
        System.out.println("Hipotenusa(c): "+ hipotenusa);
        System.out.println("Angulo #1: " + angulos_ag + "°");
        System.out.println("Angulo #2: "+ angulos_beta + "°");
        
    }
}
