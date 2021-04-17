package teste.consulta_named_query;

import java.util.List;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class ObterFilmes {
	public static void main(String[] args) {
		DAO<Filme> dao = new DAO<>();
		List<Filme> filmes = dao.consultar(
				"ObterFilmesNotaMaiorQue", "nota", 7.5); //no params definido no metodo eu tenho que passar o nome do parametro e o valor do parametro para que a consulta jpql reconheça
		
		for(Filme filme:filmes) {
			System.out.println("Filme: "+filme.getNome());
			for(Ator ator:filme.getAtores()) {
				System.out.println("Atores: " +ator.getNome());
			}
		}
		
		dao.fechar();
	}
}
