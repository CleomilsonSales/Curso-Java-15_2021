package arrayCollections.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExercicioSet {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//set � um conjunto de dados
		//hashSet
		@SuppressWarnings("rawtypes")
		HashSet conjunto = new HashSet();
		
		//ser� alterado de primitivo para uma classe
		//ex.: double -> Double
		//n�o aceita repeti�ao
		conjunto.add(1.2); 
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		conjunto.remove('x');
		
		System.out.println("Tamanho � " +conjunto.size() + " Elementos.");
		
		//vendo se algo contem no conjunto
		System.out.println(conjunto.contains('x'));
		
		//exibindo conjunto
		System.out.println(conjunto);
		
		@SuppressWarnings("rawtypes")
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(9);
		nums.add(3);
		
		//unindo conjuntos
		conjunto.addAll(nums);
		System.out.println(conjunto);
		//intese��o
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		//limpando conjunto
		conjunto.clear();
		System.out.println(conjunto);
		
		
		//set comportado - definindo o tipo do conjunto para ficar dados homogenios
		System.out.println("//Set comportado");
		//pode informar o tipo da lista no new ou n�o, o java entendera
		//TreeSet � o mesmo que HashSet, so que ele respeita a ordem de inser��o
		//SortedSet mesmo que HashSet, so que trabalha com ordena��o
		SortedSet<String> lista = new TreeSet<>();
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Cleomilson");
		
		for(String candidatos: lista) {
			System.out.println(candidatos);
		}		
	}

}
