package Calculadora;

public class Oppera��es {

	Calc calculadora = new Calc();
	
	public int soma(int numero, int numero2) {
		
		calculadora.setNumeros(numero);
		calculadora.setNumeros(numero2);
		
		return numero + numero2;
	}
	
	public int muliplica��o(int numero, int numero2) {
		
		calculadora.setNumeros(numero);
		calculadora.setNumeros(numero2);
		
		return numero * numero2;
	}
	
	public int subtra��o(int numero, int numero2) {
		
		calculadora.setNumeros(numero);
		calculadora.setNumeros(numero2);
		
		return numero - numero2;
		
	}
	
	public int divis�o(int numero, int numero2) {
		
		calculadora.setNumeros(numero);
		calculadora.setNumeros(numero2);
		
		return numero/numero2;
	}
	
}
