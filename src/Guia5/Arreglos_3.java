/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Arreglos_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] cantidades = new int[5];

        for (int i = 0; i < 5; i++) {
            cantidades[i] = 0;
        }

        System.out.println("Ingrese el largo del vector que desea crear: ");

        int N = leer.nextInt();

        int[] vector = new int[N];

        for (int i = 0; i < N; i++) {
// vector[i] = Math.round(Math.random()*10)

            System.out.println("Ingrese el valor del indice: " + i);
            vector[i] = leer.nextInt();

            int digitos = 0;
            int control = vector[i];
            while (control > 0) {
                control = control / 10;
                digitos++;

            }
          
            cantidades[digitos - 1]++;

        }
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Hay "+cantidades[i]+ " numeros con una cantidad de dígitos igual a "+ (i+1));
        
        }
        
    }
}
