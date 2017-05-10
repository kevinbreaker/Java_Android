package com.projeto.heranca;

public class Animal { // Superclasse
	
	private String tamanho;
	private double peso;
	private String cor;
	
	public void correr(){
		System.out.println("Correr como animal");
	}
	
	//getters e setters
	public void setCor(String cor){
		this.cor = cor;
	}
	
	public String getCor(){
		return this.cor;
	}
}
