package Questão5;

public class MenorInteiro {
	
	public static void main(String[] args) {
		int[] inteiros = {2,5,6,1,4,7,12};
		int min = 20;
		
		for(int i = 0; i <= inteiros.length -1; i++) {
			if(inteiros[i] < min) {
				min = inteiros[i];
			}
		}
		System.out.println("o Menor valor é: " + min);
	}

}
