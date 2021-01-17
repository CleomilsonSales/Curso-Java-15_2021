package classeMetodos;

public class AreaCirc {

	double raio;
	//final torna a variavel constante
	//static torna a variavel da classe e não da instancia
	final static double PI = 3.1415;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		//math.pow como pow é uma static não precisa iniciar o objeo Math, pode chamar direto
		return PI * Math.pow(raio, 2);
	}
	
	//para chamar direto sem instanciar o objeto
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
	
}
