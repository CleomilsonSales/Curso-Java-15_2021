package oo.polimofismo;

public class Arroz extends Comida {

	public Arroz(double peso) {
		super(peso);
	}

	public int nutriente(int peso) {
		return peso += 5;
	}
	
}
