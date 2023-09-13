/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatura;

/*1)Crie uma classe chamada fatura para uma loja de suprimentos de informática. A classe deve conter quatro atributos: número, 
descrição, quantidade comprada de um item e o preço por item. A classe deve ter um método construtor e um método get e set para cada 
variável de instância. Além disso, forneça um método chamado getTotalFatura que calcula o valor da fatura e depois retorna o valor como 
um double. Se o valor não for positivo, ele deve ser configurado como 0. Se o preço por item não for positivo, ele deve ser configurado como 0. 
Escreva uma classe de teste chamado FaturaTeste que demonstra as capacidades da classe TesteFatura.  */

public class Fatura {
    private int numeroItem = 0;
    private String descricaoItem;
    private int quantidadeComprada;
    private double precoItem;
    
public Fatura(int numeroItem, String descricaoItem, int quantidadeComprada, double precoItem) {
    /*int sequencia = 1;
    numeroItem = sequencia;
    sequencia++;*/
    this.numeroItem = numeroItem;
    this.descricaoItem = descricaoItem;
    this.quantidadeComprada = quantidadeComprada;   
    this.precoItem = precoItem;
    if (precoItem < 0) {
        this.precoItem = 0;
    }
}
    
public int getNumeroItem() {
    return numeroItem;
}

public String getDescricaoItem() {
    return descricaoItem;
}

public int getQuantidadeComprada() {
    if (quantidadeComprada < 0) {
        quantidadeComprada = 0;
    }
    return quantidadeComprada;
}

public double getPrecoItem() {
    return precoItem;
}

public void setNumeroItem(int numeroItem) {
    this.numeroItem = numeroItem;
}

public void setDescricaoItem(String descricaoItem) {
    this.descricaoItem = descricaoItem;
}

public void setQuantidadeComprada(int quantidadeComprada) {
    this.quantidadeComprada = quantidadeComprada;
}

public void setPrecoItem(double precoItem) {
    this.precoItem = precoItem;
}

public double getTotalFatura() {
    double totalFatura = this.quantidadeComprada * this.precoItem; 
    if (totalFatura <0){
        totalFatura = 0;
    }
    return totalFatura;
}

public void MostrarDados() {
    System.out.println("-----Item-----");
        System.out.println("Identificador: " + this.getNumeroItem());
        System.out.println("Descricao: " + this.getDescricaoItem());
        System.out.println("Quantidade: " + this.getQuantidadeComprada());
        System.out.println("Preco: " + this.getPrecoItem());
        System.out.println("Total: " + this.getTotalFatura());
        System.out.println("");
}

}
