package br.org.serratec.exemplos;

import java.time.LocalDate;
import java.util.List;

public class Exemplo02 {

	public static void main(String[] args) {
		//ALT+SHIFT+R - Alterar nome de variáveis e métodos
		//CTRL+SHIFT+F - Identação do programa
		int preco = 100;
		preco = 300;
		//CTRL+SHIFT+O - Importar pacote
		List Alunos;
		LocalDate data = LocalDate.now();
		System.out.println("Hoje é dia: "+ data);
		System.out.println(preco);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}

}
