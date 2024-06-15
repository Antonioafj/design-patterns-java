package br.com.ada.designpattern.builder.solucao;

import br.com.ada.designpattern.builder.Pessoa;

import java.time.LocalDate;

public class TestePessoaComBuilder {

    public static void main(String[] args) {
        Pessoa pessoa =
                new PessoaBuilder()
                .nome("Antonio")
                .sobreNome("Alves")
                .documento("834657")
                        .apelido("neneco")
                .email("fadlfkl@gmailcom")
                .dataNascimento(LocalDate.of(1986, 9, 11))
                .build();

        System.out.println(pessoa);

        StringBuilder sb = new StringBuilder().append("Ferreira ").append(" Junior");
        System.out.println(sb);

    }
}
