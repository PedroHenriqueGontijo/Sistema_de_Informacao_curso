package view;

import model.Product;
import model.Tax;

public class Main {

public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	 Product arroz = new Product("Arroz pileco", 7.00, 0.20);
     Product feijao = new Product("Feijao", 7.00, 0.25);
     Product carne = new Product("Carne", 7.00, 0.35);
     Product cerveja = new Product("Cerveja", 7.00, 0.30);
     Product gas = new Product("Gás", 7.00, 0.15);
     Product gasolina = new Product("Gasolina", 7.00, 0.15);
     
     Tax ICMS = new Tax("ICMS", "Imposto Circ. Mercadorias", 0);
     Tax IPI = new Tax("IPI", "Imposto Prod. Industrializado", 0);
     Tax ISS = new Tax("ISS", "ISS teste", 0);
     
     arroz.addTax(false);
     feijao.addTax(false);
     carne.addTax(true);
     cerveja.addTax(true);
     gas.addTax(true);
     gasolina.addTax(false);
		
		arroz.addTax(IPI);
		arroz.addTax(ISS);
		arroz.addTax(ICMS);
		feijao.addTax(IPI);
		feijao.addTax(ISS);
		feijao.addTax(ICMS);
		
		System.out.println(arroz.getName()+ "R$: "+arroz.calculateSalePrice());
		
		System.out.println(feijao.getName()+ feijao.calculateSalePrice());
		
	}

}