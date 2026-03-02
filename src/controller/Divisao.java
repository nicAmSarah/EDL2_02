package controller;

public class Divisao {

	public Divisao() {
		super();
	}
	
	public int operacao(int num1, int num2) {
		if ( num1 < num2) {
			return num1;
		}
		return operacao(num1 - num2, num2) ;
	}
}
	