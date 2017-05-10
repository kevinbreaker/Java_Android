package com.projeto.heranca;

public class HerancaPrincipal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.correr(); // executa a super classe, e depois também a do cão.
		cachorro.latir();
		
		cachorro.setCor("Preto"); // setando a cor
		System.out.println(cachorro.getCor()); // pegando a cor e imprimindo
		
		
		Passaro passaro = new Passaro();
		passaro.correr();
		passaro.voar(); // sobrescrito.
		
		passaro.setCor("Branco");
		System.out.println(passaro.getCor());
	}

}
