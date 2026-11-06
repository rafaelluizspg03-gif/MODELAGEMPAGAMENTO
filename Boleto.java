package MODELAGEMPAGAMENTO;

import java.math.BigDecimal;
import java.util.UUID;

public class Boleto extends Pagamento {
    private String CodigoDeBarra;

    public Boleto(BigDecimal valor){
        super(valor);
    }

    @Override 
    public void processar(){
        this.CodigoDeBarra = "123456789." + UUID.randomUUID().toString().replace("-", "").substring(0, 16);
        setStatus(StatusPagamento.PENDENTE);
        System.out.println("boleto gerado. código de barras: " + CodigoDeBarra);
        System.out.println("aguardando compensação do pagamento.");
    }

    public String getCodigodeBarras(){
        return CodigoDeBarra;
    }
}
