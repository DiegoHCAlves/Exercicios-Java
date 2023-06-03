
package salario.liquido;
// 8% inss e 5% IR
import java.util.Scanner;

public class SalarioLiquido {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu salário bruto");
        float salarioBruto = teclado.nextFloat();
        float descontoInss = salarioBruto*0.08f;
        float descontoIR = salarioBruto*0.05f;
        float salarioLiquido = salarioBruto - descontoInss - descontoIR;
        System.out.println("O seu salario liquido equivale a R$" + salarioLiquido);
                     
    }
    
}
