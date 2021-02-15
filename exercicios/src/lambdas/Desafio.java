package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		/*
		 * 1. A partir do produto calcular o preço real com o desconto
		 * 2. Adicionar impostos municipais: >= 2500 (8,5%) / < 2500 (isento)
		 * 3. Frete: >= 3000 (100) / < 3000 (50)
		 * 4. Arredondar para duas casas decimais
		 * 5. Formatar para R$ 1234,56
		 */
		
		Function<Produto, Double> precoFinal = 
				produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostosMunicipais = 
				preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar = 
				preco -> Double.parseDouble(String.format("%f", preco));
		Function<Double, String> formatar = 
				preco -> ("R$ " + preco).replace(".", ",");
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		String preco = precoFinal
				.andThen(impostosMunicipais)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("O preço final é " + preco);
	}
}
