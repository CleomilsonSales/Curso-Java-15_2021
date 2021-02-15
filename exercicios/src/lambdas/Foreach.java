package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays
				.asList("Ana", "Pedro", "João", "Marcos");
		
		System.out.println("Forma tradicional");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		// "\n" para dar um enter antes do print
		System.out.println("\nLambda #01...");
		aprovados.forEach(nome -> System.out.println(nome + "!"));
		
		//passando um referencia para o metodo que ja esta na api do java
		System.out.println("\nMethod Reference #01...");
		aprovados.forEach(System.out :: println);
		
		System.out.println("\nLambda #02...");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference #02...");
		aprovados.forEach(Foreach :: meuImprimir);
	
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}
}
