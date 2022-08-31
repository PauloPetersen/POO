package teste;

import model.conta;

public class testeconta {

	public static void main(String[] args) {
		conta conta1 = new conta();
		conta1.numeroConta = 1234;
		conta1.titular = "Ana Maria";
		conta1.saldo = 1000;
		
		conta conta2 = new conta();
		conta2.numeroConta=234;
		conta2.titular = "João";
		conta2.saldo = 5000;
		
		//Depósito de 500,00
		conta1.deposito(500);
		conta2.deposito(100);
		
		
		//Saque de 200,00
		if (conta1.saque(200)) {
			System.out.println("Saque efetuado com sucesso !");
		}else {
			System.out.println("Não tem dinheiro");
		}
//Imprimir Saldo
		System.out.println("Saldo Conta1:" + conta1.saldo);
		System.out.println("Saldo Conta2:" + conta2.saldo);
		

	}

}
