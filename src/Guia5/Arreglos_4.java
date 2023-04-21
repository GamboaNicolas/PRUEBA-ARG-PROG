/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Arreglos_4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] primera = new int[4][4], inversa = new int[4][4];

        for (int i = 0; i < 4 ; i++) {

            for (int j = 0; j < 4 ;j++) {

                primera[i][j] =  (int) Math.round(Math.random() * 10 + 1);
                inversa[j][i] = primera[i][j];
//                System.out.println(primera[i][j]); para chequear los numeros

            }

        }

//        System.out.println("La primer matriz es:\n" + Arrays.toString(primera));

        System.out.println("La matriz es: ");
        
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(primera[i]));
        }

        System.out.println("La matriz inversa es:");
        
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(inversa[i]));
        }
        
    }

}
//MODIFICACION PARA PROBAR GIT PUSH /