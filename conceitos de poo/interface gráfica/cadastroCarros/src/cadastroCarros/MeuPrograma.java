/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastroCarros;

import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro[] carros = new Carro[10];
        int i = 0;

        while (true) {
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do carro:");
            String marca = JOptionPane.showInputDialog(null, "Digite a marca do carro:");
            String tipo = JOptionPane.showInputDialog(null, "Digite o tipo do carro:");
            String cor = JOptionPane.showInputDialog(null, "Digite a cor do carro:");
            int quilometragem = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quilometragem do carro:"));

            Carro carro = new Carro(nome, marca, tipo, cor, quilometragem);
           
            int opcao = JOptionPane.showConfirmDialog(null,"Deseja cadastrar outro carro?");

            carros[i] = carro;
            i++;

            if (opcao != JOptionPane.YES_OPTION) {
                break;
            }
        }
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Carros cadastrados:\n");

        for (int j = 0; j < i; j++) {
            Carro carro = carros[j];
            mensagem.append("Carro ").append(j + 1).append(":\n")
                    .append("Nome: ").append(carro.getNome()).append("\n")
                    .append("Marca: ").append(carro.getMarca()).append("\n")
                    .append("Tipo: ").append(carro.getTipo()).append("\n")
                    .append("Cor: ").append(carro.getCor()).append("\n")
                    .append("Quilometragem: ").append(carro.getQuilometragem()).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, mensagem.toString());

    }

}
