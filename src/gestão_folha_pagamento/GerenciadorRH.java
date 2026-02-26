/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestão_folha_pagamento;

import java.util.ArrayList;

/**
 *
 * @author MIZAELDAROSAGIEHL
 */
public class GerenciadorRH {
    ArrayList<Funcionario> FuncionariosLegais = new ArrayList<>();
    
     public void implementar(Funcionario FuncionarioLegal){
         FuncionariosLegais.add(FuncionarioLegal);
     }
     public void remover(Funcionario FuncionarioLegal){
         FuncionariosLegais.remove(FuncionarioLegal);
     }
     public void listar(){
        for(int i = 0; i < FuncionariosLegais.size(); i++){
            System.out.println("\n ==== FUNCIONARIO " + (i + 1) + " ====");
            System.out.println("Funcionario " + FuncionariosLegais.get(i).nome);
            System.out.println("Salario: " + FuncionariosLegais.get(i).SalarioBase);
            
        }
        
     }
     public void cadastrarHorista(String NomeCadastro, String CPF, double ValorHora, int horastrabalhadas, double SalarioBase){
         
     FuncionarioHorista NovoHorista = new FuncionarioHorista(ValorHora, horastrabalhadas, NomeCadastro, CPF, SalarioBase);
     
     FuncionariosLegais.add(NovoHorista);
     }

}
