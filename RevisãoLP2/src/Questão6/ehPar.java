package Questão6;

public class ehPar {
	
	private int numero;

	public ehPar(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean numeroPar(ehPar numero) {
		if(numero % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}

}
