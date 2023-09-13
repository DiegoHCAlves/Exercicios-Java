package cliente;

public class Cliente {
    private String nome;
    private String endereco;
    private double renda;
    private String profissao;

    public Cliente(){

    }

    public Cliente(String nome, String endereco, double renda, String profissao){
        this.nome = nome;
        this.endereco = endereco;
        this.renda = renda;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda){
        this.renda = renda;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public void dadosCliente(){
        System.out.println("\nDADOS DO CLIENTE\n"+
                "Nome: " + getNome() + "\n"+
                "Endereço: " + getEndereco() + "\n"+
                "Renda: R$ " + getRenda() + "\n"+
                "Profissão: " + getProfissao() + "\n");
    }
}