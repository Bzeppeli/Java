import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int notas[] = new int[5];
		
		for (int i=0; i<5 ;i++) {
			
			System.out.println("Digite o numero"+i);
			int n  = scanner.nextInt();
			
			
		}
		int soma = 0;
		int menor = notas [0];
		int maior = notas [0];
		for (int i = 0;i<5;i++) {
		soma = soma + notas[i];	
		
		if(notas[i] < menor)
			menor = notas[i];
		
		if(notas[i] > maior)
			maior = notas[i];
		
	}
		
		//Saída
		System.out.printf("\n");
		int i = 0;
	    for (i=0; i<5; i++) {
	      if (notas[i] == menor)
	    	  
	        System.out.printf("v[%d] = %2d <--- menor valor\n", i, notas[i]);
	      
	      else if (notas[i] == maior)
	              System.out.printf("v[%d] = %2d <--- maior valor\n", i, notas[i]);
	      
	           else System.out.printf("v[%d] = %2d\n", i, notas[i]);
	}
	}
}