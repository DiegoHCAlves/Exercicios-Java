/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appteslaveiculo;

/**
 *
 * @author diego.alves
 */
public class Carro {

    String cor;
    String marca;
    String modelo;
    String combustivel;
    String placa;
    int anoFabricacao;
    int AnoModelo;
    int velocidade;
    boolean status;

    public void ligarMotor() {
        if (status == true) {
            status = false;
        } else {
            status = true;
        }
    }

    public String desligarMotor() {
        if (this.velocidade == 0) {
            this.status = false;

            return "O motor foi desligado com Sucesso!";
        }
        return "O motor não foi desligado pois o carro esta em movimento";
    }

    public void acelerar() {
        velocidade = velocidade + 10;
    }
    
    public void frear() {
        velocidade = velocidade - 10;
    }
    
    public String buzinar() {
        if (this.status == false){
            return "Nao foi possivel buzinar pois o carro esta desligado";
        }
        return "Beee!";
    }
    int marcha = 0;
    
    public String AumentarMarcha() {
        if (this.status == false){
            return "Nao foi possivel trocar a marcha pois o carro esta desligado";
        }
        marcha++;
        
        return "A marcha foi trocada. A marcha atual e " + marcha;
        
    }
    
    public String DiminuirMarcha() {
        if (this.status == false){
            return "Nao foi possivel trocar a marcha pois o carro esta desligado";
        }
        marcha--;
        return "A marcha foi trocada. A marcha atual e " + marcha;
        
    }
    
}
