package idadeemdias;

import java.util.Scanner;

public class Idadeemdias {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a sua idade");
        int idadeEmAnos = teclado.nextInt();
        int idadeEmDias = idadeEmAnos * 365;
        System.out.println("Isso equivale a " + idadeEmDias + " dias");
          
    }   
}
