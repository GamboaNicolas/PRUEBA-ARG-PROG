/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

public class Condicionales_1 {
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para determinar si es par o impar:");
        int numero = leer.nextInt();
        
        if (numero%2 == 0) {
            System.out.println("El numero " + numero + " es par");
        }else{
            System.out.println("El numero " + numero + " es impar");
        }
        
    }
}   
/**
 *
 * @author Nicolas
 */
//public class Condicionales_1 {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in);
//        System.out.println("Hola, por favor ingrese su primer numero");
//        Integer n1, n2;
//        n1 = leer.nextInt();
//        System.out.println("Hola, por favor ingrese su segundo numero");
//        n2 = leer.nextInt();
//        
//        if (n1>n2) {
//            System.out.println("El primer numero es mayor que el segundo");
//        }else{
//            System.out.println("El segundo numero es mayor que el Primero");
//        };
//    }
//    
//}

