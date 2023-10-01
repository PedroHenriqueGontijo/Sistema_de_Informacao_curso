package model;

import java.util.HashMap;
import java.util.Map;


public class Produto {
	private String nome;
	private double preco;
	private double Custo;
	private double margem_Lucro;
	
	private Map<Integer, String[]> Produto_Array = new HashMap<>();
	
	public void Inserir_Preco_Margem() {
		Produto_Array.put(1, new String[] {"Arroz", "7","0.2"});
		Produto_Array.put(2, new String[] {"Feijão","7" ,"0.25"});
		Produto_Array.put(3, new String[] {"Carne", "7","0.35"});
		Produto_Array.put(4, new String[] {"Cerveja","7", "0.30"});
		Produto_Array.put(5, new String[] {"Gas", "7","0.15"});
		Produto_Array.put(6, new String[] {"Gasolina","7", "0.15"});
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getCusto() {
		return Custo;
	}

	public void setCusto(double custo) {
		Custo = custo;
	}

	public double getMargem_Lucro() {
		return margem_Lucro;
	}

	public void setMargem_Lucro(double margem_Lucro) {
		this.margem_Lucro = margem_Lucro;
	}

	public Map<Integer, String[]> getProduto_Array() {
		return Produto_Array;
	}

	public void setProduto_Array(Map<Integer, String[]> produto_Array) {
		Produto_Array = produto_Array;
	}
	
	
	
	
}
