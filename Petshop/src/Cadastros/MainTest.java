package Cadastros;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sr = new Scanner(System.in);
		Cadastro_Animais ca = new Cadastro_Animais();
		Cadastro_Funcionarios cf = new Cadastro_Funcionarios();
		Casdastro_Produtos cp = new Casdastro_Produtos();
		
		System.out.println("quantos animais deseja cadastrar? ");
		int a = sr.nextInt();
		while(a > 0) {
		ca.cadastrarAnimal();
		a--;
		}
		ca.mostrarAnimal();
		ca.mostrarAnimal();
		
		ca.deletarAnimal();
	}

}
