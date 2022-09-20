package Sesion1;

import java.util.Scanner;

public class otherclass {

    static String globalV = "Esto es una variable global";
    static String primerCadena;


    public static void main (String args[])
    {
        System.out.println("Ingrese un texto");
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.next();
        System.out.println("Hola mundo");

        //llamdo de metodos
        Sesion1 firstClass = new Sesion1();
        System.out.println(globalV);
        globalV = firstClass.otherText();
        System.out.println(globalV);
        firstClass.printText(cadena);

        //concatenacion
        System.out.println("Ingrese un texto para unir");
        primerCadena = scanner.next();
        System.out.println("Ingrese un numero para unir");
        int numero = scanner.nextInt();
        firstClass.unirCadenas(primerCadena, numero);
    }
}
