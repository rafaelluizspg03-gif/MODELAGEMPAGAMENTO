package MODELAGEMPAGAMENTO;

import java.math.BigDecimal;
import java.util.UUID;

public class Pix extends Pagamento {
    private String chaveCopiarEColar;

    public Pix(BigDecimal valor){
        super(valor);
    }

    @Override 
    public void processar(){
        this.chaveCopiarEColar = UUID.randomUUID().toString();
        setStatus(StatusPagamento.APROVADO);
        System.out.println("Chave Pix Copiar e Colar gerada: " + chaveCopiarEColar);
        System.out.println("Pagamento via PIx APROVADO no valor de R$ " + getValor());
    }

    public String getchaveCopiarEColar(){
        return chaveCopiarEColar;
    }
}
