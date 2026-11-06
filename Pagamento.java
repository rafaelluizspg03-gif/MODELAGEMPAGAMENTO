package MODELAGEMPAGAMENTO;

import java.math.BigDecimal;

public abstract class Pagamento {
    private BigDecimal valor;
    private StatusPagamento status;

    public Pagamento(BigDecimal valor){
        this.valor = valor;
        this.status = StatusPagamento.PENDENTE;
    }

    public abstract void processar();

    public BigDecimal getValor(){
        return valor;
    }

    public StatusPagamento getStatus(){
        return status;
    }

    protected void setStatus(StatusPagamento status){
        this.status = status;
    }
}
