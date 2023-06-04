/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contaBancaria;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class MeuPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero da sua conta");
        int numeroContaUm = teclado.nextInt();
        System.out.println("Qual valor deseja depositar?");
        double depositoContaUm = teclado.nextDouble();

        ContaBancaria contaUm = new ContaBancaria(numeroContaUm, depositoContaUm);
        System.out.println("O saldo e de " + contaUm.saldoConta() + " R$");

        while (true) {

            System.out.println("Qual operacao deseja fazer?");
            System.out.println("1 - deposito");
            System.out.println("2 - saque");
            System.out.println("3 - verificar saldo");
            int operacao = teclado.nextInt();

            // teclado.nextLine();
            switch (operacao) {
                case 1:
                    System.out.println("Informe o valor que seja depositar");
                    double valor = teclado.nextInt();
                    contaUm.depositar(valor);
                    break;
                case 2:
                    System.out.println("Informe o valor que deseja sacar");
                    double saque = teclado.nextInt();
                    contaUm.sacar(saque);
                    break;
                case 3:
                    System.out.println("O saldo da conta e de " + contaUm.saldoConta() + " R$");
            }
            //Precisa desse nextLine pra limpar o Buffer
            teclado.nextLine();

            System.out.println("Deseja fazer outra operacao?");
            String opcao = teclado.nextLine();
            if (!opcao.equals("sim") && !opcao.equals("Sim") && !opcao.equals("s")) {
                /*Pra comparar String precisa desse equals*/
                break;
            }
        }
      //  System.out.println("O saldo atual da conta e de " + contaUm.saldoConta() + " R$");
    }

}
