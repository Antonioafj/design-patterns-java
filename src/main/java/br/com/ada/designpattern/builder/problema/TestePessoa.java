package br.com.ada.designpattern.builder.problema;

import br.com.ada.designpattern.builder.Pessoa;

import java.time.LocalDate;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Antonio",
                "Alves",
                "87465834",
                "natonio@gmail.com",
                "nenneco", LocalDate.of(1986, 9, 11));

        System.out.println(pessoa);
    }
}
