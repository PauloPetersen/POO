package br.edu.senai.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
//HashSet tem a mesma ideia da lista, mas não aceita elementos duplicados
	
	public static void main(String[] args) {
		//Set<String> cores = new HashSet<>(); (não ajeita a ordem, faz de forma aleatória)
		
		Set<String> cores = new TreeSet<>();
		//faz o ordenamento ;
		cores.add("Azul");
		cores.add("Azul");
		cores.add("Vermelho");
		cores.add("Laranja");
		cores.add("Branco");
		cores.add("Azul");
		
		System.out.println(cores);

	}

}
