package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout()); //uma visão simples
		janela.setLocationRelativeTo(null); // Centralizado no meio da tela
		
		JButton botao = new JButton("Clicar!");
		janela.add(botao);
		
		//Observer
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Evento ocorreu!");
			}
		});
		
		//como o observer é uma interface Function posso usar um lambda
		/*botao.addActionListener(e -> {
			System.out.println("Evento ocorreu!");
		});*/
		
		janela.setVisible(true);
	}
}
