public class Main {
    public static void main(String[] args) {

        int nota1 = 7;
        int nota2 = 0;
        int media = (nota1 + nota2) / 2;

        String resultado = media >= 7 ? "Aprovado" : media < 7 && media >= 4 ? "Recuperacao" : "Reprovado";
        System.out.println("Voce esta " + resultado);

    }
}