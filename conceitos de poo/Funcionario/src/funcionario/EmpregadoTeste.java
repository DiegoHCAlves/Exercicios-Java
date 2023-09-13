/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionario;

/**
 *
 * @author diego.alves
 */
public class EmpregadoTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario funcionarioUm = new Funcionario("Diego",30,"Developer",7,15000);        
        funcionarioUm.mostrarDados();
        
        Funcionario funcionarioDois = new Funcionario("Gabriel",22,"Developer",17,10000);        
        funcionarioDois.mostrarDados();
        
        
        
    }
    
}
