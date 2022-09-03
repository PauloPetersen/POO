package br.org.serratec.model;

//Uma interface não pode ter instâncias
//Não posso fazer - Conta conta = new Conta();
//É uma forma de substituir a herança em alguns casos.
//Toda interface é criada para ter somente assinaturas
//Interfaces não tem implementação.

public interface Conta {
	Double taxaBancaria = 2.50;
	
	//não é necessário colocar o abstract pq fica implicito
	public Boolean saque(Double valor);
	public Boolean deposito(Double valor);
	

}
