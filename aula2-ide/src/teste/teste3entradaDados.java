package teste;

import javax.swing.JOptionPane;

public class teste3entradaDados {

	public static void main(String[] args) {
		String numero1 = JOptionPane.showInputDialog("Entre com o primeiro número: ");
		String numero2 = JOptionPane.showInputDialog("Entre com o segundo número: ");
		
		Double nota1 = Double.parseDouble(numero1);
		Double nota2 = Double.parseDouble(numero2);
		
		JOptionPane.showMessageDialog(null, "Média"+ (nota1+nota2)/2);
		
		
	}

}
