package Ex03_Fatorial;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String [] args) {
		Controller fat = new Controller();//Instância da classe
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que deseja fatorar (menor que 12)"));
		while (x>12 || x<0) { //Impor limite proposto, e valor minimo 0 pois não há fatorial de negativo. Repetição até obter o valor nos limites
			JOptionPane.showMessageDialog(null, "ERRO! Digite um número menor que 12 / Maior que 0");//Mensagem de Erro.
			x = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que deseja fatorar"));// Coletar novamente.

		}
			JOptionPane.showMessageDialog(null, "O resultado do fatorial de " + x + " é : " + fat.fatorial(x)); //Impressão e chamada da função
	}
}
