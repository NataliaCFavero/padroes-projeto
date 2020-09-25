package main.Strategy;


public class Pagamento {
    FormaPagamentoStrategy formaPagamento;

    public Pagamento(FormaPagamentoStrategy formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Double calcularTarifa(Double valorTotal) {
        return this.formaPagamento.calcularTaxa(valorTotal);
    }
}

