/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestão_folha_pagamento;

import java.util.ArrayList;

/**
 *
 * @author ARTHURCARDOSOPADILHA
 */
public class Gestão_Folha_pagamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GerenciadorRH gerenciador = new GerenciadorRH();
        FuncionarioHorista FuncionarioLegal = new FuncionarioHorista(1, 22, "Ricardo Correia", "12357912905", 660.0);
        gerenciador.implementar(FuncionarioLegal);
       
        gerenciador.cadastrarHorista("N11ne", "123456789-90", 17, 23, 11730);
        
        
        
        gerenciador.listar();
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
