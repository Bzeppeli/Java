package Cadastros;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cadastro_Clientes {
	
	Map<Integer, Clientes> cliente = new HashMap<Integer, Clientes>();
	
	public void cadastrarCliente() {
		Scanner sr = new Scanner(System.in);
		Clientes c = new Clientes();
		
		System.out.println("digite o nome do Cliente: \n");
		c.setNome(sr.nextLine());
		
		System.out.println("Digite o cpf");
		c.setCpf(sr.nextLine());
		
		System.out.println("Digite o numero de telefone");
		c.setN_telefone(sr.nextInt());
		
		System.out.println("Digite o endereço");
		c.setEndereco(sr.nextLine());
		
		System.out.println("digite um codigo");
		int codigo = sr.nextInt();
		if(cliente.containsKey(codigo) == true) {
			System.out.println("codigo já em uso");
		}else {
			cliente.put(codigo, c);
		}
		
	}
	
	public void mostrarCliente(int codigo) {
		if (cliente.containsKey(codigo)) {
			System.out.println("nome: " + cliente.get(codigo).getNome() + "\n");
			System.out.println("CPF : " + cliente.get(codigo).getCpf() + "\n");
			System.out.println("Numero de telefone : " + cliente.get(codigo).getN_telefone() + "\n");
			System.out.println("Endereço: " + cliente.get(codigo).getEndereco() + "\n");
			
		}else {
			System.out.println("Cliente invalido ou não cadastrado");
		}
	}
	
	public void removerCliente(int codigo) {
		if(cliente.containsKey(codigo) ==  true) {
			System.out.println("digite o codigo do cliente que deseja deletar:");
			cliente.remove(codigo);
		}else {
			System.out.println("Cliente invalido ou não cadastrado");
		}
	}

}
