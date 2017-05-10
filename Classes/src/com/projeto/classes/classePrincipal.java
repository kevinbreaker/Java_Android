package com.projeto.classes;

public class classePrincipal {

	public static void main(String[] args) {
				
		Casa minhaCasa = new Casa(); // Criando variavel do tipo "Casa", e estanciando a mesma. 
									// tipo Casa, por causa da outra classe.
		
		// tudo isso so é possivel, através da instancia -> " new Casa()".
		
		minhaCasa.cor = "Preto"; // Acessando atributo e definindo um valor.
		
		System.out.println(minhaCasa.cor); 
		
		minhaCasa.abrirGaragem(); // chamando métodos de outra classe
	}

}
