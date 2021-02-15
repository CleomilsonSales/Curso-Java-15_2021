package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = 
				p -> System.out.println(p.nome + "!");
				
		Produto p1 = new Produto("Caneta",12.34,0.19);
		//chamando o consumer sem usar um foreach
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Lapis",2.34,0.12);
		Produto p3 = new Produto("Borracha",0.34,0.19);
		Produto p4 = new Produto("Caderno",32.34,0.29);
		Produto p5 = new Produto("Pincel",18.34,0.21);
		Produto p6 = new Produto("Apontador",0.84,0.39);
		
		List<Produto> produto = Arrays.asList(p2,p3,p4,p5,p6);
		
		produto.forEach(imprimir);
		System.out.println("\nOu chamando com lambda uma variavel");
		produto.forEach(p -> System.out.println(p.preco));
		
		System.out.println("\nOu chamando com Method Reference uma variavel");
		produto.forEach(System.out :: println);
	}
}
