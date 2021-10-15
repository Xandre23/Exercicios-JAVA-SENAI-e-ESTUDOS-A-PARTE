package Lista_2;

import javax.swing.JOptionPane;

public class ex4 {
     public static void main(String[] args) {
    int Qtdmaca;
    double result;
    
    Qtdmaca= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de maça que voc~e vai comprar: "));
    
  
    
    if(Qtdmaca < 12){
        result = Qtdmaca*(0.30);
        JOptionPane.showMessageDialog(null,"Quantidades de maçã compradas "+Qtdmaca+" \n Valor a pagar: "+result);
        
    }else if(Qtdmaca >= 12){
        result = Qtdmaca*(0.25);
       JOptionPane.showMessageDialog(null,"Quantidades de maçã compradas "+Qtdmaca+" \n Valor a pagar: "+result);
    }
}
}
