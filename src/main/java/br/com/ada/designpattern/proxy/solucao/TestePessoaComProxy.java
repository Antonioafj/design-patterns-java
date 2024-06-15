package br.com.ada.designpattern.proxy.solucao;

import br.com.ada.designpattern.builder.Pessoa;
import br.com.ada.designpattern.proxy.PessoaService;

import java.time.LocalDate;

public class TestePessoaComProxy {

    public static void main(String[] args) {

        PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();

        NovoPessoaRepositoryProxy novoPessoaRepositoryProxy = new NovoPessoaRepositoryProxy();

        PessoaService pessoaService = new PessoaService(novoPessoaRepositoryProxy);

        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .sobreNome("Ferreira")
                .dataNascimento(LocalDate.of(1986, 9, 11))
                .nome("Antoni")
                .apelido("Neneco")
                .build();

        pessoaService.save(pessoa);

        Pessoa pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);

        Pessoa pessoaRetornadaCache = pessoaService.findById(1L);
        System.out.println(pessoaRetornadaCache);
    }
}

