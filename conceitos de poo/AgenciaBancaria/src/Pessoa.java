public class Pessoa {
    private int ID = 1;
    private String nome;
    private String cpf;
    private String email;

    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        ID += 1;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setNome() {
        this.nome = nome;
    }

    public void setCpf() {
        this.cpf = cpf;
    }

    public void setEmail() {
        this.email = email;
    }

    public String toString() {
        return "\nNome: " + this.getNome() +
                "\nCPF: " + this.getCpf() +
                "\nEmail: " + this.getEmail();
    }
}
