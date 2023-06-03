package realparainteiro;

import java.util.Scanner;


public class Realparainteiro {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor real");
        float valorReal = teclado.nextFloat();
        int valorInteiro = (int) Math.floor(valorReal);
        System.out.println("A parte inteira deste valor e " + valorInteiro);
        
    }
    
}
