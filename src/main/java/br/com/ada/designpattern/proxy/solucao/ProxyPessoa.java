package br.com.ada.designpattern.proxy.solucao;

import br.com.ada.designpattern.builder.Pessoa;

public interface ProxyPessoa {

    public void save(Pessoa pessoa);


    public Pessoa findById(Long id);

}
