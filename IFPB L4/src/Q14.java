import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um valor com três digitos: ");
		int n1 = scanner.nextInt();
		
		int c = n1/100;
		int d = (n1/10)%10;
		int u = n1%10;
		
		System.out.println("Resultado C : " + c );
		System.out.println("Resultado D : " + d );
		System.out.println("Resultado U : " + u );

	}

}
