package snippet;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int n1 = scanner.nextInt();
		

		System.out.println("Digite outro n�mero: ");
		int n2 = scanner.nextInt();
		
		//Multiplic�o
		
		int resultado = n1*n2;
		
		System.out.print("O valor � : "+ resultado);
	}

}
