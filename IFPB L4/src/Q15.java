import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Salario: ");
		double Salario = scanner.nextDouble();
		
		int percentual = scanner.nextInt();
		
		double novoSalario = Salario*(percentual/100.0)+ Salario;
		
		System.out.printf("%2f ", novoSalario );
	}

}
