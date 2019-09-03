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
		
		System.out.println("Digite a ra�a do pet:");
		a.setRa�a(sr.nextLine());
		
		System.out.println("Digite a idade:");
		a.setIdade(sr.nextInt());
		
		//System.out.println("digite um codigo para o animal:");
		int codigo = 0;
		for(int i = 0; i < animais.size();i++) {
			codigo ++;
			if(animais.containsKey(codigo) == true) {
				System.out.println("codigo j� em uso");
			}else {
				animais.put(codigo, a);
				System.out.println("Codigo do pet: " + animais.get(codigo));
			}
			
		}
		
	}
	
	public void mostrarAnimal() {
		Scanner sr = new Scanner(System.in);
		System.out.println("Digite o codigo que voc� deseja pesquisar:");
		int codigo = sr.nextInt();
		if(animais.containsKey(codigo) == true) {
		
			System.out.println("nome do pet:  " + animais.get(codigo).getNome());
			System.out.println("Ra�a : " + animais.get(codigo).getRa�a());
			System.out.println("Idade : " + animais.get(codigo).getIdade());
	
		}else {
			System.out.println("pet n�o cadastrado");
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
			System.out.println("pet n�o encontrado ou n�o cadastrado");
		}
	}
	
	

}
