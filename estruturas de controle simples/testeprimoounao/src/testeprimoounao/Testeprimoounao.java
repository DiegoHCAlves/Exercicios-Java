/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeprimoounao;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Testeprimoounao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor");
        int valor = teclado.nextInt();
        
        boolean ePrimo = true;
        
        if (valor <= 2 || valor%2==0){
           ePrimo = false;
        }
     
        for (int i = 3; i <= Math.sqrt(valor); i+=2 ) {
            if (valor%i==0){
            ePrimo = false;
            break;
            }
        }
        
        if (ePrimo == true){
            System.out.println(valor + " é Primo");
        } else {
            System.out.println( valor + " não é primo");
        }
        
        
    }
    
    
}
