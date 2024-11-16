package org.lessons.java.inheritance.shop;

public class Televisore extends Prodotto {

	private int dimensioniSchermo;
	private boolean isSmart;
	
	Televisore(Prodotto prodotto, int dimensioniSchermo, boolean isSmart) {
		super(prodotto.getNome(), prodotto.getMarca(), prodotto.getPrezzo());
		this.dimensioniSchermo = dimensioniSchermo;
		this.isSmart = isSmart;
	}
	
}
