/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchonete_atividade;

/**
 *
 * @author host1
 */
public class Estoque {

    private String nome_produto;
    private String quantidade_stoque;
    private int valor_produto_estoque;

    public Estoque(String nome_produto, String quantidade_stoque, int valor_produto_estoque) {
        this.nome_produto = nome_produto;
        this.quantidade_stoque = quantidade_stoque;
        this.valor_produto_estoque = valor_produto_estoque;
    }

    Estoque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getQuantidade_stoque() {
        return quantidade_stoque;
    }

    public void setQuantidade_stoque(String quantidade_stoque) {
        this.quantidade_stoque = quantidade_stoque;
    }

    public int getValor() {
        return valor_produto_estoque;
    }

    public void setValor(int valor_produto) {
        this.valor_produto_estoque = this.valor_produto_estoque;
    }

    public void info_estoque(String nome_produto, String quantidade_stoque, int valor_produto) {
        this.nome_produto = nome_produto;
        this.quantidade_stoque = quantidade_stoque;
        this.valor_produto_estoque = valor_produto;
       
    }

}
