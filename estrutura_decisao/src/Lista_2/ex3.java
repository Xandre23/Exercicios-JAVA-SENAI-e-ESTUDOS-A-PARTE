package Lista_2;

import javax.swing.JOptionPane;

public class ex3 {
     public static void main(String[] args) {
    int senha;
    
    senha= Integer.parseInt(JOptionPane.showInputDialog("Digite a senha: "));
    
  
    
    if(senha == 1234){
        JOptionPane.showMessageDialog(null,"ACESSO PERMITIDO");
    }else{
        JOptionPane.showMessageDialog(null,"ACESSO NEGADO");
    }
}
}
