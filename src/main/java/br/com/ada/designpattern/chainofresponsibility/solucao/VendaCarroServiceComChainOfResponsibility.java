package br.com.ada.designpattern.chainofresponsibility.solucao;

import br.com.ada.designpattern.chainofresponsibility.Carro;
import br.com.ada.designpattern.chainofresponsibility.Marca;

import java.math.BigDecimal;

public class VendaCarroServiceComChainOfResponsibility {

    public BigDecimal calculaValorVenda(Carro carro){
        DescontoCarroFIAT desconto = new DescontoCarroFIAT(
                new DescontoCarroFORD(
                        new DescontoCarroValorMaiorQueCemMil(
                                new SemDireitoADesconto(null)

                        )));
        return desconto.aplicaDesconto(carro);
    }
}
