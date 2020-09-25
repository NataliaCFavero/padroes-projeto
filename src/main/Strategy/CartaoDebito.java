package main.Strategy;

public class CartaoDebito implements FormaPagamentoStrategy {
    @Override
    public Double calcularTaxa(Double valorTotal) {
        return valorTotal * 0.10;
    }
}
