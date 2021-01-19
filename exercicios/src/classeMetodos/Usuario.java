package classeMetodos;

public class Usuario {
	
	String nome;
	String email;
	
	public boolean equals(Object objeto) {
		
		//Verificando se o objeto passado ja é um Usuario para evitar erro passar objetos diferentes
		if (objeto instanceof Usuario) {
		
			//fazendo um cast do objeto para ser um objeto Usuario
			Usuario outro = (Usuario) objeto;
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			//retornando a comparações tabela verdade dos dois booleans
			return nomeIgual && emailIgual;
		}else {
			return false;
		}
	}
	
	//hashCode
	public int hashCode() {
		//zero por enquanto
		return 0;
	}

}
