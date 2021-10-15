package estrutura_decisao;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ex4 {
        public static void main(String[] args) {
            int senha;
           int tentativa = 3;
        while (tentativa >= 0){
           
       
       
        String usuario = JOptionPane.showInputDialog(null,"Digite o Login: ");
         senha = Integer.parseInt(JOptionPane.showInputDialog("Forneça a senha: "));
       
        if ("Xandre".equals(usuario) && senha == 123456){
            JOptionPane.showMessageDialog(null, "Login e senha aceitos!!");
            break;
           
        } else {
            JOptionPane.showMessageDialog(null, "Falha, verifique o login e senha!\nVocê tem mais "+tentativa+" tentativa(s)!");
            tentativa--;
}
        }      
    }    
}
            
            
