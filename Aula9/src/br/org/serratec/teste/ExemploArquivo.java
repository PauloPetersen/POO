package br.org.serratec.teste;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExemploArquivo {

	public static void main(String[] args) {
		int vetor[] = {100, 200, 400};
		int a = 10, b = 0;
	/*	try {
			FileReader fr = new FileReader("/exemplos/exercicio123.txt");
			System.out.println("Arquivo encontrado!");
			System.out.println(a/b);
			System.out.println(vetor[10]);
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
			//e.printStackTrace();
		}catch(ArithmeticException e) {
			System.out.println("Erro divisão por zero.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Vetor fora de faixa de valor.");
		}
*/
		try {
			FileReader fr = new FileReader("/exemplos/exercicio123.txt");
			System.out.println("Arquivo encontrado!");
			System.out.println(a/b);
			System.out.println(vetor[10]);
		}catch (Exception e) {
			System.out.println("Aconteceu algum problema!");
		}
	}

}
