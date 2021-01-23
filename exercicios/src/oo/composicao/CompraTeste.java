package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Cleomilson Sales";
		
		compra1.adicionarItem("Caneta",20,7.45);
		compra1.adicionarItem(new Item("Lapis",13,0.45));
		compra1.adicionarItem(new Item("Caderno",4,3.2));
		compra1.adicionarItem(new Item("Borracha",10,1.00));
		
		System.out.println(compra1.itens.size()+" Itens");
		System.out.println("R$ "+compra1.obterValorTotal());
		
		//relação bidirencional
		double total = compra1.itens.get(0).compra.
				itens.get(1).compra.obterValorTotal();
		System.out.println("R$ "+total);
	}
}
