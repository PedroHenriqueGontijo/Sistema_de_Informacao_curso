package project1;


import java.util.Map;

class Product {
    private String name;
    private double costPrice;
    private Map<String, Double> taxes;
    private double profitMargin;

    public Product(String name, double costPrice, Map<String, Double> taxes, double profitMargin) {
        this.name = name;
        this.costPrice = costPrice;
        this.taxes = taxes;
        this.profitMargin = profitMargin;
    }

    public double calculateFinalPrice() {
        double totalTaxes = 0;
        for (Map.Entry<String, Double> entry : taxes.entrySet()) {
            totalTaxes += costPrice * entry.getValue();
        }
        double totalCost = costPrice + totalTaxes;
        double profitAmount = totalCost * (profitMargin / 100);
        return totalCost + profitAmount;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}

	public Map<String, Double> getTaxes() {
		return taxes;
	}

	public void setTaxes(Map<String, Double> taxes) {
		this.taxes = taxes;
	}

	public double getProfitMargin() {
		return profitMargin;
	}

	public void setProfitMargin(double profitMargin) {
		this.profitMargin = profitMargin;
	}

    
}
