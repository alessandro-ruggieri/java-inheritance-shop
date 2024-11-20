package org.lessons.java.inheritance.shop;

public class Televisori extends Prodotto {

	private int dimensioniSchermo;
	private boolean isSmart;
	
	Televisori(Prodotto prodotto, int dimensioniSchermo, boolean isSmart) {
		super(prodotto.getNome(), prodotto.getMarca(), prodotto.getPrezzo());
		this.dimensioniSchermo = dimensioniSchermo;
		this.isSmart = isSmart;
	}
	
	void setDimensioniSchermo(int dimensioniSchermo) {
		this.dimensioniSchermo = dimensioniSchermo;
	}
	
	int getDimensioniSchermo () {
		return this.dimensioniSchermo;
	}
	
	void setIsSmart (boolean isSmart) {
		this.isSmart = isSmart;
	}
	
	boolean getIsSmart () {
		return this.isSmart;
	}
	
}
