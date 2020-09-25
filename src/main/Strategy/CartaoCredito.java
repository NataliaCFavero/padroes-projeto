package main.Strategy;

public class CartaoCredito implements FormaPagamentoStrategy {
    @Override
    public Double calcularTaxa(Double valorTotal) {
        return valorTotal * 0.30;
    }
}
