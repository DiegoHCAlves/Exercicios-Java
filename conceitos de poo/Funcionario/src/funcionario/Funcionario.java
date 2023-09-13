/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

/**
 *
 * @author diego.alves
 */
public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private int numeroMatricula;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, int idade, String cargo, int numeroMatricula, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.numeroMatricula = numeroMatricula;
        this.salario = salario;
    }    

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCargo() {
        return cargo;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void mostrarDados() {
        System.out.println("-----Item-----");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Matricula: " + this.getNumeroMatricula());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Salario reajustado: " + this.aumento());
        System.out.println("");
    }
    
    public double aumento() {
        double NovoSalario = this.salario*1.1;
        return NovoSalario;
    }
    
}
