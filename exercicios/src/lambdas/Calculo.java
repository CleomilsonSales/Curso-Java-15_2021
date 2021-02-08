package lambdas;

@FunctionalInterface //forma a interface ter apenas uma fun�ao para usar o lambda sem margens de erro
public interface Calculo {
	double executar(double a, double b);
	
	//interfaces funcionais permitem sem problema definir metodos defaul e static
	// porque o lambda sempre ir� usar o public abstract
	default String outroMetodo() {
		return "n�o usar� o lambda";
	}
	
	//static � relacionado a classe tem que chamar pela classe
	static String outroMetodo2() {
		return "n�o usar� o lambda";
	}
}