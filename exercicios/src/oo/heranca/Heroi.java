package oo.heranca;

public class Heroi extends Jogador {
	
	//criar um variavel do tipo protected será visivel pela herança (extends) mas deve ser chamada 
	//sem instancionar o objeto, deve ser chamada direito igual o public
	
	//herdando tudo do jogador
	
	Heroi(int x, int y){
		super(x, y);
	}
	
	//sobreescrenvendo metodo
	boolean atacar(Jogador oponente) {
		//Math.abs - pegando o valor absoluto, ignorando se é posito ou negativo
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		//verificando se os jogadores estão um do lado do outro
		if (deltaX == 0 && deltaY == 1) {
			oponente.vida -= 20;
			return true;
		}else if (deltaX == 0 && deltaY == 1) {
			oponente.vida -= 20;
			return true;
		}else {
			return false;
		}
		
		/*
		 * pode tambem chamar o metodo da clase ao inves de altera-la
		 * para usar na situação de atacar mais fotes
		 
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		return ataque1 || ataque2;
		*/
	}
}
