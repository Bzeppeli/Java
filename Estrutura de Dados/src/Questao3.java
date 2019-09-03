import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("(1) para mostra a area");
	int opc1 = sc.nextInt();
	System.out.println("(2) para mostrar o perimetro");
	int opc2 = sc.nextInt();
	System.out.println("(3) sair");
	int opc3 = sc.nextInt();
	
	
	
	
	
	//calculando a area
	
	if(opc1==1) {
		
	System.out.println("Digite a medida de base: ");
	int medida1 = sc.nextInt();
	
	System.out.println("Digite a medida de altura: ");
	int medida2 = sc.nextInt();
	
	int area = medida1*medida2;
	
	System.out.print("A area será: " + area);
	}
	
	//calculando o perimetro
	
	if(opc2==2) {
		
	System.out.println("Digite a medida de cima: ");
	int cima = sc.nextInt();
	
	System.out.println("Digite a medida de baixo: ");
	int baixo = sc.nextInt();
	
	System.out.println("Digite a medida de esquerda: ");
	int esquerda = sc.nextInt();
			
	System.out.println("Digite a medida de direita: ");
	int direita = sc.nextInt();
	
	int perimetro = cima+baixo+esquerda+direita;
	
	System.out.println("O perímetro sera: "+ perimetro);
	}
	}
	
	
	
}
