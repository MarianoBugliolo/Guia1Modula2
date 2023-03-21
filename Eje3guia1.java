/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje3guia1;

import java.io.PrintStream;
import java.util.Scanner;

/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
/**
 *
 * @author usuario
 */
public class Eje3guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String frase;
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Por favor ingrese una frase");
       frase = leer.nextLine();
       System.out.println(frase.toLowerCase());
       System.out.println(frase.toUpperCase());
      
    }
    
}
