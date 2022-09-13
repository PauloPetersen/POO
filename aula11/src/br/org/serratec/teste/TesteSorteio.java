package br.org.serratec.teste;

import br.org.serratec.model.Funcionario;
import br.org.serratec.model.Sorteio;

public class TesteSorteio {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Ana", "a@gmail.com", 5600.);
		Funcionario f2 = new Funcionario("Julia", "j@gmail.com", 2600.);
		Funcionario f3 = new Funcionario("Silvana", "s@gmail.com", 4600.);
		Funcionario f4 = new Funcionario("Mario", "m@gmail.com", 9600.);

		Sorteio<Funcionario> sort = new Sorteio<>();
		sort.adicionar(f1);
		sort.adicionar(f2);
		sort.adicionar(f3);
		sort.adicionar(f4);

		System.out.println("Quem ganhou o sorteio foi: " + sort.sorteio());

	}

}
