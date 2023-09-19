package Model;

public class VeiculoNacional extends Veiculo {
    protected float taxaImpostoEstadual;
    
    public VeiculoNacional(int codigoVeiculo, String nomeModelo, String montadora, int anoFabricacao, int anoModelo, String placa, String categoria, float valorFipe, float valorDiaria, String categoriaCNHNecessaria, boolean alugado, float taxaImpostoEstadual){
        super(codigoVeiculo, nomeModelo, montadora, anoFabricacao, anoModelo, placa, categoria, valorFipe, valorDiaria, categoriaCNHNecessaria, alugado);
        this.taxaImpostoEstadual = taxaImpostoEstadual;
    }
    
    public float getTaxaImpostoEstadual(){
        return taxaImpostoEstadual;
    }
    
    public void setTaxaImpostoEstadual(float taxaImpostoEstadual){
        this.taxaImpostoEstadual = taxaImpostoEstadual;
    }
    
    public double calcularValorDiaria(){
        return valorDiaria + (valorDiaria * taxaImpostoEstadual / 100);
        
    }
    
    @Override
    public String toString(){
        return "Taxa de imposto estadual: " +taxaImpostoEstadual;
    }
    
}
