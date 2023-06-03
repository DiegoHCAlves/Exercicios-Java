
package parouimpar;

import java.util.Scanner;

public class Parouimpar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um numero");
        int valorUm = teclado.nextInt();
        
        if (valorUm%2==0) {
            System.out.println("O Valor e par");
        } else {
            System.out.println("O valor e impar");
        }
    }
    
}
