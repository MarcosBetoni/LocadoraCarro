package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.time.Period;

public class Locacao {
    private int codigoLocacao;
    private Veiculo veiculo;
    private Cliente codigoCliente;
    private Funcionario codigoFuncionario;
    private LocalDate dataLocacao;
    private LocalDate dataDevolucao;
    private float valorFinal;
    private Pagamento formaPagamento;
    private ArrayList<Seguro> segurosContratados;
    private boolean finalizada;

    public Locacao(int codigoLocacao, Cliente codigoCliente, Funcionario codigoFuncionario, LocalDate dataLocacao, LocalDate dataDevolucao, float valorFinal, Pagamento formaPagamento, boolean finalizada) {
        this.codigoLocacao = codigoLocacao;
        this.codigoCliente = codigoCliente;
        this.codigoFuncionario = codigoFuncionario;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.valorFinal = valorFinal;
        this.formaPagamento = formaPagamento;
        this.finalizada = finalizada;
        this.segurosContratados = new ArrayList<>();
    }

    public int getCodigoLocacao() {
        return codigoLocacao;
    }

    public void setCodigoLocacao(int codigoLocacao) {
        this.codigoLocacao = codigoLocacao;
    }

    public Cliente getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Cliente codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Funcionario getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(Funcionario codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public float getValorFinal() {
        return valorFinal;
    }

    public void setValorTotal(float valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Pagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public  ArrayList<Seguro> getSegurosContratados() {
        return segurosContratados;
    }

    public void setSegurosContratados(ArrayList<Seguro> segurosContratados) {
        this.segurosContratados = segurosContratados;
    }
    
    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }
    
    
    public float calcularValorTotal() {
        long periodoAluguel;
        periodoAluguel = Math.abs(this.dataDevolucao.toEpochDay() - this.dataLocacao.toEpochDay());
        float valorSeguros = 0;
        for (Seguro seguro : this.segurosContratados){
            valorSeguros = valorSeguros + seguro.getValor();
        }
        
       this.valorFinal = periodoAluguel * this.veiculo.getValorDiaria() + valorSeguros;
       return valorFinal;
        
    }
    
    /*public boolean possuiSeguro(){
        
        
    }*/
}
