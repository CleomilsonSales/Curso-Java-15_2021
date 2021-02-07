package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivos,Luxo {
	
	private boolean ligadoTurbo = false;
	private boolean ligadoAr = false;
	
	public Ferrari(String nomeCarro,int velocidadeMaxima) {
		super(nomeCarro,velocidadeMaxima);
		setDelta(15);
	}
	
	@Override
	public void desligarTurbo() {
		ligadoTurbo = false;
	}
	
	@Override
	public void ligaTurbo() {
		ligadoTurbo = true;
	}
	
	@Override
	public void ligarAr() {
		ligadoAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligadoAr = false;
	}
	
	public int getDelta() {
		if (ligadoTurbo && !ligadoAr) {
			return 35;
		}else if (ligadoTurbo && ligadoAr) {
			return 30;
		}else if (!ligadoTurbo && !ligadoAr) {
			return 20;
		}else {
			return 15;
		}
	}
	

	//override é uma validação que o eclipse/java usa para entender que relamente esta sendo sobrescrito um metodo de uma classe pai
	/*@Override
	void acelerar() {
		velocidadeAtual += 15;
	}*/
}
