/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuada;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor inteiro");
        int valorUm = teclado.nextInt();
        
        for (int i=1;i<=10;i++){
            System.out.println(valorUm + " X " + i + " = " + valorUm*i);
        }
        
    }
    
}
