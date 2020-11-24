package fundamentos;

public class NotacaoPonto {
	
	/*
	 tipo primitivos não tem notação de ponto pq não são objetos
	 mas algunas primitivos basta chamar com a primeira letra maiuscula
	 que ele sera um objeto e assim podera usar a notação ponto, isso 
	 chama de wrapper.
	 ex.:
	 Integer - int
	 Character - char
	 
	 os demais so iniciar com maiuscula que será um objeto
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
