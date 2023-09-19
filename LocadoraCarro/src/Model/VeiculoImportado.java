package Model;

public class VeiculoImportado extends Veiculo {
    protected float taxaImpostoEstadual;
    protected float taxaImpostoFederal;
     public VeiculoImportado(int codigoVeiculo, String nomeModelo, String montadora, int anoFabricacao, int anoModelo, String placa, String categoria, float valorFipe, float valorDiaria, String categoriaCNHNecessaria, boolean alugado, float taxaImpostoEstadual, float taxaImpostoFederal){
        super(codigoVeiculo, nomeModelo, montadora, anoFabricacao, anoModelo, placa, categoria, valorFipe, valorDiaria, categoriaCNHNecessaria, alugado);
        this.taxaImpostoEstadual = taxaImpostoEstadual;
        this.taxaImpostoFederal = taxaImpostoFederal;
    }

    public float getTaxaImpostoEstadual() {
        return taxaImpostoEstadual;
    }

    public void setTaxaImpostoEstadual(float taxaImpostoEstadual) {
        this.taxaImpostoEstadual = taxaImpostoEstadual;
    }

    public float getTaxaImpostoFederal() {
        return taxaImpostoFederal;
    }

    public void setTaxaImpostoFederal(float taxaImpostoFederal) {
        this.taxaImpostoFederal = taxaImpostoFederal;
    }
    
    public double calcularValorDiaria() {
        double valorComImpostoEstadual = valorDiaria + (valorDiaria * taxaImpostoEstadual / 100);
        double valorComImpostoFederal = valorComImpostoEstadual + (valorComImpostoEstadual * taxaImpostoFederal / 100);
        return valorComImpostoFederal;
    }
    
    @Override
    public String toString(){
        return"Taxa de imposto estadual: "+taxaImpostoEstadual+
              "\nTaxa de imposto federal"+taxaImpostoFederal;
    }
    
}
