/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Funciones_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean resultado;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese un número para determinar\n"
                + "si este es primo o no:");
        
        resultado = primo(leer.nextInt());
        
        System.out.println(resultado);
        
        
    }
    
    
    public static boolean primo(int p){
        
        for (int i = 2; i < p; i++) {
            
            if((p % i) == 0){
                return false;
            }
            
        }
        
        return true;
        
    }
    
}
