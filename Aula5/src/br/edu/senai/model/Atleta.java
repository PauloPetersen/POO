package br.edu.senai.model;

public class Atleta {
	private String nomeAtleta;
	private String posição;
	
	public Atleta(String nomeAtleta, String posição) {
		this.nomeAtleta = nomeAtleta;
		this.posição = posição;
	}

	public String getNomeAtleta() {
		return nomeAtleta;
	}

	public String getPosição() {
		return posição;
	}
	
	

}
