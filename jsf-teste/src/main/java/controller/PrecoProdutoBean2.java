package controller;

import javax.inject.Inject;

import service.CalculadoraPreco;

public class PrecoProdutoBean2 {
	
	private CalculadoraPreco calculadora;
	
	@Inject
	public PrecoProdutoBean2(CalculadoraPreco calculadora){
		this.calculadora=calculadora;
	}
}
