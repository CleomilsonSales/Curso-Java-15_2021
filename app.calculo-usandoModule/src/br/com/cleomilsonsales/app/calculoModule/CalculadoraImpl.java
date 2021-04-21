package br.com.cleomilsonsales.app.calculoModule;

import br.com.cleomilsonsales.app.api.Calculadora;
import br.com.cleomilsonsales.app.calculo.interno.OperacoesAritmeticas;
import br.com.cleomilsonsales.app.logging.Logger;

public class CalculadoraImpl implements Calculadora {
	private String id = "1";

	private OperacoesAritmeticas opa = new OperacoesAritmeticas();

	// apenas delegando o metodos existente na variavel
	public double soma(double... nums) {
		Logger.info("Somando...");
		return opa.soma(nums);
	}

	// estou expondo a classe logger para quem chamar a calculadora
	public Class<Logger> getLoggerClass() {
		return Logger.class;
	}

	public String getId() {
		return id;
	}

}
