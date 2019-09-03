import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Valor: ");
		int n1 = scanner.nextInt();
		
		int resultado = (int) Math.sqrt(n1);
		
		System.out.print("Resultado: " + resultado);

	}

}
