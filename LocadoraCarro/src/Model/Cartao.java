package Model;

public class Cartao extends Pagamento {
    private String nome;
    private String bandeira;
    private String numero;
    private int cvv;
    
    public Cartao(String tipoDePagamento, String nome, String bandeira, String numero, int cvv){
        super(tipoDePagamento);
        this.nome = nome;
        this.bandeira = bandeira;
        this.numero = numero;
        this.cvv = cvv;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    
    @Override
    public String toString(){
        return "Nome: " +nome+
                "\nBandeira: "+bandeira+
                "\nNúmero do cartão: "+numero+
                "\nCVV: "+cvv;
    }
    
}
