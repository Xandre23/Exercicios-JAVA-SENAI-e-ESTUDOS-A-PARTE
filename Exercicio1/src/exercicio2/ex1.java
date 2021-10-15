package exercicio2;

import javax.swing.JOptionPane;



public class ex1 {
        public static void main(String[] args) {
            int valorImovel, percentual, valorImposto = 0, valorVenal;
            
            valorImovel = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor do IMOVEL: "));
           
            percentual = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o percentual de imposto: "));
           
            valorImposto = valorImovel * percentual/100;
           
            
          JOptionPane.showMessageDialog(null, "Valor do imposto a ser pago: "+valorImposto);
            
            
            
            
            
            
        }
    
}
