package Model;

import java.time.LocalDate;
import java.util.ArrayList;
        
public class Locacao {
    private int codigoLocacao;
    private Cliente codigoCliente;
    private Funcionario codigoFuncionario;
    private LocalDate dataLocacao;
    private LocalDate dataDevolucao;
    private float valorTotal;
    private Pagamento formaPagamento;
    private ArraylList <Seguro> segurosContratados;
    
    
}
