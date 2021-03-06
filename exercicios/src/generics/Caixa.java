package generics;

public class Caixa<T> {
	//Classe generica usa o <T>
	private T coisa;
	
	public void guardar(T coisa) {
		//set
		this.coisa = coisa;
	}
	
	public T abrir() {
		//get
		return coisa;
	}
	
}
