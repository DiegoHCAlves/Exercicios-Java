/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroCarros;

/**
 *
 * @author diego
 */
public class Carro {
    private String nome;
    private String marca;
    private String tipo;
    private String cor;
    private int quilometragem;    
    
    public Carro(String nome, String marca, String tipo, String cor, int quilometragem){
        this.nome = nome;
        this.marca = marca;
        this.tipo = tipo;
        this.cor = cor;
        this.quilometragem = quilometragem;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public int getQuilometragem() {
        return quilometragem;
    }
    
    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }
    
    
}


