package modelo.composicao;

import javax.persistence.Embeddable;

@Embeddable // quer dizer que n�o sera criada uma tabela, os dados ser�o colocados dentro
			// das tabelas que chamarem
public class Endereco {
	private String logradouro;
	private String complemento;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
