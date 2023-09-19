package Model;

public class Dinheiro extends Pagamento {
    private int quantidadeDeCedulas;
    
    public Dinheiro(String tipoDePagamento, int quantidadeDeCedulas){
        super(tipoDePagamento);
        this.quantidadeDeCedulas = quantidadeDeCedulas;
    }

    public int getQuantidadeDeCedulas() {
        return quantidadeDeCedulas;
    }

    public void setQuantidadeDeCedulas(int quantidadeDeCedulas) {
        this.quantidadeDeCedulas = quantidadeDeCedulas;
    }
    
    @Override
    public String toString(){
        return "Quantidade de Cédulas: "+quantidadeDeCedulas;
    }
    
    
}
