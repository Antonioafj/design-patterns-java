package br.com.ada.designpattern.prototype.solucao;

import br.com.ada.designpattern.prototype.Botao;
import br.com.ada.designpattern.prototype.TipoBordaEnum;

public class TesteBotaoPrototype {

    public static void main(String[] args) {
        Botao botaoVermelho = BotaoRegistry.getBotao("BOTAO_VERMELHO");
        System.out.println(botaoVermelho);

        Botao botaoAzul = BotaoRegistry.getBotao("BOTAO_AZUL");
        System.out.println(botaoAzul);

        Botao botaoAmarelo = BotaoRegistry.getBotao("BOTAO_AMARELO");
        System.out.println(botaoAmarelo);
        botaoAmarelo.setLargura(255);
        System.out.println(botaoAmarelo);

        Botao botaoAmarelo2 = BotaoRegistry.getBotao("BOTAO_AMARELO");
        System.out.println(botaoAmarelo2);

        String chave = "BOTAO_ROXO";
        Botao botaoRoxo = new Botao();
        botaoRoxo.setCor("Roxo");
        botaoRoxo.setAltura(50);
        botaoRoxo.setLargura(300);
        botaoRoxo.setTipoBorda(TipoBordaEnum.FINA);

        BotaoRegistry.addRegistry(chave, botaoRoxo);

        Botao botaoRoxoClone = BotaoRegistry.getBotao("BOTAO_ROXO");
        System.out.println(botaoRoxo);

    }

}
