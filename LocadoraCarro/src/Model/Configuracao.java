package Model;

public class Configuracao {
    private String arquivoLocacoes;
    private String arquivoVeiculos;
    private String arquivoClientes;
    private String arquivoFuncionarios;
    private String arquivoSeguros;

    public Configuracao(String arquivoLocacoes, String arquivoVeiculos, String arquivoClientes, String arquivoFuncionarios, String arquivoSeguros) {
        this.arquivoLocacoes = arquivoLocacoes;
        this.arquivoVeiculos = arquivoVeiculos;
        this.arquivoClientes = arquivoClientes;
        this.arquivoFuncionarios = arquivoFuncionarios;
        this.arquivoSeguros = arquivoSeguros;
    }

    public String getArquivoLocacoes() {
        return arquivoLocacoes;
    }

    public void setArquivoLocacoes(String arquivoLocacoes) {
        this.arquivoLocacoes = arquivoLocacoes;
    }

    public String getArquivoVeiculos() {
        return arquivoVeiculos;
    }

    public void setArquivoVeiculos(String arquivoVeiculos) {
        this.arquivoVeiculos = arquivoVeiculos;
    }

    public String getArquivoClientes() {
        return arquivoClientes;
    }

    public void setArquivoClientes(String arquivoClientes) {
        this.arquivoClientes = arquivoClientes;
    }

    public String getArquivoFuncionarios() {
        return arquivoFuncionarios;
    }

    public void setArquivoFuncionarios(String arquivoFuncionarios) {
        this.arquivoFuncionarios = arquivoFuncionarios;
    }

    public String getArquivoSeguros() {
        return arquivoSeguros;
    }

    public void setArquivoSeguros(String arquivoSeguros) {
        this.arquivoSeguros = arquivoSeguros;
    }
    
    @Override
    public String toString(){
        return"Arquivo de Locações: "+arquivoLocacoes+
                "\nArquivo de Veícuilos: " +arquivoVeiculos+
                "\nArquivo de Clientes: " +arquivoClientes+
                "\nArquivo de Funcionários: " +arquivoFuncionarios+
                "\nArquivo de Seguros: "+arquivoSeguros;
    }
}

