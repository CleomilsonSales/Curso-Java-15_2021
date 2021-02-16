package Streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	//private para impedir que algum instancie uma nova classe daqui ja que tudo é static
	private Utilitarios() {
		
	}
	
	public final static UnaryOperator<String> maiuscula = 
			n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = 
			n -> n.charAt(0) + "";
	public final static String grito (String n) {
		return n + n + "!!!";
	}
			
}
