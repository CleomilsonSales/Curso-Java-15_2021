package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana","Paula", "Joana", "Marcos");
		System.out.println("Usando stream...");
		
		//Interface funcional para n�o precisar sempre digitar o println
		//Consumer recebe um paramentro e n�o retorna nada otimo para referencia e passar como parametro
		Consumer<String> print = System.out::println;
		
		Stream<String> stream = aprovados.stream();
		stream.forEach(print);
		
	}
}
