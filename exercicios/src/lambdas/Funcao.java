package lambdas;

import java.util.function.Function;

//programa��o funcional
public class Funcao {
	public static void main(String[] args) {
		//passa um parametro de entrada e retorna ou parametro
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "�mpar";
				
		Function<String, String> oResultadoE = 
				valor -> "O resultado � " + valor;
				
		Function<String, String> empolgado = 
				valor -> valor + "!";
				
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
		
		System.out.println(resultadoFinal);
	}
}
