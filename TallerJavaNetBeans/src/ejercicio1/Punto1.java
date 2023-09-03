package ejercicio1;

import java.util.Scanner;

public class Punto1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // TODO code application logic here
        //Escribir un programa en java que solicite ingresar longitud y anchura de una habitación; 
        //hecho esto, visualice su
        //superficie con esos datos.
        
        double longitud;
        double anchura;
        double superficie;
        System.out.println("Ingrese la Longitud de la Habitacion: ");
        longitud = entrada.nextDouble();
        System.out.println("Ingrese la Anchra de la Habitacion: ");
        anchura = entrada.nextDouble();

        superficie=longitud*anchura;
        
        System.out.println("Superfifie: " + superficie);
    }
    

}
