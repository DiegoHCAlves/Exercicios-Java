/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divisivelounao;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Divisivelounao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor");
        int valorUm = teclado.nextInt();
        System.out.println("Digite o segundo valor");
        int valorDois = teclado.nextInt();
        
        if (valorUm%valorDois == 0){
            System.out.println("O primeiro valor e divisivel pelo segundo");
        } else {
            System.out.println("O primeiro valor nao e divisivel pelo segundo");
        }
    }
    
}
