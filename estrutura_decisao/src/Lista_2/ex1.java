package Lista_2;

import javax.swing.JOptionPane;

public class ex1 {
     public static void main(String[] args) {
    int n1,n2;
    
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
    
    if(n1>n2){
        JOptionPane.showMessageDialog(null,"numero "+ n1+" Maior que "+ n2);
    }else if(n2>n1){
        JOptionPane.showMessageDialog(null,"numero "+ n2+" Maior que "+ n1);
    }
}
}
