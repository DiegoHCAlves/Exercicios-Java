/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conta;

/**
 *
 * @author diego
 */
public class MeuPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciando
        ContaCorrente conta1 = new ContaCorrente("Diego", 111999,29290,"06/09/2023");              
        conta1.mostrarDados();
        //Após depósito
        conta1.deposita(300);        
        conta1.mostrarDados();
        //Após saque
        conta1.saca(200);        
        conta1.mostrarDados();
        
        conta1.separador();
        
        ContaCorrente conta2 = new ContaCorrente("Adriano", 123456,23245,"06/08/2021");              
        conta2.mostrarDados();
        //Após depósito
        conta2.deposita(500);        
        conta2.mostrarDados();
        //Após saque
        conta2.saca(150);        
        conta2.mostrarDados();
        
    }
    
    
}
