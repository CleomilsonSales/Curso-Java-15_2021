package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoString {
	public static void main(String[] args) {
		//numero para string
		//com wrapper
		Integer num1 = 1000;
		System.out.println(num1.toString().length());
		
		//com primitivo
		int num2 = 1000;
		System.out.println(Integer.toString(num2).length());
		
		//string para numero
		String valor1 = JOptionPane.showInputDialog("Digite um n�mero: ");
		String valor2 = JOptionPane.showInputDialog("Digite outro n�mero: ");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
	    double soma = numero1 + numero2;
	    
	    System.out.println("Soma � "+ soma);
	    System.out.println("M�dia � "+ soma /2);
		
	}
}
