package br.edu.senai.listas;

import java.util.ArrayList;
import java.util.List;

import br.edu.senai.model.Medico;

public class ExemploMedico {

	public static void main(String[] args) {
		List<Medico> medicos = new ArrayList<>();
		
		medicos.add(new Medico ("123", "Sergio", 200.));
		medicos.add(new Medico ("323", "Carla", 180.));
		medicos.add(new Medico ("423", "Carlos", 290.));
		
		Double maiorvalorConsulta=0.0;
		String nome = "";
		
		
		for (Medico medico : medicos) {
			if (medico.getValorConsulta() > maiorvalorConsulta) {
				maiorvalorConsulta = medico.getValorConsulta();
				nome = medico.getNome();
			}
			System.out.println(medico);
		}
		System.out.println("O valor mais caro é: "+ maiorvalorConsulta);
		System.out.println(nome);

	}

}
