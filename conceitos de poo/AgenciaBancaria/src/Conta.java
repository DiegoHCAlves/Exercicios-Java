import utilitarios.Utils;

public class Conta {
    public static int contador = 1;
    private int numero;
    private Pessoa pessoa;
    private double saldo = 0.00;

    public Conta(Pessoa pessoa) {
        this.numero = contador;
        this.pessoa = pessoa;
        contador++;
    }

    public int getNumero() {
        return numero;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return  "\nNumero da conta: " + this.getNumero() +
                "\nNome: " + this.pessoa.getNome() +
                "\nCPF: " + this.pessoa.getCpf() +
                "\nEmail: " + this.pessoa.getEmail() +
                "\nSaldo: " + Utils.doubleToString(this.getSaldo()) +
                "\n";
    }

    public void depositar(Double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o depósito");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && this.getSaldo() >= valor) {
            setSaldo((getSaldo() - valor));
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o saque");
        }
    }

    public void transferir(Conta contaParaDeposito, double valor) {
        if (valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);

            contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Não foi possível realizar a transferência");
        }
    }
}
