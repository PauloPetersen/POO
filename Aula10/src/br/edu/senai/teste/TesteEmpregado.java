package br.edu.senai.teste;

import br.edu.senai.model.Empregado;

public class TesteEmpregado {

	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("123", "Ronaldo");
		Empregado empregado2 = new Empregado("123", "Ronaldo");
		
		if(empregado1.equals(empregado2)) {
			System.out.println("Iguais! ");
			
		}else {
			System.out.println("Diferentes! ");
		}
		
		if(empregado1.getNome().equals(empregado2.getNome())) {
			System.out.println("Nomes iguais!");
		}
	}

}
