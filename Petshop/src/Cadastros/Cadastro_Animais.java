package Cadastros;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cadastro_Animais {
	
	
	Map <Integer, Animais> animais = new HashMap<Integer, Animais>();
	
	
	public void cadastrarAnimal() {
		
		Scanner sr = new Scanner(System.in);
		Animais a = new Animais();
		
		System.out.println("digite o nome do Pet:");
		a.setNome(sr.nextLine());
		
		System.out.println("Digite a raça do pet:");
		a.setRaça(sr.nextLine());
		
		System.out.println("Digite a idade:");
		a.setIdade(sr.nextInt());
		
		//System.out.println("digite um codigo para o animal:");
		int codigo = 0;
		for(int i = 0; i < animais.size();i++) {
			codigo ++;
			if(animais.containsKey(codigo) == true) {
				System.out.println("codigo já em uso");
			}else {
				animais.put(codigo, a);
				System.out.println("Codigo do pet: " + animais.get(codigo));
			}
			
		}
		
	}
	
	public void mostrarAnimal() {
		Scanner sr = new Scanner(System.in);
		System.out.println("Digite o codigo que você deseja pesquisar:");
		int codigo = sr.nextInt();
		if(animais.containsKey(codigo) == true) {
		
			System.out.println("nome do pet:  " + animais.get(codigo).getNome());
			System.out.println("Raça : " + animais.get(codigo).getRaça());
			System.out.println("Idade : " + animais.get(codigo).getIdade());
	
		}else {
			System.out.println("pet não cadastrado");
		}
	}
	
	public void deletarAnimal() {
		
		Scanner sr = new Scanner(System.in);
		System.out.println("Digite o codigo do pet que deseja deletar:");
		int codigo = sr.nextInt();
		if(animais.containsKey(codigo) == true) {
			animais.remove(codigo);
			System.out.println("Deletado com sucesso!");
		}else {
			System.out.println("pet não encontrado ou não cadastrado");
		}
	}
	
	

}
