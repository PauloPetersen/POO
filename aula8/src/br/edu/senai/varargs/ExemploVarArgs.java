package br.edu.senai.varargs;

public class ExemploVarArgs {

	public static void main(String[] args) {
		// String a = "qualquer coisa";
		// System.out.printf("%s %d", 9, "tete", "dfdf", true, false);
		// varargs = vários argumentos System.out.printf
		somarNumeros(10,20,30,40);
		System.out.println(somarNumeros(10, 20, 30, 40, 100, 200));
	}

	public static int somarNumeros(int... numeros) {
		int soma = 0;
		for (int valor : numeros) {
			soma = soma + valor;

		}
		return soma;
	}

}
