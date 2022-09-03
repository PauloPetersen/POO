package br.org.serratec.model;

public interface Tributacao extends Taxas, ImpostoDeRenda {
	Double calcularICMS();

}
