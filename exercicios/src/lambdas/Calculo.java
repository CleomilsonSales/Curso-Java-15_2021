package lambdas;

@FunctionalInterface //forma a interface ter apenas uma funçao para usar o lambda sem margens de erro
public interface Calculo {
	double executar(double a, double b);
	
	//interfaces funcionais permitem sem problema definir metodos defaul e static
	// porque o lambda sempre irá usar o public abstract
	default String outroMetodo() {
		return "não usará o lambda";
	}
	
	//static é relacionado a classe tem que chamar pela classe
	static String outroMetodo2() {
		return "não usará o lambda";
	}
}