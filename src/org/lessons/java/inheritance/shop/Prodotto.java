package org.lessons.java.inheritance.shop;

import java.util.Random;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private double iva;
	
	Prodotto() {
		setCodice();
		iva = 1.22;
	}
	
	Prodotto(String nome, String marca, double prezzo) {
		this();
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
	}
	
	private void setCodice() {
		Random ran = new Random();
		codice = ran.nextInt(99999);
	}
	
	int getCodice () {
		return this.codice;
	}
	
	void setNome (String nome) {
		this.nome = nome;
	}
	
	String getNome () {
		return this.nome;
	}
	
	void setMarca (String marca) {
		this.marca = marca;
	}
	
	String getMarca () {
		return this.marca;
	}
	
	void setPrezzo (double prezzo) {
		if (prezzo >= 0) {
			this.prezzo = prezzo;
		} else {
			System.out.println("Prezzo non valido");
		}
	}
	
	double getPrezzo () {
		return this.prezzo;
	}
	
	double getPrezzoIvato () {
		double prezzoIvato = this.prezzo * iva;
		return prezzoIvato;
	}
	
	
	
	
}
