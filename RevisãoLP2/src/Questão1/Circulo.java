package Questão1;

public class Circulo {
	
	//Circulo circulo = new Circulo();
	
	private float raio;
	
	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	public void diamentroCirculo(float raio) {
		
		float diametro = 2*raio;
		System.out.println("Diametro do circulo é: " + diametro);
		
	}
	
	public void periCircunferencia(float raio) {
		
		
		float periCircun = (float) (2*Math.PI);
		System.out.println("O perimetro da Circunferencia é: " + periCircun);
	
	}
	
	public void areaCiruclo(float raio) {
		
		
		float area = (float) (Math.PI*Math.pow(raio, 2));
		System.out.println("Area do circulo: " + area);
	}
	
}
