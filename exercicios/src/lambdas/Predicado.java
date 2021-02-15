package lambdas;

import java.util.function.Predicate;

//Inteface funcional
public class Predicado {
	public static void main(String[] args) {
		//realiza analise em algo
		Predicate<Produto> isCaro = 
				prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		Produto produto = new Produto("Notebook", 4993.89,0.15);
		System.out.println(isCaro.test(produto));
	}
}
