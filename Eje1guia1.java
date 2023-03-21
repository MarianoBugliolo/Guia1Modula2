/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1guia1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Eje1guia1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      Scanner leer2 = new Scanner(System.in);
      int num1, num2;
      
    System.out.println("Ingrese un numero por favor");
    num1 = leer.nextInt();
    System.out.println("Ingrese otro numero por favor");
    num2 = leer.nextInt();
    System.out.println("La suma de los numeros zingresados e: " + (num1 + num2));
    
    
              }
    
}
