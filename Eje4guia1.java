/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje4guia1;

import java.util.Scanner;

/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

/**
 *
 * @author usuario
 */
public class Eje4guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double grados;
     Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese la cantidad de grados centigrados");
     grados = leer.nextDouble();
     double Fah = (32 + ( 9 * grados / 5));
     
     System.out.println("Los grados ingresado equivalen a " + Fah);
     
     
     
    }
    
}
