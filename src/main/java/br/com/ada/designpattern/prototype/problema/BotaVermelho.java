package br.com.ada.designpattern.prototype.problema;

import br.com.ada.designpattern.prototype.Botao;
import br.com.ada.designpattern.prototype.TipoBordaEnum;

public class BotaVermelho extends Botao {

    public BotaVermelho(){
        setCor("Vermelha");
        setAltura(30);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.FINA);
    }

}
