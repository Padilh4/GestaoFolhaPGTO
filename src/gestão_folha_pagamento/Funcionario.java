/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestão_folha_pagamento;

/**
 *
 * @author ARTHURCARDOSOPADILHA
 */
abstract class Funcionario {
        public String nome;
    protected String CPF;
    public Double SalarioBase;

    public Funcionario(String nome, String CPF, Double SalarioBase) {
        this.nome = nome;
        this.CPF = CPF;
        this.SalarioBase = SalarioBase;
    }

    abstract double CalcularPagamento(double bonus);
    
    
    
    
    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(Double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }
    
    
}
