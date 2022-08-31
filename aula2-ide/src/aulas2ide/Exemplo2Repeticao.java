package aulas2ide;

public class Exemplo2Repeticao {

	public static void main(String[] args) {
		String[]vetor = {"Ana", "Maria", "Carlos", "Carla"};
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		System.out.println("____________________");
		
		for (String nome : vetor) {
			System.out.println(nome);
		}

	}

}
