package arrayCollections.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExercicioPilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		//add e push adicionar na pilha, a diferen�a � que add
		//retorno um booleano e push retorna um exece��o
		livros.add("O Pequeno Pr�cipe");
		livros.push("Bom Quixote");
		
		//os metodos s�o iguais da fila, a diferen�a que na pilha e do ultimo para o primeiro
		System.out.println(livros.peek());
		System.out.println(livros.poll());
	};
}
