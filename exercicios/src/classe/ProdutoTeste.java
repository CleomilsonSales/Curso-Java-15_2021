package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		//usando construtor
		Produto p1 = new Produto("Notebook", 4315.89);
		
		//usando construtor padrão
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		//mudando o desconto pra todos os produto não so para a instancia 
		Produto.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2)/2;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		
		
		
	}

}
