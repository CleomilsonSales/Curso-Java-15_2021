package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		Produto p1 = new Produto("Lapis", 1.99, 0.19, 1);
		Produto p2 = new Produto("Notebook", 10988.99, 0.29, 0);
		Produto p3 = new Produto("iPad", 4985.99, 0.39, 0);
		Produto p4 = new Produto("iPhone", 9895.91, 0.19, 280);
		Produto p5 = new Produto("MacBook", 11985.99, 0.09, 0);
		Produto p6 = new Produto("Giz de Cera", 0.99, 0.49, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		//filters
		Predicate<Produto> superDesconto = p -> p.desconto >= 0.1;
		Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
		Predicate<Produto> produtoRelevante = p -> p.preco >= 500;
		
		//map transformando em string
		Function<Produto, String> chamadaPromocional = p -> "Aproveite! " + p.nome + " por R$ " + p.preco;
		
		produtos.stream()
			.filter(superDesconto)
			.filter(freteGratis)
			.filter(produtoRelevante)
			.map(chamadaPromocional)
			.forEach(System.out::println);
	}
}
