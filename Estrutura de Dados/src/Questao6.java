import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de pessoas cadatradas: ");
		int n = Integer.parseInt(sc.nextLine());
		
		Integer idade [] = new Integer[n];
		double alturas [] = new double[n];
		double pesos [] = new double [n];
		
		//leitura de valores
		for(int i = 0; i<n; i++) {
			System.out.println("Digite a idade das pessoas "+(i+1)+":");
			idade[i] = Integer.parseInt(sc.nextLine());
			System.out.println("Digite a altura das pessoas "+(i+1)+":");
			alturas[i] = Double.parseDouble(sc.nextLine());
			System.out.println("Digite a peso das pessoas "+(i+1)+":");
			pesos[i] = Double.parseDouble(sc.nextLine());
			
		}
		//escrita de valores
		
		for(int i = 0; i<n; i++) {
		System.out.println("Idade das pessoas"+(i+1)+":");
		System.out.println(idade[i]);
		System.out.println("Altura das pessoas"+(i+1)+":");
		System.out.println(alturas[i]);
		System.out.println("peso das pessoas"+(i+1)+":");
		System.out.println(pesos[i]);
	}
//quantidade de pessoas com mais de 50 anos
		
		int idadeMaioresDoQue50 = 0;
	    for(int i = 0; i<idade.length; i++) {
		if(idade[i]>50) {
			idadeMaioresDoQue50++;
		}
	    }
	    System.out.println("A quantidade de pessoas moires que 50 anos é:"+ idadeMaioresDoQue50);
		
		//a média da alturas das pessoas entre 20 e 10 anos
	    
	    int quantidadePessoasComAlturaEntre10e20 = 0;
	    double somaAlturasEntre10e20 = 0;
	    for(int i = 0; i<alturas.length; i++) {
	    	
	    	if(idade[i]>10 && idade[i]<20) {
	    		somaAlturasEntre10e20 += alturas[i];
	    		quantidadePessoasComAlturaEntre10e20++;
	    	}
	    	}
	    
	    double mediaAlturasEntre10e20 = somaAlturasEntre10e20/quantidadePessoasComAlturaEntre10e20;
	    System.out.println("A média das alturas das pessoas com idades"
	    + " entre 10 e 20 anos é:" +mediaAlturasEntre10e20);
	    
	    //A porcentagem de pessoas com peso inferior a 40 quilos entre todas as pesssoas analisadas
	    
	    int pessoasComPesoInferiorA40 = 0;
	    for(int i = 0; i<pesos.length; i++) {
	    	if(pesos[i]<40) {
	    		pessoasComPesoInferiorA40++;
	    	}
	    	}
	    System.out.println(pessoasComPesoInferiorA40);
	    System.out.println(pesos.length);
	    
	    double porcentagemPesoInferiorA40 = (double)pessoasComPesoInferiorA40/pesos.length;

	    System.out.println("A porcentagem de pessoas com peso inferior a 40 Kg é: "+ pessoasComPesoInferiorA40);

	    
	    
}
}