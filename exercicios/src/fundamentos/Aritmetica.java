package fundamentos;

public class Aritmetica {
	
	public static void main(String[] args) {
		int x = 8;
		int y = 3;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x /  (double) y);
		
		//Operador modulo - restos de um divis�o
		System.out.println(x % y);
		
		//precedente no java - multiplica��o e divs�o � processada primeiro 
		//depois soma e substra��o, n�o precisa usar parenteses
		
		System.out.println(x + y - x * y);
		
		//elevar um numero a um detemindada potencia
		//elevando o resultado de uma express�o aritimetica ao cubo
		int exp = 3*4-10;
		int i = (int) Math.pow(exp, 3);
		System.out.println(i);
		
		//opera��o aritmetica
		
		
		
		
		
		
		
		
	}

}
