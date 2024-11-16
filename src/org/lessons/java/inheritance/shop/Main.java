package org.lessons.java.inheritance.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto prod1 = new Prodotto();
		System.out.println("Il codice prodotto è " + prod1.getCodice());
		System.out.println("Il nome del prodotto è " + prod1.getNome());  
		prod1.setNome("Galaxy S21");
		System.out.println("Il nome del prodotto è " + prod1.getNome());
		System.out.println("La marca del prodotto è " + prod1.getMarca());
		prod1.setMarca("Samsung");
		System.out.println("La marca del prodotto è " + prod1.getMarca());
		System.out.println("Il prezzo del prodotto è " + prod1.getPrezzo());  
		prod1.setPrezzo(399.99);
		System.out.println("Il prezzo del prodotto è " + prod1.getPrezzo());  
		System.out.println(String.format("Il prezzo ivato del prodotto è %.2f ", prod1.getPrezzoIvato()));  
		
		Televisore tv1 = new Televisore(prod1,42,true);
		System.out.println(tv1.getCodice());
		System.out.println(tv1.getNome());
		System.out.println(tv1.getPrezzoIvato());
	}

}
