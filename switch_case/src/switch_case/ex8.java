package Switch_case;
import javax.swing.JOptionPane;

public class ex8 {

	public static void main(String[] args) {
		String combustivel, pag, tp = null;
		double total, litros;

		combustivel = (JOptionPane.showInputDialog("Tipo de combustivel: "));
		pag = (JOptionPane.showInputDialog("tipo de pagamento"));
		litros = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos litros: "));

		switch (combustivel) {
		case "comum":
			if (pag.equals("avista")) {
				total = litros * (2.99 * 0.10);
				JOptionPane.showMessageDialog(null, "Valor a pagar Avista:" +total);
			} else if (pag.equals("cheque")) {
				total = litros * (2.99 * 8.69);
				JOptionPane.showMessageDialog(null, "Valor a pagar em cheque:" + total);
			}
			break;

		case "alcool":
			if (pag.equals("avista")) {
				total = litros * (2.10 * 0.10);
				JOptionPane.showMessageDialog(null, "Valor a pagar Avista:" + total);

			} else if (pag.equals("cheque")) {
				total = litros *(2.10 * 8.69);
				JOptionPane.showMessageDialog(null, "Valor a pagar em cheque:" + total);
			}
			break;

		case "diesel":
			if (pag.equals("avista")) {
				total = litros * (2.28 * 0.10);
				JOptionPane.showMessageDialog(null, "Valor a pagar Avista:" + total);

			} else if (pag.equals("cheque")) {
				total = litros * (2.28 * 8.69);
				JOptionPane.showMessageDialog(null, "Valor a pagar em cheque:" + total);
			}
			break;

		case "adtivada":
			if (pag.equals("avista")) {
				total = litros * (3.54 * 0.10);
				JOptionPane.showMessageDialog(null, "Valor a pagar Avista:" + total);
			} else if (pag.equals("cheque")) {
				total = litros * (3.54 * 8.69);
				JOptionPane.showMessageDialog(null, "Valor a pagar em cheque:" + total);
			}
			break;

		}
	}
}