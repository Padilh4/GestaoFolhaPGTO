/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestão_folha_pagamento;


public class FuncionarioHorista extends Funcionario{

    private double valorHora;
    private int NumeroHoras;
    
    

    @Override
    double CalcularPagamento(double bonus) {
    
        return valorHora * NumeroHoras;
        
    }

    public FuncionarioHorista(double valorHora, int NumeroHoras, String nome, String CPF, Double SalarioBase) {
        super(nome, CPF, SalarioBase);
        this.valorHora = valorHora;
        this.NumeroHoras = NumeroHoras;
    }


    
    
     
    
    
}
