import java.sql.SQLOutput;
import java.util.Scanner;

public class Carro {
    //------------------------Atributos-----------------------
    private String nome;
    private String marca;
    private int anoLancamento;
    private static int velocidade;
    private static int marcha;
    static boolean motorLigado = false;

    //----------------------Construtores-----------------------
    public Carro() {

    }

    public Carro(String nome, String marca, int anoLancamento, int velocidade, int marcha) {
        this.nome = nome;
        this.marca = marca;
        this.anoLancamento = anoLancamento;
        this.velocidade = velocidade;
        this.marcha = velocidade;
    }

    public Carro(String nome, String marca, int anoLancamento) {
        this.nome = nome;
        this.marca = marca;
        this.anoLancamento = anoLancamento;
    }

    //---------------------Acessores------------------------

    public String getNome() {

        return nome;
    }

    public String getMarca() {

        return marca;
    }

    public int getAnoLancamento() {

        return anoLancamento;
    }

    public static int getVelocidade() {

        return velocidade;
    }

    public int getMarcha() {

        return marcha;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnoLancamento(int anoLancamento) {

        this.anoLancamento = anoLancamento;
    }

    public void setVelocidade(int velocidade) {

        this.velocidade = velocidade;
    }

    public void setMarcha(int marcha) {

        this.marcha = marcha;
    }


    //-----------------------Métodos------------------------


    public static void acelerar() {
        Scanner teclado = new Scanner(System.in);
        //teclado.nextLine();

        System.out.println("Qual velocidade deseja acrescentar?");
        int acrescimo = Integer.parseInt(teclado.nextLine());

        if (Carro.motorLigado) {
            velocidade = velocidade + acrescimo;
            System.out.println();
            System.out.println("<Velocidade aumentada com sucesso>");
            System.out.println();

            if (velocidade > 0 && velocidade < 10) {
                marcha = 1;
            } else if (velocidade >= 10 && velocidade < 30) {
                marcha = 2;
            } else if (velocidade >= 30 && velocidade < 40) {
                marcha = 3;
            } else if (velocidade >= 40 && velocidade < 60) {
                marcha = 4;
            } else if (velocidade >= 60) {
                marcha = 5;
            }
        } else {
            System.out.println("-----------------------------------------------------");
            System.out.println("ALERTA: Não é possível acelerar com o carro desligado");
            System.out.println("-----------------------------------------------------");
        }
    }

    public static void frear() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual velocidade deseja reduzir?");
        int freio = Integer.parseInt(teclado.nextLine());

        if (motorLigado) {
            velocidade = velocidade - freio;
            System.out.println();
            System.out.println("<Velocidade reduzida com sucesso>");
            System.out.println();

            if (velocidade > 0 && velocidade < 10) {
                marcha = 1;
            } else if (velocidade >= 10 && velocidade < 30) {
                marcha = 2;
            } else if (velocidade >= 30 && velocidade < 40) {
                marcha = 3;
            } else if (velocidade >= 40 && velocidade < 60) {
                marcha = 4;
            } else if (velocidade >= 60) {
                marcha = 5;
            }
        } else {
            System.out.println();
            System.out.println("ALERTA: Não é possível diminuir a velocidade com o motor desligado");
        }
    }

    public static void statusCarro() {
        System.out.println();
        System.out.println("----------STATUS----------");
        System.out.println("Velocidade atual: " + velocidade);
        System.out.println("Marcha atual: " + marcha);
        System.out.println();
    }
}
