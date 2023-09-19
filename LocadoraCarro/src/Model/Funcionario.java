package Model;

import java.time.LocalDate;


public class Funcionario extends Usuario{
    protected float salario;
    protected String pis;
    protected LocalDate dataAdmissao;

    public Funcionario(float salario, String pis, LocalDate dataAdmissao, int codigoUsuario, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String email) {
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, email);
        this.salario = salario;
        this.pis = pis;
        this.dataAdmissao = dataAdmissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    @Override
    public String toString(){
        return "Salário: " +salario+
                "\nPis: " +pis+
                "\nData de Admissão: " +dataAdmissao;
    }
}
