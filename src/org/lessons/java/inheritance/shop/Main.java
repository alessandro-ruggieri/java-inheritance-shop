package org.lessons.java.inheritance.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto prod1 = new Prodotto("TV 4K", "Samsung", 399.99);
		Prodotto prod2 = new Prodotto("iPhone 16", "Apple", 899.99);
		Prodotto prod3 = new Prodotto("AirPods Max", "Apple", 499.99);
		
		
		Televisori tv1 = new Televisori(prod1,42,true);
		Smartphone phone1 = new Smartphone(prod2, "8939874567120348", "128GB");
		Cuffie cuffia1 = new Cuffie(prod3, "Bianche", true);
		
		
		System.out.println("Il codice prodotto è " + tv1.getCodice());
		System.out.println("Il nome del prodotto è " + tv1.getNome());
		System.out.println("La marca del prodotto è " + tv1.getMarca());
		System.out.println("Il prezzo del prodotto è " + tv1.getPrezzo());  
		System.out.println(String.format("Il prezzo ivato del prodotto è %.2f ", tv1.getPrezzoIvato()));  
		System.out.println("La diagonale dello schermo è " + tv1.getDimensioniSchermo() + " pollici");  
		System.out.println("E' smart: " + tv1.getIsSmart());  
	}

}
