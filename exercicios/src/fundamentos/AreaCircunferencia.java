package fundamentos;

//jshell para entrar no intepretador do java no terminal

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		// final é um constante 
		//convesão diz que constante dever ser com maiuscula
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		
		System.out.println("Área = " + area + "m2.");
	}

}
