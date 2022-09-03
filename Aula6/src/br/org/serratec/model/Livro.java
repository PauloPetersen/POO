package br.org.serratec.model;

public class Livro {
	private String autor;
	private String titulo;
	protected Double valor = 0.0;
	public Livro(String autor, String titulo, Double valor) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.valor = valor;
	}
	@Override
	public String toString() {
		return " || Livro Autor: " + autor + " || Titulo: " + titulo;
	}
	public String getAutor() {
		return autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public Double getValor() {
		return valor;
	}
	//Como calcular o reajuste?
	public void reajuste(Double valorReajuste){
		valor = valor * (valorReajuste/100 + 1);
		
	}

}
