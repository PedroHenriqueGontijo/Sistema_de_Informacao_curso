/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author 11352554666
 */
public class Pedido {
    private ArrayList<String>itens;
    private double total;
    
    public Pedido(){
        itens = new ArrayList<>();
        total=0.0;
    }
    public void adicionarItem (String item,double preco){
        itens.add(item);
        total+=preco;
    }
    public double getTotal(){
        return total;
    }
    
    
    
    
 
    
    
}
