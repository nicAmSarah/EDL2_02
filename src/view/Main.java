package view;

import javax.swing.JOptionPane;

import controller.Divisao;

public class Main {
	
	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor do primeiro numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor do segundo numero"));
		
		if(num2 == 0 ) {
			JOptionPane.showMessageDialog(null,"O valor não pode se igual a zero");
		} else {
			Divisao operacao = new Divisao();
			
			int resto = operacao.operacao(num1, num2);
			
			JOptionPane.showMessageDialog(null, "o resto de " + num1 + " / " + num2 + " é igual a: " + resto);
 
		}
	}
	
}
