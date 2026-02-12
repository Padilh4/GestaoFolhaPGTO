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

    abstract void CalcularPagamento();
    
    
    
    
    
    
    
    
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
