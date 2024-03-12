/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete_atividade;

import java.time.Clock;

/**
 *
 * @author host1
 */
public class Cliente {
    private String nome_cliente;
    private String tipo_pagamento;
    private Float quantidade_cliente;
    private Float total_pagamento;
    
    Estoque Estoque = new Estoque();

    public Cliente(String nome_cliente, String tipo_pagamento, Float quantidade_cliente, Float total_pagamento) {
        this.nome_cliente = nome_cliente;
        this.tipo_pagamento = tipo_pagamento;
        this.quantidade_cliente = quantidade_cliente;
        this.total_pagamento = total_pagamento;
    }

    Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getTipo_pagamento() {
        return tipo_pagamento;
    }

    public void setTipo_pagamento(String tipo_pagamento) {
        this.tipo_pagamento = tipo_pagamento;
    }

    public Float getQuantidade_cliente() {
        return quantidade_cliente;
    }

    public void setQuantidade_cliente(Float quantidade_cliente) {
        this.quantidade_cliente = quantidade_cliente;
    }

    public Float getTotal_pagamento() {
        return total_pagamento;
    }

    public void setTotal_pagamento(Float total_pagamento) {
        this.total_pagamento = total_pagamento;
    }


   
    
    
    public void pedido_cliente (String nome_cliente, String tipo_pagamento, Float total_pagamento, Float quantidade_cliente){
       this.total_pagamento= total_pagamento;

        System.out.println("pedido do cliente Nome:"+nome_cliente);
        System.out.println("tipo do pagamento:"+ tipo_pagamento);
        this.total_pagamento= Estoque.getValor()* this.quantidade_cliente;
        System.out.println("pedido do cliente: valor "+total_pagamento);
       }
        
    
    
    }
