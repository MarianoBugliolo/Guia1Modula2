/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2guia1;

import java.util.Scanner;

/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
/**
 *
 * @author usuario
 */
public class Eje2guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String nombre;   
     Scanner leer = new Scanner(System.in);
     
     System.out.println("Ingese su nombre");
     nombre = leer.nextLine();
     System.out.println("Hola mi nombre es " + nombre);
     
     
    }
    
}
