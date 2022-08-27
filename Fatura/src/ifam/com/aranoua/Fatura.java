package ifam.com.aranoua;

public class Fatura {
	private int numItem;
	private String descItem;
	private int quantItem;
	private double precoItem;
	
	public Fatura(int numItem, String descItem, int quantItem, double precoItem) {
		this.numItem = numItem;
		this.descItem = descItem;
		this.quantItem = quantItem;
		this.precoItem = precoItem;
	}

	public int getNumItem() {
		return numItem;
	}

	public void setNumItem(int numItem) {
		this.numItem = numItem;
	}

	public String getDescItem() {
		return descItem;
	}

	public void setDescItem(String descItem) {
		this.descItem = descItem;
	}

	public int getQuantItem() {
		return quantItem;
	}

	public void setQuantItem(int quantItem) {
		if (quantItem < 0) {
			quantItem = 0;
		}
		this.quantItem = quantItem;
	}

	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		if (precoItem < 0) {
			precoItem = 0;
		}
		this.precoItem = precoItem;
	}
	
	public double getFaturaAmount() {
		return precoItem*quantItem;
	}
	
}
