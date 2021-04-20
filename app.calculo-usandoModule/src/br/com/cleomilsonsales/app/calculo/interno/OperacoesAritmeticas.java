package br.com.cleomilsonsales.app.calculo.interno;

import java.util.Arrays;

public class OperacoesAritmeticas {
	public double soma(double... nums) { //varargs
		//pega todos o array da var args somando todos
		return Arrays.stream(nums).reduce(0.0, (t, a) -> t +a);
	}
}
