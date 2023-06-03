package somaepotenciacao;

// (A + B)^2 sendo dois inteiros

import java.util.Scanner;



public class Somaepotenciacao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor");
        int valorUm = teclado.nextInt();
        System.out.println("Digite outro valor");
        int valorDois = teclado.nextInt();
        double soma = valorUm + valorDois;
        double potencia = Math.pow(soma,2);
        System.out.println("O resultado da conta e " + potencia);
                
    }
    
}
