/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

 

/**
 *
 * @author Nicolas
 */
public class Condicionales_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el largo del cuadrado que desea crear:");
        
        byte largo = leer.nextByte();
        
        for (int i = 1; i < largo; i++) {
            System.out.print("*");
        }
        System.out.println("*");
        
        
        for (int i = 2; i < largo; i++) {
            System.out.print("*");
            for (int j = 2; j < largo; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        for (int i = 1; i < largo; i++) {
            System.out.print("*");
        }
        System.out.println("*");
    }
    
}
