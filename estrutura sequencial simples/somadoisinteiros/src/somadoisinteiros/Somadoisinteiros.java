package somadoisinteiros;

import java.util.Scanner;

public class Somadoisinteiros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        int valorUm = teclado.nextInt();
        System.out.println("Digite o segundo valor");
        int valorDois = teclado.nextInt();
        int soma = valorUm + valorDois;
        System.out.println("A soma desses valores e igual a " + soma);
    }

}
