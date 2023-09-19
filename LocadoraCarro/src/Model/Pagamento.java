package Model;


public abstract class Pagamento {
    private String tipoDePagamento;

    public Pagamento(String tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

    public String getTipoDePagamento() {
        return tipoDePagamento;
    }

    public void setTipoDePagamento(String tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }
    
    @Override
    public String toString(){
        return "Tipo de Pagamento: " +tipoDePagamento;
    }
    
}
