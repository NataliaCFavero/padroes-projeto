package test;

import main.Strategy.CartaoCredito;
import main.Strategy.CartaoDebito;
import main.Strategy.Pagamento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoTest {

    @Test
    void calcularJurosCartaoDeCredito() {
        Pagamento pagamento = new Pagamento(new CartaoDebito());
        final Double valorJuros = pagamento.calcularTarifa(10.0);
        assertEquals(1.0, valorJuros);
    }

    @Test
    void calcularJurosCartaoDeDebito() {
        Pagamento pagamento = new Pagamento(new CartaoCredito());
        final Double valorJuros = pagamento.calcularTarifa(10.0);
        assertEquals(3.0, valorJuros);
    }
}