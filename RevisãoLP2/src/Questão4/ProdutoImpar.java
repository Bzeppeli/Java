package Questão4;

public class ProdutoImpar {
	
	public static void main(String[] args) {
		
		int num = 1;
		int aux;
		for(int i=1; i <=15; i++) {
			if(i%2 == 1) {
				aux = num;
				int produto =i * aux;
				System.out.println(produto);
			}
			num++;
		}
		
	}

}
