import javax.swing.JOptionPane;

public class operadoresAritmeticos {

	public static void main(String[] args) {
			int a,b;
			boolean c;
			
			
			a= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
			b= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
			
			c = a!= b;
			
			JOptionPane.showInternalMessageDialog(null,"o valor é: "+c);

	}

}
