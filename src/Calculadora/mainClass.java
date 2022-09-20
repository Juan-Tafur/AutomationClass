package Calculadora;

import java.util.Scanner;

public class mainClass {

    public static void main (String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        calculadora sumas = new calculadora();
        calculadora restas = new calculadora();
        calculadora multiplicaciones = new calculadora();
        calculadora divisiones = new calculadora();

        System.out.println("Inserte el simbolo de operacion que quiere realizar:");
        String operacion = scanner.next();

        switch (operacion) {
            case "+" -> {
                //SUMA
                System.out.println("ingrese el primer digito");
                int a = scanner.nextInt();
                //int a = numero;
                System.out.println("ingrese el segundo digito");
                int b = scanner.nextInt();
                //int b = numero1;
                int c = a + b;
                sumas.adicion(a, b, c);
                break;
            }
            case "-" -> {
                //Resta
                System.out.println("ingrese el primer digito");
                int a = scanner.nextInt();
                System.out.println("ingrese el segundo digito");
                int b = scanner.nextInt();
                int c = a - b;
                restas.resta(a, b, c);
                break;
            }
            case "*" -> {
                //Multiplicacion
                System.out.println("ingrese el primer digito");
                int a = scanner.nextInt();
                System.out.println("ingrese el segundo digito");
                int b = scanner.nextInt();
                int c = a * b;
                multiplicaciones.multiplicacion(a, b, c);
                break;
            }
            case "/" -> {
                //division

                System.out.println("ingrese el primer digito");
                int a = scanner.nextInt();
                System.out.println("ingrese el segundo digito");
                int b = scanner.nextInt();
                int c = a / b;
                divisiones.division(a, b, c);
                break;
            }
            default -> System.out.println("No ha seleccionado un simbolo de operacion valido");
        }

    }
}
