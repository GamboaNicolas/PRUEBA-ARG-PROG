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
public class Funciones_4 {

    public static void main(String[] args) {
        
        /*
         Programa principal
         */
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero para saber si es primo:");

        int numero = leer.nextInt();

        System.out.println(primo(numero));
        System.out.println(primo2(numero));
    }

    public static boolean primo(int p) {

        int pi;
        int contador = 0;

        for (int i = 1; i < p + 1; i++) {

            pi = p % i;

            if (pi == 0) {
                contador++;
                //contador = contador + 1 es lo mismo
            }

        }

        return contador == 2;
    }

    public static boolean primo2(int p) {

        for (int i = 2; i < p; i++) {

            if (p % i == 0) {
                return false;
            }

        }
        return true;
    }

}
