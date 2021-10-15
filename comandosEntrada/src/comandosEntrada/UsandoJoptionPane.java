package comandosEntrada;

import javax.swing.JOptionPane;

public class UsandoJoptionPane {

	public static void main(String[] args) {
	String nome,sobrenome, aux;
	int idade;
	double salario;
	
	nome = JOptionPane.showInputDialog("Digite o seu nome: ");
	sobrenome= JOptionPane.showInputDialog("Digite o seu sobrenome: ");
	
	aux = JOptionPane.showInputDialog("Digite a sua idade");
		idade = Integer.parseInt(aux);
		
	aux = JOptionPane.showInputDialog("Digite seu salario: ");
		salario = Double.parseDouble(aux);
	
	
	JOptionPane.showInternalMessageDialog(null,"Nome: "+nome+"\nSobrenome: "+sobrenome+ "\nIdade: "+idade + "\nSalário: "+salario);
	}

}
