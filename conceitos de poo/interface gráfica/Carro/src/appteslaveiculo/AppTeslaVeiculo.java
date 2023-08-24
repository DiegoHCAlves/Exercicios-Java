/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appteslaveiculo;
/**
 *
 * @author diego.alves
 */
public class AppTeslaVeiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro gol = new Carro();
        gol.cor = "Vermelho";
        
        System.out.println("Veiculo: " + gol.modelo);
        System.out.println("Veiculo: " + gol.marca);    
        System.out.println("Cor: " + gol.cor);
        System.out.println("Veiculo: " + gol.placa);
        System.out.println("Veiculo: " + gol.anoFabricacao);
        System.out.println("Veiculo: " + gol.AnoModelo);
        System.out.println("Veiculo: " + gol.velocidade);
        System.out.println("status: " + gol.status);
        
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");
        
        Carro palio = new Carro();
        palio.cor = "Branco";
        
        System.out.println("Veiculo: " + palio.modelo);
        System.out.println("Veiculo: " + palio.marca);      
        System.out.println("Cor: " + palio.cor);
        System.out.println("Veiculo: " + palio.placa);
        System.out.println("Veiculo: " + palio.anoFabricacao);
        System.out.println("Veiculo: " + palio.AnoModelo);
        System.out.println("Veiculo: " + palio.velocidade);
        System.out.println("Status: " + palio.status);
        
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");
        
        gol.ligarMotor();
        System.out.println("Status do Gol: " + gol.status);
        System.out.println("Velocidade do Gol : " + gol.velocidade);
        System.out.println("");
        
        gol.acelerar();
        System.out.println("A velocidade agora e " + gol.velocidade);
        
        gol.acelerar();
        System.out.println("A velocidade agora e " + gol.velocidade);
        
        System.out.println("");
        String buzinar = gol.buzinar();
        System.out.println(buzinar);
        System.out.println("");
        
        String status = gol.desligarMotor();
        System.out.println(status);        
        
        gol.frear();
        System.out.println("A velocidade agora e " + gol.velocidade);
        
        gol.frear();
        System.out.println("A velocidade agora e " + gol.velocidade);
        
        status = gol.desligarMotor();
        System.out.println(status);
        
        System.out.println("");
        buzinar = gol.buzinar();
        System.out.println(buzinar);
        System.out.println("");
        
        System.out.println("---------------------------");
        
        System.out.println("");
        String AumentarMarcha = gol.AumentarMarcha();
        System.out.println(AumentarMarcha);
        System.out.println("");
        
        System.out.println("---------------------------");
        System.out.println("");
        AumentarMarcha = gol.AumentarMarcha();
        System.out.println(AumentarMarcha);
        System.out.println("");
        System.out.println("---------------------------");
        
        gol.ligarMotor();
        System.out.println("Status do Gol: " + gol.status);
        System.out.println("Velocidade do Gol : " + gol.velocidade);
        System.out.println("");
        
        gol.acelerar();
        System.out.println("A velocidade agora e " + gol.velocidade);
        
        gol.acelerar();
        System.out.println("A velocidade agora e " + gol.velocidade);
        
        System.out.println("");
        AumentarMarcha = gol.AumentarMarcha();
        System.out.println(AumentarMarcha);
        System.out.println("");
        System.out.println("");
        AumentarMarcha = gol.AumentarMarcha();
        System.out.println(AumentarMarcha);
        System.out.println("");
        
        System.out.println("---------------------------");
        
        System.out.println("");
        String DiminuirMarcha = gol.DiminuirMarcha();
        System.out.println(DiminuirMarcha);
        System.out.println("");
        System.out.println("");
        DiminuirMarcha = gol.DiminuirMarcha();
        System.out.println(DiminuirMarcha);
        System.out.println("");
    }
    
}
