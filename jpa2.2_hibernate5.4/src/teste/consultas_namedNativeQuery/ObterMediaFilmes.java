package teste.consultas_namedNativeQuery;

import infra.DAO;
import modelo.consulta_namedNativeQuery.NotaFilme;

public class ObterMediaFilmes {
	public static void main(String[] args) {
		DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
		
		NotaFilme nota = dao.consultarUm("obterMediaGeral");
		
		System.out.println("Média das notas dos filmes: " + nota.getMedia());
		
		dao.fechar();
	}
}
