# padroes-projeto
Este projeto tem como objetivo colocar em prática os padrões de projeto
 que estão sendo estudados ao longo desse tempo de isolamento que a pandemia (COVID-19) de 2020  
 está causando.
 Não esqueça de conferir os teste para ver modo de uso do padrão.
  
  Lembrando que cada projeto vai ter sua adaptação do Pattern dependendo da sua necessidade.
## Strategy
#### Classificação
 > Comportamental
#### Objetivo
 > Permitir que o algoritmo mude independente do cliente que está fazendo seu uso;
> Ajudar a diminuir ou remover lógicas condicionais; Permitir que um algoritmo seja substituído 
>por outro em tempo de execução.
#### O dilema
```js
public Double calcularTarfifa(String tipoPagamento, Double valorTotal) {
        if (tipoPagamento.equals("CARTAO_DEBITO")) {
            return valorTotal * 0.10;
        } else if (tipoPagamento.equals("CARTAO_CREDITO")) {
            return valorTotal * 0.30;
        }
    }
```
#### Diagrama de classe
[![Product Name Screen Shot][strategy]](https://example.com)


<!-- MARKDOWN LINKS & IMAGES -->
[strategy]: images/strategy.png