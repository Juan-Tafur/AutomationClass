package SalaryCalculator;

import java.util.Scanner;

public class Calificaciones {

    public static void main (String args[])
    {
        //initialize known values
        Scanner scanner = new Scanner(System.in);

        //get unknown values
        System.out.println("Ingrese la letra de califiacion: ");
        String calification = scanner.next();

        switch (calification.toUpperCase())
        {
            case "E" :
                System.out.println("La calificacion es Excelente");
                break;
            case "S" :
                System.out.println("La calificacion es Sobresaliente");
                break;
            case "A" :
                System.out.println("La calificacion es Aceptable");
                break;
            case "D" :
                System.out.println("La calificacion es Deficiente");
                break;
            case "I" :
                System.out.println("La calificacion es insuficiente");
                break;
            default:
                System.out.println("El estudiante no tiene calificacion");

        }
    }
}
