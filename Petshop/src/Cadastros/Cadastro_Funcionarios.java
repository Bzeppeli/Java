package Cadastros;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cadastro_Funcionarios {
	
	
	Map<Integer, Funcionarios> funcionario = new HashMap<Integer, Funcionarios>();
	
	public void cadastrarFuncionario() {
		Scanner sr = new Scanner(System.in);
		Funcionarios f = new Funcionarios();
		
		System.out.println("digite o nome do funcionario:");
		f.setNome(sr.nextLine());
		
		System.out.println("digite o cpf:");
		f.setCpf(sr.nextLine());
		
		System.out.println("Digite o Numero de telefone do funcionario:");
		f.setN_telefone(sr.nextLine());
		
		System.out.println("digite um codigo:");
		int codigo = sr.nextInt();
		if(funcionario.containsKey(codigo) == true) {
			System.out.println("chave já atribuida a um funcionario");
		}else {
			funcionario.put(codigo, f);
		}
		
	}
	
	public void mostrarFuncionario(int codigo) {
		if (funcionario.containsKey(codigo)) {
			System.out.println("nome: " + funcionario.get(codigo).getNome());
			System.out.println("CPF : " + funcionario.get(codigo).getCpf());
			System.out.println("Numero de telefone : " + funcionario.get(codigo).getN_telefone());
		}else {
			System.out.println("funcionario invalido ou não cadastrado");
		}
	}
	
	public void removerFuncionario() {
		Scanner sr = new Scanner(System.in);
		int codigo = sr.nextInt();
		if(funcionario.containsKey(codigo) ==  true) {
			System.out.println("Digite o codigo do funcionario que deseja deletar:");
			funcionario.remove(codigo);
		}else {
			System.out.println("funcionario invalido ou não cadastrado");
		}
	}
	
	
	

}
