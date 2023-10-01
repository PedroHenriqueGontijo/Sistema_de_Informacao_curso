package model;

public class Tax {
	
	private String abbr, name;
	private double aliquot;

	public Tax(String abbr, String name, double aliquot) throws Exception {
		setAbbr(abbr);
		setName(name);
		setAliquot(aliquot);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Tax))
			return false; 

		Tax tax = (Tax) obj;

		return this.abbr.equals(tax.abbr);
	}

	public double calculate(Product p) {
	    if ("ICMS".equals(this.abbr)) {
	        if (p.hasIPI()) {
	            return p.getCostPrice() * 0.07; 
	        } else {
	            return p.getCostPrice() * 0.05; 
	        }
	    } else if ("IPI".equals(this.abbr)) {
	        if (p.addTax()) {
	            return p.getCostPrice() * 0.10; 
	        } else {
	            return p.getCostPrice() * 0.08; 
	        }
	    } else {
	        return 0; 
	    }
	    else if ("ISS".equals(this.abbr)) {
	        return (p.calculateSalePrice() 
	        		- p.getCostPrice()) * 0.05; 
	    } else {
	        return 0; 
	    }
	}

	private void setAliquot(double aliquot) {
		this.aliquot = aliquot / 100;
	}

	private void setName(String name) throws Exception {

		if (name == null || name.equals(""))
			throw new Exception("Nome Inválido!");

		this.name = name;
	}

	private void setAbbr(String abbr) throws Exception {

		if (abbr == null || abbr.equals(""))
			throw new Exception("Sigla Inválida!");

		this.abbr = abbr;
	}
}