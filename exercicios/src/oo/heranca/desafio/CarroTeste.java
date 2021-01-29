package oo.heranca.desafio;

public class CarroTeste {
	public static void main(String[] args) {
		Carro civic = new Civic("Civic");
		
		civic.acelerar();
		System.out.println(civic);
		
		civic.acelerar();
		System.out.println(civic);
		
		Carro ferrari = new Ferrari("Ferrari");
		
		ferrari.acelerar();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		System.out.println(ferrari);
		
		ferrari.frear();
		System.out.println(ferrari);
	}
}
