package br.edu.senai.model;

import br.edu.senai.enums.MarcaTV;

public class TV {
	private String modelo;
	private Double tamanho;
	private MarcaTV marca;
	public TV(String modelo, Double tamanho, MarcaTV marca) {
		super();
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "TV Modelo: " + modelo + "|| Tamanho: " + tamanho + " || " + "Marca: "+ marca;
	}
	public String getModelo() {
		return modelo;
	}
	public Double getTamanho() {
		return tamanho;
	}
	public MarcaTV getMarca() {
		return marca;
	}
	
	
}
