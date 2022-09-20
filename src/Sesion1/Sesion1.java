package Sesion1;

import java.util.Scanner;

public class Sesion1 {

    public String otherText()
    {
        String localV;
        localV = "modificado desde el metodo";
        return localV;

    }
    public void printText(String text)
    {
        System.out.println(text);

    }
    public void unirCadenas(String primerTexto, int primerNumero)
    {
        System.out.println("El texto ingresado es " + primerTexto + " el numero ingresado es " + primerNumero);
    }
}
