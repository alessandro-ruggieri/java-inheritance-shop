package org.lessons.java.inheritance.shop;

public class Smartphone extends Prodotto{

	private String codiceImei;
	private String spazioMemoria;
	
	Smartphone(Prodotto prodotto, String codiceImei, String spazioMemoria) {
		super(prodotto.getNome(), prodotto.getMarca(), prodotto.getPrezzo());
		this.codiceImei = codiceImei;
		this.spazioMemoria = spazioMemoria;
	}
	
	void setCodiceImei(String codiceImei) {
		this.codiceImei = codiceImei;
	}
	
	String getCodiceImei () {
		return this.codiceImei;
	}
	
	void setSpazioMemoria (String spazioMemoria) {
		this.spazioMemoria = spazioMemoria;
	}
	
	String getSpazioMemoria () {
		return this.spazioMemoria;
	}

}
