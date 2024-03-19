/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

import com.sun.tracing.dtrace.ArgsAttributes;
import java.io.InputStream;

/**
 *
 * @author 11352554666
 */
    public class Teste {
        public static void main (String[]args){
        Menu menu = new Menu();
        menu.adicionarItem("entradas", "salada amarela");
        menu.adicionarItem("entradas", "macarrao verde");
        menu.adicionarItem("prato cheffe", "lula com 9 dedos");
        menu.adicionarItem("prato cheff", "Arroz com tutano");
        menu.adicionarItem("SOBREMESA", "PUDIM"); 
        menu.adicionarItem("bebida", "pinga vale verde");

        Cliente cliente = new Cliente("fernando",1);
        Pedido pedido = new Pedido();
        Scanner scanner= new Scanner();
        Scanner(System.in);
        String escolha;
        do{
            system.out.println("Digite o item que deseja pedir ou ' sair' para encerrar");
            escolha= scanner.nextLine();
                if(!escolha.equalsIgnoreCase("sair"))
                {
                    if(menu.verificarDisponibilidade(escolha)){
                        System.out.println("item adicionado  no pedido");
                        }else{
                            System.out.println("desculpe mas o item nao está disponivel");
                         }
                          
       
                }
            
        
    

