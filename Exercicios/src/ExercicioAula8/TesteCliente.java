package ExercicioAula8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Cliente> listaDeClientes = new ArrayList<>();

		Integer id = 0;
		String nome;
		Integer idade;
		String telefone;

		do {
			System.out.println("Informe o id: ");
			id = sc.nextInt();
			System.out.println("Informe o nome: ");
			nome = sc.next();
			System.out.println("Informe o idade: ");
			idade = sc.nextInt();
			System.out.println("Informe o seu telefone: ");
			telefone = sc.next();
			listaDeClientes.add(new Cliente(id, nome, idade, telefone));
		} while (id >= 0);

		System.out.println(listaDeClientes);
		sc.close();

	}

}

