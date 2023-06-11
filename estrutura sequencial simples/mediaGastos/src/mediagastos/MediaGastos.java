/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediagastos;

/**
 *
 * @author diego
 */
public class MediaGastos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gastoJaneiro = 15000;
        double gastoFevereiro = 23000;
        double gastoMarco = 17000;
        
        double despesaTotal = gastoJaneiro + gastoFevereiro + gastoMarco;
        double gastoMedio = despesaTotal/3;
        
        System.out.printf("A despesa total foi de %.2f\nO gasto medio foi de %.2f \n", despesaTotal,gastoMedio);
    }
    
}
