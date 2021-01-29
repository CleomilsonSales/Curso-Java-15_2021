package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	Ferrari(String nomeCarro) {
		super(nomeCarro);
	}

	//override é uma validação que o eclipse/java usa para entender que relamente esta sendo sobrescrito um metodo de uma classe pai
	@Override
	void acelerar() {
		velocidadeAtual += 15;
	}
}
