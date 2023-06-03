package medianotas;

import java.util.Scanner;

public class Medianotas {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        float notaUm = teclado.nextFloat();
        System.out.println("Digite a segunda nota");
        float notaDois = teclado.nextFloat();
        System.out.println("Digite a terceira nota");
        float notaTres = teclado.nextFloat();
        System.out.println("Digite a quarta nota");
        float notaQuatro = teclado.nextFloat();
        float media = (notaUm + notaDois + notaTres + notaQuatro)/4;
        System.out.println("A media dessas notas e igual a " + media);
                
    }
    
}
