public class Utils {
    public static final int CADAST_CARRO = 1;
    public static final int DIRIGIR_UM_CARRO = 2;
    public static final int VER_DADOS_CARRO = 3;
    public static final int SAIR = 4;

    public static void menu() {
        System.out.println("---------MENU---------");
        System.out.println("Escolha uma das opçoes");
        System.out.println("1 - Cadastrar novo carro");
        System.out.println("2 - Dirigir um carro");
        System.out.println("3 - Ver informações de um carro");
        System.out.println("4 - Sair");
    }

    public static final int LIGAR_CARRO = 1;
    public static final int ACELERAR = 2;
    public static final int FREAR = 3;

    //public static final int SAIR = 4;
    public static void dirigirCarro() {
        System.out.println("------OPCOES------");
        System.out.println("1 - Ligar o carro");
        System.out.println("2 - Acelerar");
        System.out.println("3 - Frear");
        System.out.println("4 - Sair");
    }
    
}
