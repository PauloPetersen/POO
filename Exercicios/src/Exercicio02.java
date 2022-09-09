import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//Ler um numero inteiro N e calcular todos os seus divisores.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe um número inteiro: ");
		Integer numero = scan.nextInt();
		
		for(int i = numero; i > 0; i--) {
			if (numero % i == 0) {
				System.out.println(i);
			}
		}
		
		scan.close();
	}

}
