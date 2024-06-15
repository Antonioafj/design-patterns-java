package br.com.ada.designpattern.prototype.solucao;

import br.com.ada.designpattern.prototype.Botao;
import br.com.ada.designpattern.prototype.TipoBordaEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BotaoRegistry {

    private static BotaoRegistry botaoResgistry;

    private static Map<String, Botao> RESGISTRY = new HashMap<>();

    static {

        Botao botaoAmarelo = new Botao();
        botaoAmarelo.setCor("Amarelo");
        botaoAmarelo.setAltura(40);
        botaoAmarelo.setLargura(100);
        botaoAmarelo.setTipoBorda(TipoBordaEnum.TRACEJADA);

        Botao botaoAzul = new Botao();
        botaoAzul.setCor("Azul");
        botaoAzul.setAltura(35);
        botaoAzul.setLargura(125);
        botaoAzul.setTipoBorda(TipoBordaEnum.TRACEJADA);


        Botao botaoVermelho = new Botao();
        botaoVermelho.setCor("Vermelha");
        botaoVermelho.setAltura(30);
        botaoVermelho.setLargura(100);
        botaoVermelho.setTipoBorda(TipoBordaEnum.FINA);

        RESGISTRY.put("BOTAO_VERMELHO", botaoVermelho);
        RESGISTRY.put("BOTAO_AMARELO", botaoAmarelo);
        RESGISTRY.put("BOTAO_AZUL", botaoAzul);

    }

    public static BotaoRegistry getInstance(){
        if (Objects.isNull(botaoResgistry)){
            botaoResgistry = new BotaoRegistry();
            return  botaoResgistry;
        }
        return botaoResgistry;
    }

    public static Botao getBotao(String chave){
        return BotaoFactory.getInstance(RESGISTRY.get(chave));
    }

    public static void addRegistry(String chave, Botao botao) {
        RESGISTRY.put(chave, botao);
    }
}
