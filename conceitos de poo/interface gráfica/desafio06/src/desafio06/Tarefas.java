/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio06;

/**
 *
 * @author diego.alves
 */
public class Tarefas {

    private String nome;
    private String descricao;
    private Prioridade prioridade;
    private boolean conclusao;

    public Tarefas(String nome, String descricao, String prioridade, boolean conclusao) {
        this.nome = nome;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.conclusao = false;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public boolean isConclusao() {
        return conclusao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public void setConclusao(boolean conclusao) {
        this.conclusao = conclusao;
    }

}
