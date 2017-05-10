package com.projeto.metodos;

public class Metodos {

	public static void main(String[] args) { // Método principal 
											// void = "vazio" não retorna nada.
		meuMetodo(); // Chamando meu método no método principal(main)
					// Assim meu método é executado
		
		int resultado;
		resultado = multiplicar(2 , 7); // meu método com parametros.
		System.out.println(resultado + 3); // Printa o resultado retornado do meu método e soma 3.
	}
	
	public static void meuMetodo(){
		//Corpo do método
		System.out.println("Esse é o meu método");
	}
	
	public static int multiplicar (int numero1, int numero2){
		int resultado = 0;
		
		resultado = numero1 * numero2;
		return resultado;
	}

}
