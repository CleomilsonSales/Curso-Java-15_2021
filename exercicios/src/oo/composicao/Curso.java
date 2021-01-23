package oo.composicao;

import java.util.List;
import java.util.ArrayList;

public class Curso {
	
	final String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	Curso(String nome){
		this.nome = nome;
	}
	
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);	
	}

}
