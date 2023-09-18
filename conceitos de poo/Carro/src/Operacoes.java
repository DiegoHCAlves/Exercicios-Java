import java.util.Scanner;

public class Operacoes {
    //Alterar tamanho do array para ser indefinido
    //Usar lista em vez de array
    //Melhorar lógica para que pule os nulos ao cadastrar

    static Carro[] carros = new Carro[5];

    public static void mostrarDados() {

        for (int i = 0; i < 5; i++) {
            if (carros[i] != null) {
                System.out.println("----------DADOS----------");
                System.out.println("Nome: " + carros[i].getNome());
                System.out.println("Marca: " + carros[i].getMarca());
                System.out.println("AnoLancamento: " + carros[i].getAnoLancamento());
            } else {
                break;
            }


        }
    }

    public static void cadastrarCarro() {
        Scanner teclado = new Scanner(System.in);
        int opcao, anoLancamento, i = 0;
        String nome, marca;

        Carro carro;

        do {


            System.out.println("------Informe os dados do carro------");
            System.out.print("Nome do carro: ");
            nome = teclado.nextLine();
            System.out.print("Marca do carro: ");
            marca = teclado.nextLine();
            System.out.print("Ano de lançamento: ");
            anoLancamento = Integer.parseInt(teclado.nextLine());;

            System.out.println("Carro cadastrado com sucesso!!!!");
            System.out.println();

            System.out.println("Deseja cadastrar outro carro?");
            System.out.println("1 - Cadastrar outro carro");
            System.out.println("2 - Sair");
            opcao = Integer.parseInt(teclado.nextLine());;

            while (opcao != 1 && opcao != 2) {
                System.out.println("Opcao escolhida inválida. Tente novamente");
                opcao = Integer.parseInt(teclado.nextLine());;
            }

            carro = new Carro(nome, marca, anoLancamento);


            if (carros[i] == null) {
                carros[i] = carro;
                i++;
            }

            if (carros[i] != null) {
                while (carros[i] != null) {
                    i++;
                    if (carros[i] == null) {
                        carros[i] = carro;
                        i++;
                    }
                    if (i >= 5) {
                        break;
                    }
                }
            }


            if (opcao == 2) {
                break;
            }

        } while (opcao == 1);

    }

    public static void ligarCarro() {
        Scanner teclado = new Scanner(System.in);
        Carro.motorLigado = true;
        System.out.println("<Motor ligado com sucesso>");
        System.out.println();
    }


}


