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
		
		//Operador modulo - restos de um divisão
		System.out.println(x % y);
		
		//precedente no java - multiplicação e divsão é processada primeiro 
		//depois soma e substração, não precisa usar parenteses
		
		System.out.println(x + y - x * y);
		
		//elevar um numero a um detemindada potencia
		//elevando o resultado de uma expressão aritimetica ao cubo
		int exp = 3*4-10;
		int i = (int) Math.pow(exp, 3);
		System.out.println(i);
		
		//operação aritmetica
		
		
		
		
		
		
		
		
	}

}
