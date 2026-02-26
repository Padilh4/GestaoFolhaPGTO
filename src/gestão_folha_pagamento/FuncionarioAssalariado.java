package gestão_folha_pagamento;

public class FuncionarioAssalariado extends Funcionario {

    public FuncionarioAssalariado(String nome, String CPF, Double SalarioBase) {
        super(nome, CPF, SalarioBase);
    }

    @Override
    public double CalcularPagamento(double bonus) {
    return SalarioBase + bonus;
        
    }



}