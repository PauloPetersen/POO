import java.util.Scanner;

public class Exercicio01 {
// Leia um valor inteiro x (1 <= x <= 1000). Em seguida os impares de 1, inclusive o
// x, se for o caso.,
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		Integer numero = scan.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		scan.close();
		
	}
	
}
