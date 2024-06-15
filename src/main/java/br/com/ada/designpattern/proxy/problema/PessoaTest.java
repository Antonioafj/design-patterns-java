package br.com.ada.designpattern.proxy.problema;

import br.com.ada.designpattern.builder.Pessoa;
import br.com.ada.designpattern.proxy.PessoaRepository;
import br.com.ada.designpattern.proxy.PessoaService;

import java.time.LocalDate;

public class PessoaTest {

    public static void main(String[] args) {

        /*PessoaService pessoaService = new PessoaService(new PessoaRepository());

        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .sobreNome("Ferreira")
                .dataNascimento(LocalDate.of(1986,9,11))
                .nome("Antoni")
                .apelido("Neneco")
                .build();

        pessoaService.save(pessoa);

        Pessoa pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);
        */
    }
}
