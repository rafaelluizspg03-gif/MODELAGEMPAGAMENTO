package MODELAGEMPAGAMENTO;

import java.math.BigDecimal;

public class Checkout {
    private BigDecimal ValorTotal;
    private Pagamento MetodoPagamento;

    public Checkout(BigDecimal valortotal, Pagamento MetodoPagamento){
        this.ValorTotal = valortotal;
        this.MetodoPagamento = MetodoPagamento;
    }

    public void finalizarCompra(){
        System.out.println("\n--- Iniciando checkout de R$ " + ValorTotal + "---");
        MetodoPagamento.processar();
        System.out.println("Status final do pagamento: " + MetodoPagamento.getStatus());
    }
}
