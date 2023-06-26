/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodosarray;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class EjercicioDosArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        int numero [] = new int [10];
        for (int i=0; i<numero.length; i++){
            System.out.print("Ingrese un numero: ");
            numero [i] = teclado.nextInt();
            }
        int mayor = numero[0];
        for (int i=1; i<numero.length; i++)
            if (numero[i] > mayor){
                mayor = numero[i];
            }
        System.out.println("El numero mayor es: " + mayor);
    }
    
}
