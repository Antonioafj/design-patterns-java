package br.com.ada.designpattern.adapter.problema;

import java.math.BigDecimal;

public class ClienJarOperacoesContaCorrente {

    private JarOperacoesContaCorrente jocc;

    public ClienJarOperacoesContaCorrente(JarOperacoesContaCorrente jocc){
        this.jocc = jocc;
    }

    public boolean validaSaldo(BigDecimal valorPretendidoSaque){
        return jocc.validaSaldo(valorPretendidoSaque);
    }

    public void saca(BigDecimal valorPretendito){
        jocc.saca(valorPretendito);
    }

    public void deposita(BigDecimal valor){
        jocc.deposita(valor);
    }
}
