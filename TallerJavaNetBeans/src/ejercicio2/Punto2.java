package ejercicio2;

import java.util.Scanner;

public class Punto2 {
    public static void main(String[] args) {
        //Escribir un programa que lea la hora en notación de 24 horas y que imprima en notación de 12; por ejemplo, si la
        //entrada es 13:45, la salida será 1:45 pm. El programa debe solicitar al usuario que introduzca exactamente cinco
        //caracteres para especificar una hora; por ejemplo, las 9 en punto se debe introducir así: 09:00.
        Scanner entra = new Scanner(System.in);
        int horaMl;
        int horaN;
        int Min;
        String ampm;
        System.out.print("Ingrese la hora Militar: ");
        horaMl = entra.nextInt();
        System.out.print("Ingrese los minutos: ");
        Min = entra.nextInt();
        if(horaMl >= 12){
            horaN = horaMl - 12;
            ampm = "PM";
        }else{
            horaN = horaMl;
            ampm = "AM";
        }
        System.out.println("La hora militar " + horaMl +":" + Min +" es igual en formato Am/Pm a " + horaN +":" + Min + " " + ampm);
             
    }
    
}
