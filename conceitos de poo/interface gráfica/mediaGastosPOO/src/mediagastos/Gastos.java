/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediagastos;

/**
 *
 * @author diego
 */
public class Gastos {
    private double gastoJaneiro;
    private double gastoFevereiro;
    private double gastoMarco;
    
    public Gastos(double gastoJaneiro, double gastoFevereiro, double gastoMarco){
        this.gastoJaneiro = gastoJaneiro;
        this.gastoFevereiro = gastoFevereiro;
        this.gastoMarco = gastoMarco;
    }
    
    public double gastoMedio(){
        return gastoJaneiro + gastoFevereiro + gastoMarco;
    }
    
    public double gastoTotal(){
        return gastoMedio()/3;
    }
    
}
