package oo.heranca;

public class Jogo {
	
	public static void main(String[] args) {
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;
		
		System.out.println("Monstro 1 vida: "+monstro.vida);
		System.out.println("Heroi 2 vida: "+heroi.vida);
		
		System.out.println("ataque: "+monstro.atacar(heroi));
		System.out.println("ataque: "+heroi.atacar(monstro));
		System.out.println("Monstro 1 vida: "+monstro.vida);
		System.out.println("Heroi 2 vida: "+heroi.vida);
		
		monstro.andar(Direcao.LESTE);
		monstro.andar(Direcao.NORTE);
		monstro.andar(Direcao.OESTE);
		
		System.out.println(monstro.y);
		System.out.println(monstro.x);
	}

}
