/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

import java.util.ArrayList;

/**
 *
 * @author 11352554666
 */
public class Menu {
  private ArrayList<String> entradas;
  private ArrayList<String> pratosPrincipais;
  private ArrayList<String> sobremesas;
  private ArrayList<String> bebidas;
    
    
public void adicionarItem(String categoria, String item) {
    switch(categoria.toLowerCase()){
        case "entradas":
            entradas.add(item);
            break;
        case "pratos Principais":
            pratosPrincipais.add(item);
            break;
        case "sobremesas":
            sobremesas.add(item);
            break;
        case "bebidas":
        bebidas.add(item);
        break;
        default:System.out.println("digitar novamente, Pois selecionou errado!!!!!!!!!!!!!!!!!!!");
    }
}
    
public boolean verificarDisponibilidade(String item){
    return entradas.contains(item)|| sobremesas.contains(item)|| pratosPrincipais.contains(item)
            || bebidas.contains(item);
}
}  

