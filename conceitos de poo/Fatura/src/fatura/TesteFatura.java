/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatura;

/**
 *
 * @author diego.alves
 */
public class TesteFatura {
    public static void main(String[] args) {
        
        Fatura faturaUm = new Fatura(01,"Apagador", 2,15);        
        faturaUm.MostrarDados();
        
        Fatura faturaDois = new Fatura(02,"Caneta", -5,5);        
        faturaDois.MostrarDados();
        
        Fatura faturaTres = new Fatura(02,"Lapis", 2,-10);
        faturaTres.MostrarDados();
        
    }
    
}
