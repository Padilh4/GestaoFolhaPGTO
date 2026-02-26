/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestão_folha_pagamento;

import java.util.ArrayList;
import java.util.Scanner;

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
         Scanner teclado = new Scanner(System.in);
         int opcao = 0;
  do{
            System.out.println("\n #  Menu Principal  # ");
            System.out.println(" -- Sistema Folha de Pagamento -- ");
            System.out.println("1 - Cadastrar Funcionario");
            System.out.println("2 - Acessar folha de pagamento");
            System.out.println("0 - Sair do Programa");
            
            System.out.println("Escolha uma opcao:");
            
             opcao = teclado.nextInt();
            teclado.nextLine();
         
         switch(opcao){
                case 1:
                    
                    System.out.println(" CADASTRAR FUNCIONÁRIO ");
                    
                    System.out.println(" Nome do funcionário: ");
                    String NomeFunC = teclado.nextLine();
                    
                    System.out.println(" Cargo do funcionário: ");
                    String CargoFunC = teclado.nextLine();
                    
                    System.out.println(" Este funcionário é assalariado [a] ou horista [h]?");
                    String AouHFun = teclado.nextLine().toLowerCase();
                    
                    if(AouHFun.equals("a")) {
                        
                        System.out.println("Salário mensal: ");
                        double salario = lerdoublesSeguro(teclado);
                        
                        
    
                        FuncionarioAssalariado fa = new FuncionarioAssalariado(NomeFunC, "000.000.000-00", salario);
                        gerenciador.FuncionariosLegais.add(fa);
                        
                        System.out.println("Funcionário Assalariado cadastrado!");
   
                    } else if (AouHFun.equals("h")) {
                     System.out.println("Valor da hora: ");
                     double vHora = lerdoublesSeguro(teclado);
                     System.out.println("Total de horas mensal: ");
                     int tHoras = lerinteirosSeguro(teclado);
                     
                     FuncionarioHorista fh = new FuncionarioHorista(vHora, tHoras, NomeFunC, "000.000.000-00", 0.0);
                     gerenciador.FuncionariosLegais.add(fh);
                     
                     System.out.println("Funcionário Horista cadastrado!");
                        
                    } else {
                        
                    System.out.println(" Opção inválida! ");
                        
                    }
                   
                    
                    
                    break;
                case 2:
                    gerenciador.listar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Tente novamente...");
                    
         }
  }while(opcao != 0);   
        
        
    }
       public static int lerinteirosSeguro (Scanner sc) {
        
        boolean dadosValidos = false;
        int numero = 0;
        
        while(!dadosValidos){
            try{
                numero = sc.nextInt();
                dadosValidos = true;  
                
            }catch(java.util.InputMismatchException e) {
                System.out.println("ERRO! Você digitou um texto. Digite apenas números");
                sc.next();
                
            }
            
        }
        return numero;
        
    }
        public static double lerdoublesSeguro (Scanner sc) {
        
         boolean dadosValidos = false;
         double numero2 = 0.0;
         
          while(!dadosValidos){
            try{
                numero2 = sc.nextDouble();
                dadosValidos = true;  
                
            }catch(java.util.InputMismatchException e) {
                System.out.println("ERRO! Você digitou um texto. Digite apenas números");
                sc.next();
                
            }
            
        }
        return numero2;
        
        
    }
    
}
