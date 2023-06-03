package porcentagemlucro;

import java.util.Scanner;

public class Porcentagemlucro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de fabrica de um produto");
        float valorFabrica = teclado.nextFloat();
        System.out.println("Qual porrcentagem de lucro deseja ter? (sem %)");
        float porcentagemLucro = teclado.nextFloat();
        float valorFinal = valorFabrica*(porcentagemLucro/100) + valorFabrica;
        System.out.println("O preço final do produto e " + valorFinal);
        
    }
    
}
