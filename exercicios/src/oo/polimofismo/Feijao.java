package oo.polimofismo;

public class Feijao extends Comida {

	public Feijao(double peso) {
		super(peso);
	}

	@Override
	public int nutriente(int peso) {
		return peso += 10;
	}
	
}
