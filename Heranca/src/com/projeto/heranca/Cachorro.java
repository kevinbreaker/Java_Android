package com.projeto.heranca;

public class Cachorro extends Animal { // o cachorro extende as funcionalidades de Animal
	
	public void latir(){
		System.out.println("Latir au-au");
	}
	public void correr(){
		super.correr();// chama o método da super classe.
		System.out.println("Correr como cão");
	}
}
