package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {
	public static void main(String[] args) {
		DAO<Aluno> alunoDAO = new DAO<>();
		Aluno aluno = new Aluno(123L, "João");
		AlunoBolsista aluno2 = new AlunoBolsista(3145L, "Maria", 1000);
		alunoDAO.incluirAtomico(aluno);
		alunoDAO.incluirAtomico(aluno2);
		
		alunoDAO.fechar();
	}
}
