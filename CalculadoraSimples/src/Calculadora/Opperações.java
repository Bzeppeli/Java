package Calculadora;

public class Opperações {

	Calc calculadora = new Calc();
	
	public int soma(int numero, int numero2) {
		
		calculadora.setNumeros(numero);
		calculadora.setNumeros(numero2);
		
		return numero + numero2;
	}
	
	public int muliplicação(int numero, int numero2) {
		
		calculadora.setNumeros(numero);
		calculadora.setNumeros(numero2);
		
		return numero * numero2;
	}
	
	public int subtração(int numero, int numero2) {
		
		calculadora.setNumeros(numero);
		calculadora.setNumeros(numero2);
		
		return numero - numero2;
		
	}
	
	public int divisão(int numero, int numero2) {
		
		calculadora.setNumeros(numero);
		calculadora.setNumeros(numero2);
		
		return numero/numero2;
	}
	
}
