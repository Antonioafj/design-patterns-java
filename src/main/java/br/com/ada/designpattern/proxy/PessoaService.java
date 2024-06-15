package br.com.ada.designpattern.proxy;

import br.com.ada.designpattern.builder.Pessoa;
import br.com.ada.designpattern.proxy.solucao.PessoaRepositoryProxy;
import br.com.ada.designpattern.proxy.solucao.ProxyPessoa;

public class PessoaService {

    private ProxyPessoa ProxyPessoa;

    public PessoaService(ProxyPessoa ProxyPessoa){
        this.ProxyPessoa = ProxyPessoa;
    }

    public void save(Pessoa pessoa){
        ProxyPessoa.save(pessoa);
    }

    public Pessoa findById(Long id){
        return
                ProxyPessoa.findById(id);
    }

}
