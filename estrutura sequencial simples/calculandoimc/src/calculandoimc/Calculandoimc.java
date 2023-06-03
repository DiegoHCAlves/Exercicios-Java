
package calculandoimc;

import java.util.Scanner;


public class Calculandoimc {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe sua altura");
        float altura = teclado.nextFloat();
        System.out.println("Digite seu peso");
        float peso = teclado.nextFloat();
        double IMC = peso / Math.pow(altura,2);
        System.out.printf("Seu IMC equivale a %.2f", IMC);
    }
    
}
