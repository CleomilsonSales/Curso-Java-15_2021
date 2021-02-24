package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	//match � uma checagem uma valida��o tipo todos os alunos foram aprovados, retornara sim ou n�o
	public static void main(String[] args) {
		Alunos a1 = new Alunos("Ana",7.1);
		Alunos a2 = new Alunos("Luna",9.1);
		Alunos a3 = new Alunos("Jo�o",8.1);
		Alunos a4 = new Alunos("Cleber",5.1);
		Alunos a5 = new Alunos("Joana",4.8);
		
		List<Alunos> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		Predicate<Alunos> aprovados = a -> a.nota >= 7;
		
		//allmatch todos os casos s�o verdadeiros, ent�o retorna verdadeiro
		System.out.println(alunos.stream().allMatch(aprovados));
		
		//anymatch alguem � verdadeiros, ent�o retorna verdadeiro
		System.out.println(alunos.stream().anyMatch(aprovados));
		
		//nonematch nada � verdadeiros, ent�o retorna verdadeiro
		System.out.println(alunos.stream().noneMatch(aprovados));
		
		System.out.println(alunos.stream().noneMatch(aprovados.negate()));
	}
}
