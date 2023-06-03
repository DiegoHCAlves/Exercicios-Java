package mediaponderada;

import java.util.Scanner;


public class Mediaponderada {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua primeira nota");
        float notaUm = teclado.nextFloat();
        System.out.println("Digite sua segunda nota");
        float notaDois = teclado.nextFloat();
        System.out.println("Digite sua terceira nota");
        float notaTres = teclado.nextFloat();
        float mediaPonderada = (notaUm*2 + notaDois*3 + notaTres*5)/10;
        System.out.printf("A media ponderada equivale a %.2f", mediaPonderada);
    }
    
}
