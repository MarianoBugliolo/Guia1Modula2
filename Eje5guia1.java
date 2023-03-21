/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje5guia1;

import java.util.Scanner;

/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

/**
 *
 * @author usuario
 */
public class Eje5guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double num;
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrse un numero entero");
       num = leer.nextDouble();
       System.out.println("El doble de su numero es: " + (num * 2));
       System.out.println("El triple de su numero es: " + (num * 3));
       System.out.println("El raiz cuadrada de su numero es: " + Math.sqrt(num));
       
    }
    
}
