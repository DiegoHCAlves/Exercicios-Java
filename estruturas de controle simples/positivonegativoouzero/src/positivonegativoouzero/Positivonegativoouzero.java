/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positivonegativoouzero;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Positivonegativoouzero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor inteiro");
        int valorUm = teclado.nextInt();
        if (valorUm>0){
            System.out.println("Este valor e positivo");
        } else if (valorUm==0) {
            System.out.println("Este valor e igual a zero");
        } else {
            System.out.println("Este valor e negativo");
        }
        
    }

}
