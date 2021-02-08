package oo.polimofismo;

public class Sorvete extends Comida {

	public Sorvete(double peso) {
		super(peso);
	}

	@Override
	public int nutriente(int peso) {
		return peso += 2;
	}
	
}
