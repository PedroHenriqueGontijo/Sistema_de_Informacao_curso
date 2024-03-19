/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

/**
 *
 * @author 11352554666
 */
public class Cliente {
    private String nome;
    private int numeroMesa;
    
    public Cliente (String nome,int numeroMesa){
        this.nome=nome;
        this.numeroMesa = numeroMesa;
    }

    Cliente(String fernando) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getNumeroMesa(){
        return numeroMesa;
    }

    
    
    
    
    
    
    
    
    
    
    
    
}
