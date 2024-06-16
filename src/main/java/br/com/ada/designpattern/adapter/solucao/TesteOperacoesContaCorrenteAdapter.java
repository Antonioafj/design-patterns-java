package br.com.ada.designpattern.adapter.solucao;

import br.com.ada.designpattern.adapter.problema.ClienJarOperacoesContaCorrente;
import br.com.ada.designpattern.adapter.problema.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrenteAdapter {

    public static void main(String[] args) {

        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();

        JarOperacoesContaCorrenteAdapter jarContaAdapter = new JarOperacoesContaCorrenteAdapter(jarConta);

        ClientJarOperacoesContaCorrenteAdapter client = new ClientJarOperacoesContaCorrenteAdapter(jarContaAdapter);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);


                client.saca(valorPretendidoParaSaque);

            client.deposita(new BigDecimal(500));
    }
}
