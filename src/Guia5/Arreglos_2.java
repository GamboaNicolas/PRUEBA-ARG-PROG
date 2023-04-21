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
public class Arreglos_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el largo del vector:");
        int N = leer.nextInt();

        System.out.println("Ingrese el valor que desea buscar en el vector aleatorio:");
        int valor = leer.nextInt();

        int contador = 0;
        int[] vector = new int[N];
        int posicion = 0;
        for (int i = 0; i < N; i++) {
            vector[i] = (int) Math.round(Math.random() * 10);
            if (vector[i] == valor) {
                contador++;
                posicion = i + 1;
            }
        }

        if (contador == 0) {
            System.out.println("El valor ingresado no se encuentra en el vector aleatorio.");
        } else if (contador == 1) {
            System.out.println("El valor " + valor + " se encuentra en el vector en la posición: " + posicion);
        } else {
            int[] posiciones = new int[contador];
            
            posicion = 0;
            for (int i = 0; i < N; i++) {
                if (vector[i] == valor) {
                    posiciones[posicion] = i+1;
                    posicion++;
                }
            }
            System.out.println("El valor aparece "+contador+" veces en el vector aleatorio, en la posiciones:");
            System.out.println(Arrays.toString(posiciones));

        }
    }

}
