package org.lessons.java.inheritance.shop;

public class Cuffie extends Prodotto {

	private String colore;
	private boolean isWireless;
	
	Cuffie(Prodotto prodotto, String colore, boolean isWireless) {
		super(prodotto.getNome(), prodotto.getMarca(), prodotto.getPrezzo());
		this.colore = colore;
		this.isWireless = isWireless;
	}
	
	void setColore(String colore) {
		this.colore = colore;
	}
	
	String getColore () {
		return this.colore;
	}
	
	void setIsWireless (boolean isWireless) {
		this.isWireless = isWireless;
	}
	
	boolean getIsWireless () {
		return this.isWireless;
	}
}
