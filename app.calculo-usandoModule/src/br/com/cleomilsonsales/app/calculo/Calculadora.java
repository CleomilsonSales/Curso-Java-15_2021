package br.com.cleomilsonsales.app.calculo;

import br.com.cleomilsonsales.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora {
	private OperacoesAritmeticas opa = new OperacoesAritmeticas();

	//apenas delegando o metodos existente na variavel
	public double soma(double... nums) {
		return opa.soma(nums);
	}
	
	
}
