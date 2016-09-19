package controller;

import javax.inject.Inject;

import service.CalculadoraPreco;

public class PrecoProdutoBean3 {
	private CalculadoraPreco calculadora;
	
	@Inject
	public void setCalculadora(CalculadoraPreco calculadora){
		this.calculadora = calculadora;
	}

}