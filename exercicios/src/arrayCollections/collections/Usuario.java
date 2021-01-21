package arrayCollections.collections;

public class Usuario {
	
	String nome;
	
	Usuario(String nome){
		this.nome = nome;
	}
	
	//quando for imprimir o usuario será carregado esse metodo
	public String toString() {
		return "Meu nome é "+this.nome+".";
	}

	
	//precisa do hashCode e Equals para fazer comprações pelo texto, se não tiver isso precisar criar o objeto pela variavel
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	


}
