package br.com.ada.designpattern.strategy.solucao;

import br.com.ada.designpattern.strategy.Funcionario;
import br.com.ada.designpattern.strategy.TipoContratacaoEnum;
import br.com.ada.designpattern.strategy.problema.ReajusteAnualSalario;

import java.math.BigDecimal;

public class TesteAjusteSalarioComStrategy {

    public static void main(String[] args) {
        ReajusteAnualSalarioComStrategy reajusteAnualSalario = new ReajusteAnualSalarioComStrategy();

        Funcionario funcionarioCLT = new Funcionario();
        funcionarioCLT.setNome("Victor");
        funcionarioCLT.setTipoContratacao(TipoContratacaoEnum.CLT);
        funcionarioCLT.setSalario(new BigDecimal(5000));

        Funcionario funcionarioPJ = new Funcionario();
        funcionarioPJ.setNome("Podolski");
        funcionarioPJ.setTipoContratacao(TipoContratacaoEnum.pj);
        funcionarioPJ.setSalario(new BigDecimal(10000));

        Funcionario funcionarioEstagio = new Funcionario();
        funcionarioEstagio.setNome("Mariano");
        funcionarioEstagio.setTipoContratacao(TipoContratacaoEnum.ESTAGIO);
        funcionarioEstagio.setSalario(new BigDecimal( 15000));

        Funcionario funcionarioCopperativa = new Funcionario();
        funcionarioCopperativa.setNome("João");
        funcionarioCopperativa.setTipoContratacao(TipoContratacaoEnum.COOPERATIVA);
        funcionarioCopperativa.setSalario(new BigDecimal( 8000));

        reajusteAnualSalario.calculaReajusteAnual(funcionarioCLT, new CalculadorReajusteAnualSalarioCLT());
        reajusteAnualSalario.calculaReajusteAnual(funcionarioPJ, new CalculadorReajusteAnualSalarioPJ());
        reajusteAnualSalario.calculaReajusteAnual(funcionarioEstagio, new CalculadorReajusteAnualSalarioEstagio());
        reajusteAnualSalario.calculaReajusteAnual(funcionarioCopperativa, new CalculadorReajusteAnualSalarioCooperativa());

        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagio);
        System.out.println(funcionarioCopperativa);
    }
}
