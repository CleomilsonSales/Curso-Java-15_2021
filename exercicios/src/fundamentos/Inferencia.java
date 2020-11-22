package fundamentos;

public class Inferencia {
	//inferencia é vc não definir o tipo da variavel, o java
	// vai reconhecer o tipo basedo no primeiro conteudo informado
	//para ela;
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		//inferencia tem que iniciar na declaraçao da variavel
		double d;
		d = 123.65;
		System.out.println(d);
		
	}

}
