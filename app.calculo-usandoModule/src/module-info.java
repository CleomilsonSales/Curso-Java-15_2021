import br.com.cleomilsonsales.app.calculoModule.CalculadoraImpl;

open module app.calculo {
	requires transitive app.logging; //dependencia por ser transmitida
	exports br.com.cleomilsonsales.app.calculoModule;
	
	//estou dizendo que apenas o modulo informados no TO "separa por virgula" podem acessar o pacote interno
	exports br.com.cleomilsonsales.app.calculo.interno
		to app.financeiro;
	
	
	//outra forma de abrir um pacote
	/*opens br.com.cleomilsonsales.app.calculo 
		to app.financeiro;*/
	
	requires app.api;
	provides br.com.cleomilsonsales.app.api.Calculadora
		with CalculadoraImpl;
}