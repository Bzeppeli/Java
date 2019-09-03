package Cadastros;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Casdastro_Produtos {
	
	
	Map<Integer, Produtos> produto = new HashMap <Integer, Produtos>();
	
	public void cadastrarProdutos() {
		
		Scanner sr = new Scanner(System.in);
		Produtos p = new Produtos();
		
		System.out.println("Digite o nome do produto");
		p.setDescricao(sr.nextLine());
		
		System.out.println("Digite o preço do produto");
		p.setPreco(sr.nextFloat());
		
		System.out.println("Digite a quantidade do produto");
		p.setQuantidade(sr.nextInt());
		
		System.out.println("Digite um codigo para o produto");
		int codigo = sr.nextInt();
		if(produto.containsKey(codigo) == true) {
			System.out.println("Codigo já associado a um produto");
		}else {
			produto.put(codigo, p);
		}
	}
	
	public void mostrarProduto() {
		Scanner sr = new Scanner(System.in);
		int codigo = sr.nextInt();
		
		if(produto.containsKey(codigo) == true) {
			System.out.println("");
		}
		
	}
	
	public void deletarProduto() {
		Scanner sr = new Scanner(System.in);
		int codigo = sr.nextInt();
		
		if(produto.containsKey(codigo) == true) {
			System.out.println("Digite o codigo do produto que deseja deletar:");
			produto.remove(codigo);
		}else {
			System.out.println("Produto invalido ou não cadastrado");
		}
				
	}
	

}
