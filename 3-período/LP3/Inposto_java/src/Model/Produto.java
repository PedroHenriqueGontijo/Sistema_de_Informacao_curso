package Model;

import java.util.HashMap;
import java.util.Map;

public class Produto implements Inplements_Produto_Valores {
	private String nome;
	private double Preco;
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

	
	
	public Produto(String nome, double Preco, double custo, double margem_Lucro, Map<Integer, String[]> produto_Array) {
		super();
		this.nome = nome;
		this.Preco = Preco;
		Custo = custo;
		this.margem_Lucro = margem_Lucro;
		Produto_Array = produto_Array;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return Preco;
	}
	public void setPreco(double preco) {
		this.Preco = preco;
	}
	public double getMargem_Lucro() {
		return margem_Lucro;
	}
	public void setMargem_Lucro(double margem_Lucro) {
		this.margem_Lucro = margem_Lucro;
	}
	@Override
	public double Impostos_Produto(double Ipi, double Iss, double Cide, double Csll) {
	        double totalImpostos = 0;
	        for (Map.Entry<String, Double> imposto : Impostos_Produto(Ipi, Iss, Cide, Csll)) {
	            totalImpostos += Preco * imposto.getValue();
	        }
	        double custoTotal = Custo + totalImpostos;
	        double lucro = custoTotal * margem_Lucro;
	        return custoTotal + lucro;
	    }
		return 0;
	}
}
