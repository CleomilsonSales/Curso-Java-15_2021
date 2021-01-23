package arrayCollections.collections;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioFila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//add e offer adicionam elementos na fila
		//offer - é um adicionar, mas retorna um boolean
		//se atender ao tamanho da fila, pq retorna um exceção
		fila.offer("Paulo");
		fila.add("Saori");
		fila.add("Rita");
		fila.add("Maiara");
		fila.add("Renato");
		
		//peek e element obtem o proximo elemento sem remover
		//peek é o mesmo que element, porem se a fila estiver fazia retorna null
		//o element retorna um exceção
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		//saber se a fila esta vazia
		System.out.println(fila.isEmpty());
		
		//retorna o primeiro elemento removendo da lista
		//poll remove mas retorna um boolean
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
	}

}
