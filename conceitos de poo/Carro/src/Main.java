import java.util.Scanner;

//Mudar nextInt() para receber String e trata-la. nextInt() está dando exceção quando usuário insere uma String

public class Main {
    public static void main(String[] args) {
        int i = 1;

        Scanner teclado = new Scanner(System.in);
        do {

            Utils.menu();
            int opcao = Integer.parseInt(teclado.nextLine());

            switch (opcao) {
                case Utils.CADAST_CARRO:
                    //entra em um método em loop
                    Operacoes.cadastrarCarro();
                    break;
                case Utils.DIRIGIR_UM_CARRO:
                    //entra em outro método
                    Utils.dirigirCarro();
                    int escolha = Integer.parseInt(teclado.nextLine());;
                    switch (escolha) {
                        case Utils.LIGAR_CARRO:
                            //algo
                            Operacoes.ligarCarro();
                            break;
                        case Utils.ACELERAR:
                            //algo
                            Carro.acelerar();
                            Carro.statusCarro();
                            break;
                        case Utils.FREAR:
                            //algo
                            Carro.frear();
                            Carro.statusCarro();
                        case Utils.SAIR:
                            //algo
                            break;
                    }
                    break;
                case Utils.VER_DADOS_CARRO:
                    //Chama método que mostra dados
                    Operacoes.mostrarDados();
                    break;
                case Utils.SAIR:
                    System.out.println("Encerrando o programa...");
                    i = 2;
                    break;
                default:
                    do {
                        System.out.println("Valor informado inválido. Tente novamente");
                        opcao = Integer.parseInt(teclado.nextLine());
                    } while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4);

            }

        } while (i == 1);
    }
}