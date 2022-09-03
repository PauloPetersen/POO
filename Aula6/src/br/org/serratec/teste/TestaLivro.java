package br.org.serratec.teste;

import br.org.serratec.model.Livro;
import br.org.serratec.model.Operacao;

public class TestaLivro {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Marco Antônio", "Cisco CCNA", 85.); 
		Livro livro2 = new Livro("Kathy Sierra", "Use a Cabeça Java", 98.);
		
		Operacao operacao1 = new Operacao("Venda ", 85., livro1);
		Operacao operacao2 = new Operacao("Empréstimo", 98., livro2);
		
		livro1.reajuste(6.);
		operacao1.venderLivro(livro1);
		operacao2.emprestarLivro(livro2);
		
		System.out.println(operacao1);
		System.out.println(operacao2);
	}

}
