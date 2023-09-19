package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
        
public class Locacao {
    private int codigoLocacao;
    private Cliente codigoCliente;
    private Funcionario codigoFuncionario;
    private LocalDate dataLocacao;
    private LocalDate dataDevolucao;
    private float valorTotal;
    private Pagamento formaPagamento;
    private static ArrayList<Seguro> segurosContratados = new ArrayList();
    private boolean finalizada;

    public Locacao(int codigoLocacao, Cliente codigoCliente, Funcionario codigoFuncionario, LocalDate dataLocacao, LocalDate dataDevolucao, float valorTotal, Pagamento formaPagamento, boolean finalizada) {
        this.codigoLocacao = codigoLocacao;
        this.codigoCliente = codigoCliente;
        this.codigoFuncionario = codigoFuncionario;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.finalizada = finalizada;
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

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Pagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public static ArrayList<Seguro> getSegurosContratados() {
        return segurosContratados;
    }

    public static void setSegurosContratados(ArrayList<Seguro> segurosContratados) {
        Locacao.segurosContratados = segurosContratados;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }
    
    /*public float calcularValorTotal() {
        Iterator<ItemVenda> iterator = itensVenda.iterator();
        float valor=0;
        while (iterator.hasNext()) {
            if(cliente.getOuro() == true){
               valor = valor + iterator.next().calcularTotalOuro();
            } else {
               valor = valor + iterator.next().calcularTotal();
            }
        } return valor;
    }*/
    
}
