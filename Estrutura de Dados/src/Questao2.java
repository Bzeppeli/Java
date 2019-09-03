import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o sexo : ");
		String sexo = sc.nextLine();
		
		while(!(sexo.equalsIgnoreCase("M")||sexo.equalsIgnoreCase("F"))) {
			System.out.println("Valido apenas as opções : M,m,F ou f");
			System.out.println("Digite o sexo");
			sexo = sc.nextLine();
		}
		
	if(sexo.equalsIgnoreCase("M")) {
		System.out.println("Terar que trabalhar 35 anos");
	}
	
	if(sexo.equalsIgnoreCase("F")) {
		System.out.println("Terar que trabalhar 30 anos");
	}
	}

}
