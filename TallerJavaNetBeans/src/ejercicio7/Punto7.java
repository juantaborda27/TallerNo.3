package ejercicio7;
import java.util.Scanner;

public class Punto7 {
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);
        //Crear un programa que valore el salario neto semanal de los trabajadores de una empresa de acuerdo a las siguientes
        //normas:
        //• Horas semanales trabajadas <38 a una tasa de 5%.
        //• Horas extras (38 o más) a una tasa 50% superior a la ordinaria.
        //• Impuestos de 0%, si el salario bruto es menor o igual a 750 euros; 10%, si el salario bruto es mayor que 750 euros.
        //Lea los datos necesarios para calcular el salario de un trabajador
        Scanner entrada = new Scanner(System.in);
        int horasTrabajadas;
        double tasaOr, aumentado, au2, Impuesto = 0;
        double salarioBruto, salarioTotal;
        
        System.out.print("Ingrese el numero de horas Trabajadas : ");
        horasTrabajadas = entrada.nextInt();
        
        System.out.print("Ingrese la tasa ordinaria por hora : ");
        tasaOr = entrada.nextDouble();
        
        if(horasTrabajadas<38){
            salarioBruto = horasTrabajadas*tasaOr;
        }else{
            aumentado = tasaOr * 0.5;
            au2 = tasaOr + aumentado;
            salarioBruto = horasTrabajadas*aumentado;
        }
        
        if(salarioBruto<=750){
            salarioTotal = salarioBruto;
        }else{
            Impuesto = salarioBruto* 0.1;
            salarioTotal = salarioBruto - Impuesto;
        }
        
        System.out.println("Salario Bruto : " + salarioBruto + "$");
        System.out.println("Impuestos : "+ Impuesto + "$");
        System.out.println("Salario Neto : " + salarioTotal + "$");
        
        
    }
}
