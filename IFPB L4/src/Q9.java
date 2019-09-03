import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Valor: ");
		double n1 = scanner.nextDouble();
		
		System.out.print("Valor: ");
		double n2 = scanner.nextDouble();
		
		System.out.print("Valor: ");
		double n3 = scanner.nextDouble();
		
		double resultado = (n1+n2+n3)/3;
		
		System.out.print("Resultado: " + resultado);


	}

}
