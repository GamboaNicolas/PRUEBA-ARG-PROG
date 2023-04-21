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
public class Condicionales_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String contra = "eureka";
        String intento;
        
        System.out.println("Por favor ingrese la contraseña:");
        
        do{
            intento = leer.nextLine();
            if (contra.equals(intento)) {
                System.out.println("Bienvenido!!");
                break;
            }
            System.out.println("Contraseña incorrecta. Intenta nuevamente");
        }while(!contra.equals(intento));
    }
    
}
