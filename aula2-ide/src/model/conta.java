package model;

public class conta {
	public int numeroConta;
	public String titular;
	public double saldo;
	
	//Método sem retorno
	public void deposito(double valor) {
		//saldo += valor;
		saldo = saldo + valor;
	}
	//Método com retorno
	public boolean saque(double valor) {
		if (saldo<valor) {
			return false;
		}else {
			saldo-=valor;
			return true;
		}
	}

}
