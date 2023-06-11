/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediagastos;

/**
 *
 * @author diego
 */
public class meuPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gastos gastos = new Gastos(15000,23000,17000);
       
        System.out.printf("A despesa total foi de %.2f\nA despesa media foi de %.2f \n", 
                gastos.gastoTotal(),gastos.gastoMedio());
    }
    
}
