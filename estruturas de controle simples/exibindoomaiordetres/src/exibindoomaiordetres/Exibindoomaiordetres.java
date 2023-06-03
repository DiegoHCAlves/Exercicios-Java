/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exibindoomaiordetres;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Exibindoomaiordetres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiror valor");
        int valorUm = teclado.nextInt();
        System.out.println("Digite o segundo valor");
        int valorDois = teclado.nextInt();
        System.out.println("Digite o terceiro valor");
        int valorTres = teclado.nextInt();
        int maiorValor = 0;
        if (valorUm > maiorValor) {
            maiorValor = valorUm;
        }
        if (valorDois > maiorValor) {
            maiorValor = valorDois;
        }
        if (valorTres > maiorValor) {
            maiorValor = valorTres;
        }
        System.out.println("O maior valor e " + maiorValor);
    }

}
