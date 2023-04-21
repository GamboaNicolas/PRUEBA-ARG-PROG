/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;


public class Funciones_1_apunte 
{
    
    public static void main(String[] args) 
    {
        
        Scanner leer = new Scanner(System.in);
        
        String ingresada = leer.nextLine();
        
        System.out.println(cifrador(ingresada));
        
    }

    public static String cifrador(String palabra)
    {
        
        String cifrada = "";
        
        int n = palabra.length();
        
        String letra;
        
        for (int i = 0; i < n; i++) {   
            
            letra = palabra.substring(i, i+1);
            
            switch(letra.toLowerCase()){
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;
                default:
                    break;
            }
        
        
        cifrada = cifrada.concat(letra);

        
        }
        return cifrada;
    }
}
