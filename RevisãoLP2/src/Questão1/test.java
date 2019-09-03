package Questão1;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Circulo a = new Circulo();
		Scanner sr = new Scanner(System.in);
		
		System.out.println("digite o raio");
		a.areaCiruclo(sr.nextFloat());
		
		System.out.println("digite o raio: ");
		a.diamentroCirculo(sr.nextFloat());
		
		System.out.println("digite o raio");
		a.periCircunferencia(sr.nextFloat());

	}

}
