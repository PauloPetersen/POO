import java.util.Iterator;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		// Fazer um programa para ler um número inteiro positivo N. O programa
		// deve então mostrar na tela N linhas, começando de 1 até N. Para cada
		// linha, mostrar o número da linha, depois o quadrado e o cubo do valor,
		// conforme exemplo.

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um número inteiro: ");
		Integer numero = scan.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			//System.out.println(i + " " + i * i + " "+ i * i * i);
			System.out.println(i + " " + Math.pow(i, 2) + " "+ Math.pow(i, 3));
			
		}
		
		scan.close();

	}

}
