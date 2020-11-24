package fundamentos;

public class NotacaoPonto {
	
	/*
	 tipo primitivos n�o tem nota��o de ponto pq n�o s�o objetos
	 mas algunas primitivos basta chamar com a primeira letra maiuscula
	 que ele sera um objeto e assim podera usar a nota��o ponto, isso 
	 chama de wrapper.
	 ex.:
	 Integer - int
	 Character - char
	 
	 os demais so iniciar com maiuscula que ser� um objeto
	  */
	
	
	public static void main(String[] args) {
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("Oba".toUpperCase());
		
		String y = "Bom dia X"
				.replace("X", "Chico")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
	}

}
