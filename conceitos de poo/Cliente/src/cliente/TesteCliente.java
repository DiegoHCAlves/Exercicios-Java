package cliente;
import java.util.Scanner;

public class TesteCliente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Digite seu endereço: ");
        String endereco = scan.nextLine();

        System.out.print("Digite seu renda: ");
        double renda = scan.nextDouble();

        System.out.print("Digite seu profissão: ");
        String profissao = scan.next();

        Cliente cliente = new Cliente(nome, endereco, renda, profissao);

        cliente.dadosCliente();

    }
}