package oo.heranca;

public class Jogador {
	
	//AULA HERANÇA ENUM
	int vida = 100;
	int x;
	int y;
	
	boolean atacar(Jogador oponente) {
		//Math.abs - pegando o valor absoluto, ignorando se é posito ou negativo
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		//verificando se os jogadores estão um do lado do outro
		if (deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		}else if (deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		}else {
			return false;
		}
		
	}
	
	boolean andar(Direcao direcao) {
		switch(direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		
		return true;
	}
}
