/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import java.util.Scanner;

/**
 * 
 * @author adisant2
 */
public class Libro {
        Scanner leer = new Scanner(System.in);
        private String ISBN;
        private String titulo;
        private String autor;
        private int paginas;
        
        public Libro(String ISBN, String titulo, String autor, int paginas){
            this.ISBN = ISBN;
            this.titulo = titulo;
            this.autor = autor;
            this.paginas = paginas;
        }
        
        public Libro(){}
        
        public void SetInfo(){
            System.out.println("Ingrese el  ISBN:");
            this.ISBN = leer.nextLine();
            System.out.println("Ingrese el titulo del libro:");
            this.titulo = leer.nextLine();
            System.out.println("Ingrese el nombre del autor:");
            this.autor = leer.nextLine();
            System.out.println("Ingrese la cantidad de páginas:");
            this.paginas = leer.nextInt();
            
        }
        
        /**
         * 
         */
        public void GetInfo(){
            System.out.println("ISBN: "
                    + ISBN +
                    "\nTítulo: "
                            + titulo+
                    "\nAutor: "
                            + autor + 
                    "\nCantidad de paginas: "
                            + paginas);
        }
        
        
        
    
}
