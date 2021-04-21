package br.com.cleomilsonsales.app.financeiro;

import java.util.ServiceLoader;

import br.com.cleomilsonsales.app.api.Calculadora;

public class Teste {
	public static void main(String[] args) {
		//CalculadoraImpl calc = new CalculadoraImpl();
		
		Calculadora calc = ServiceLoader
				.load(Calculadora.class)
				.findFirst()
				.get(); //usando interface no modulo
		System.out.println(calc.soma(2,3,7));
		
		//System.out.println(calc.getLoggerClass());
		
		//OperacoesAritmeticas op = new OperacoesAritmeticas();
		//System.out.println(op.soma(4, 5, 6));
		/*
		//mudando uma variavel privada fora da classe, violando o encapsulamento e visibilidade,  usando o open module e reflect
		try {
			Field fildId = CalculadoraImpl.class.getDeclaredFields()[0];
			fildId.setAccessible(true);
			System.out.println("Era: "+fildId.get(calc));
			fildId.set(calc, "def");
			System.out.println("Mudei para: "+fildId.get(calc));
			fildId.setAccessible(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
	}
}
