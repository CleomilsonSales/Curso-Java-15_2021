package arrayCollections.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExercicioPilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		//add e push adicionar na pilha, a diferença é que add
		//retorno um booleano e push retorna um execeção
		livros.add("O Pequeno Prícipe");
		livros.push("Bom Quixote");
		
		//os metodos são iguais da fila, a diferença que na pilha e do ultimo para o primeiro
		System.out.println(livros.peek());
		System.out.println(livros.poll());
	};
}
