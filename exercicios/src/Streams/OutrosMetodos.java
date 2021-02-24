package Streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
	public static void main(String[] args) {
		Alunos a1 = new Alunos("Ana",7.1);
		Alunos a2 = new Alunos("Luna",9.1);
		Alunos a3 = new Alunos("João",8.1);
		Alunos a4 = new Alunos("Cleber",5.1);
		Alunos a5 = new Alunos("Joana",4.8);
		Alunos a6 = new Alunos("Ana",7.1);
		Alunos a7 = new Alunos("Luna",9.1);
		Alunos a8 = new Alunos("João",8.1);
		Alunos a9 = new Alunos("Cleber",5.1);
		Alunos a10 = new Alunos("Joana",4.8);
		
		List<Alunos> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
		
		//Distinct retirar os repetidos -- precisa do equals e hashCode
		System.out.println("Distinct...");
		alunos.stream()
			.distinct()
			.forEach(System.out::println);
		
		//Skip|Limit paginação
		System.out.println("\nSkip|Limit...");
		alunos.stream()
			.distinct()
			.skip(2)
			.limit(4)
			.forEach(System.out::println);
	
		//takeWhile repetição ate uma condição
		System.out.println("\ntakeWhile...");
		alunos.stream()
		.distinct()
		.takeWhile(a -> a.nota >= 7)
		.forEach(System.out::println);
	}
}
