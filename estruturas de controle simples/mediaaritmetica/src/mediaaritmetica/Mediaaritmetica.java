/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaaritmetica;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Mediaaritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero");
        int valorUm = teclado.nextInt();
        System.out.println("Digite outro numero");
        int valorDois = teclado.nextInt();
        System.out.println("Digite mais um valor");
        int valorTres = teclado.nextInt();
        
        int media = (valorUm + valorDois + valorTres)/3;
        System.out.println("A media destes valores equivale a " + media);
        
        }
    }
    

