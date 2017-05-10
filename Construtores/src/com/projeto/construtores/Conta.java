package com.projeto.construtores;

public class Conta {

	//atributos
	private int numeroConta;
	private double saldo;
	
	//construtor
	public Conta(int nuConta){  //chamado toda vez que instancia uma classe
		//Inicializar a conta
		this.numeroConta = nuConta;
	}
	
	public void imprime(){
		System.out.println(this.numeroConta);
	}
}
