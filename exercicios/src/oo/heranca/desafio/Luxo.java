package oo.heranca.desafio;

public interface Luxo {

	void ligarAr();
	void desligarAr();
	//caso n�o seja implementado
	default int velocidadeDoAr() {
		return 1;
	}
}
