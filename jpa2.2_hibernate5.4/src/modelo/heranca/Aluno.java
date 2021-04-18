package modelo.heranca;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) //herança cada tela com sua tabela
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //herança usando apenas uma tabela - usa do discriminator
@Inheritance(strategy = InheritanceType.JOINED)//herança cria um tabela de junção - usa do discriminator
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("AL") //qualquer coisa que mostre a diferença
public class Aluno {
	@Id
	private Long matricula;
	private String nome;

	public Aluno() {

	}

	public Aluno(Long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
