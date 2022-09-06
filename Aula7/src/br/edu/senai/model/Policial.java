package br.edu.senai.model;

//Com o final essa classe não poderá ter filhos - final
//Imutável 
//public class Policial {

public class Policial {
	private String nome;
	private String matricula;

	public Policial(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
//Quando colocamos o final no método estamos proibindo a sobrescrita
	//public final String toString()
	@Override
	public final String toString() {
		return "Policial [nome=" + nome + ", matricula=" + matricula + "]";
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

}
