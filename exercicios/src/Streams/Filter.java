package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
		//filter é uma api para facilitar a ação de filtros
		Alunos a1 = new Alunos("Ana", 7.8, false);
		Alunos a2 = new Alunos("Pedro", 9.8, true);
		Alunos a3 = new Alunos("Zeca", 5.8, true);
		Alunos a4 = new Alunos("João", 9.9, false);
		Alunos a5 = new Alunos("Cintia", 10.0, true);
		Alunos a6 = new Alunos("Carla", 6.6, false);
		
		List<Alunos> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Alunos> aprovados = a -> a.nota >= 7;
		Predicate<Alunos> aprovadosComportamento = a -> a.bomComportamento;
		Function<Alunos, String> saudacaoAprovacao = a -> "Parabéns pela aprovação " + a.nome;
		
		alunos.stream()
			.filter(aprovados)
			.filter(aprovadosComportamento)
			.map(saudacaoAprovacao)
			.forEach(System.out::println);
	
	}
}
