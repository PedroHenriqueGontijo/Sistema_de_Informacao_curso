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
public class Funcionario {

 private String nome;
 private String funcao;
 private int cod_verificao;

 
 
 
 
    public Funcionario(String nome, String funcao, int cod_verificao) {
        this.nome = nome;
        this.funcao = funcao;
        this.cod_verificao = cod_verificao;
    }

    Funcionario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getCod_verificao() {
        return cod_verificao;
    }

    public void setCod_verificao(int cod_verificao) {
        this.cod_verificao = cod_verificao;
    }
 
    
  public void conta(String nome, String funcao, int cod_vericacao){
      this.nome =nome;
      this.funcao=funcao;
      this.cod_verificao=cod_vericacao;
      System.out.println("Nome :"+nome);
      System.out.print("Atuacao de servico"+funcao); 
  } 
 
 
    
}
