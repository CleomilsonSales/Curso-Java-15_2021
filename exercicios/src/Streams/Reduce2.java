package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
	
	public static void main(String[] args) {
		
		Alunos a1 = new Alunos("Ana",7.1);
		Alunos a2 = new Alunos("Luna",9.1);
		Alunos a3 = new Alunos("João",8.1);
		Alunos a4 = new Alunos("Cleber",5.1);
		Alunos a5 = new Alunos("Joana",4.8);
		
		List<Alunos> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		Predicate<Alunos> aprovados = a -> a.nota >= 7;
		Function<Alunos, Double> apenasNotas = a -> a.nota;
		BinaryOperator<Double> somatorio = (a, b) -> a + b;
		
		alunos.stream()
			.filter(aprovados)
			.map(apenasNotas)
			.reduce(somatorio)
			.ifPresent(System.out::println);
	}

}
