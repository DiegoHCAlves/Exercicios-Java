/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conta;

/**
 *
 * @author diego
 */
public class ContaCorrente {
    private String nome;
    private int numero;
    private int agencia;
    private double saldo = 1000;
    private String dataDeAbertura;
    
    public ContaCorrente() {
        
    }
    
    public ContaCorrente(String nome, int numero, int agencia, String dataDeAbertura) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.dataDeAbertura = dataDeAbertura;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public int getAgencia() {
        return agencia;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getDataDeAbertura() {
        return dataDeAbertura;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void setDataDeAbertura(String dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }
    
    public void mostrarDados() {
        System.out.println("------------CONTA------------");
        System.out.println("Nome: " + nome);
        System.out.println("Numero: " + numero);
        System.out.println("Agencia: " + agencia);
        System.out.println("Saldo: " + saldo);
        System.out.println("DataDeAbertura: " + dataDeAbertura);
        System.out.println("Rendimento: " + calculaRendimento());
    }
    
    public void deposita(double deposita) {
        this.saldo = deposita + this.saldo;
    }
    
    public void saca(double saca) {
        this.saldo = this.saldo - saca;
    } 
    
    public double calculaRendimento(){
        double rendimento = this.saldo*0.1;
        return rendimento;
    }
    
    public void separador(){
        System.out.println("                                  ");
        System.out.println("------------CONTA DOIS------------");
        System.out.println("                                  ");
    }
    
}
