package Model;

import java.time.LocalDate;
        
public class Cliente extends Usuario{
    protected String categoriaCNH;
    protected String numeroCNH;
    protected LocalDate validadeCNH;
    protected boolean clienteOuro;

    public Cliente(String categoriaCNH, String numeroCNH, LocalDate validadeCNH, boolean clienteOuro, int codigoUsuario, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String email) {
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, email);
        this.categoriaCNH = categoriaCNH;
        this.numeroCNH = numeroCNH;
        this.validadeCNH = validadeCNH;
        this.clienteOuro = clienteOuro;
    }

    public String getCategoriaCNH() {
        return categoriaCNH;
    }

    public void setCategoriaCNH(String categoriaCNH) {
        this.categoriaCNH = categoriaCNH;
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

    public LocalDate getValidadeCNH() {
        return validadeCNH;
    }

    public void setValidadeCNH(LocalDate validadeCNH) {
        this.validadeCNH = validadeCNH;
    }

    public boolean isClienteOuro() {
        return clienteOuro;
    }

    public void setClienteOuro(boolean clienteOuro) {
        this.clienteOuro = clienteOuro;
    }
    
    @Override
    public String toString(){
        return  "Categoria CNH: " +categoriaCNH+
                "Numero da CNH: " +numeroCNH+
                "Validade da CNH " +validadeCNH+
                "Cliente: " +clienteOuro;                
    }
    
    
}
