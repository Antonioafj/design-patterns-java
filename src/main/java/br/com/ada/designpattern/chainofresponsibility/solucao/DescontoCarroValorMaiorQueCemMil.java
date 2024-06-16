package br.com.ada.designpattern.chainofresponsibility.solucao;

import br.com.ada.designpattern.chainofresponsibility.Carro;
import br.com.ada.designpattern.chainofresponsibility.Marca;

import java.math.BigDecimal;

public class DescontoCarroValorMaiorQueCemMil extends DescontoCarro{


    public DescontoCarroValorMaiorQueCemMil(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();

        if (carro.getPreco().compareTo(new BigDecimal(100000)) > 0){
            return valorVenda.subtract(new BigDecimal(10000));
        }
        return proximoDesconto.aplicaDesconto(carro);
    }
}
