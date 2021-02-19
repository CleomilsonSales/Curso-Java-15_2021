package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import oo.outros.Media;

public class Reduce3 {
	public static void main(String[] args) {
		Alunos a1 = new Alunos("Ana",7.1);
		Alunos a2 = new Alunos("Luna",9.1);
		Alunos a3 = new Alunos("João",8.1);
		Alunos a4 = new Alunos("Cleber",5.1);
		Alunos a5 = new Alunos("Joana",4.8);
		
		List<Alunos> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		Predicate<Alunos> aprovados = a -> a.nota >= 7;
		Function<Alunos, Double> apenasNotas = a -> a.nota;
		
		//como não media a função adicionar retorna a instancia pode ser chamada aqui diretamento no objeto
		BiFunction<Media, Double, Media> calcularMedia = 
					(media, nota) -> media.adicionar(nota);
		
		BinaryOperator<Media> combinarMedia	= 
				(m1,m2) -> Media.combinar(m1, m2);
					
		Media media = alunos.stream()
			.filter(aprovados)
			.map(apenasNotas)
			.reduce(new Media(), calcularMedia, combinarMedia);
			
		System.out.println("A média da turma é "+media.getValor());
	}
}
