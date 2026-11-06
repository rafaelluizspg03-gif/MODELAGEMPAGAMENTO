package MODELAGEMPAGAMENTO;

import java.math.BigDecimal;

public class CartaoCredito extends Pagamento {
    private String numero;
    private String titular;
    private String CVV;
    private BigDecimal limiteDisponivel;

    public CartaoCredito(BigDecimal valor, String numero, String titular, String CVV, BigDecimal limiteDisponivel){
        super(valor);
        this.numero = numero;
        this.titular= titular;
        this.CVV = CVV;
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public void processar(){
        if(validarLimite()){
            this.limiteDisponivel = this.limiteDisponivel.subtract(getValor());
            setStatus(StatusPagamento.APROVADO);
            System.out.println("pagamento via cartão de crédito APROVADO para o titular " + titular);
        }else{
            setStatus(StatusPagamento.RECUSADO);
            System.out.println("pagamento via cartão de crédito RECUSADO: limite insuficiente");
        }
    }

    private boolean validarLimite(){
        return limiteDisponivel.compareTo(getValor()) >= 0;
    }
}
