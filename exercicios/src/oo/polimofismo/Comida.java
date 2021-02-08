package oo.polimofismo;

//classes abstract não podem ser instanciadas
public abstract class Comida {
	
	private double peso;

	//metodo abstrato é para que ele seja definido em quem extender essa classe
	public abstract int nutriente(int peso);
	
	public Comida(double peso) {
		setPeso(peso);
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}
	}
	
	
}
