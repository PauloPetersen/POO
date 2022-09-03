package ExercicioAula4;


import java.util.Scanner;


public class TesteVendedor {

	public static void main(String[] args) {

		Double valorVenda;
		int vendedor;
		Fixo x;
		Scanner sc = new Scanner(System.in);
		Fixo vendedorFixo = new Fixo("Erick", "12345", 1000.);
		Fixo vendedorFixo2 = new Fixo("Joana", "12345", 2000.);

		System.out.println("Vendedores: ");
		System.out.println("1-" + vendedorFixo.getNome());
		System.out.println("2-" + vendedorFixo2.getNome());
		System.out.println("Escolha o vendedor: ");
		
		vendedor = sc.nextInt();
		if(vendedor == 1) {
			x = vendedorFixo;
		} else {
			x = vendedorFixo2;
		}
		
		
		System.out.println("Digite o valor da venda: ");
		x.setVenda(sc.nextDouble());

		x.calcularSalario();
		System.out.println(x.getSalarioBruto());

	}

}
