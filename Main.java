package MODELAGEMPAGAMENTO;

import java.math.BigDecimal;


public class Main {
    public static void main(String[] args){
        BigDecimal valorCompra = new BigDecimal("1000.00");

        Pagamento cartao = new CartaoCredito(valorCompra, "123-456-789-1011", "Rafael Luiz", "126", new BigDecimal("200.00"));
        Checkout checkoutCartao = new Checkout(valorCompra, cartao);
        checkoutCartao.finalizarCompra();

        Pagamento pix = new Pix(valorCompra);
        Checkout checkoutPix = new Checkout(valorCompra, pix);
        checkoutPix.finalizarCompra();

        Pagamento boleto = new Boleto(valorCompra);
        Checkout checkoutBoleto = new Checkout(valorCompra, boleto);
        checkoutBoleto.finalizarCompra();
    }
}