package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	//construtor padrão
	Produto(){	
	}
	
	Produto(String nomeInicial,
			double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}	
	
	//metodo - quando parametros ja estão no objeto, não precisa passar no metodo para recebe-los, basta chama-los
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	//chamado um parametros que esta fora do objeto
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
