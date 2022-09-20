package Tarea1;

import Tarea1.complementoej1;

import java.util.Scanner;

public class Ejercicio1 {
    static String primeraCadena;
    static String segundaCadena;

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        complementoej1 firstClass = new complementoej1();
        System.out.println("Ingrese un adjetivo");
        primeraCadena = scanner.next();
        System.out.println("Ingrese una estacion");
        segundaCadena = scanner.next();
        System.out.println("Ingrese una cantidad de tasas de cafe");
        int numero = scanner.nextInt();
        complementoej1.cadenas(primeraCadena,segundaCadena,numero);



    }
}
