package Aula;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
    //componentes
    private JTextField txtUsuario;
    private JPasswordField pfSenha;
    private JLabel lbUsuario, lbSenha;
    private JButton btLogar, btCancelar;
    private static Login frame;
    
    //Construtor
    public Login(){
      componentes();
      eventos();
    }
    
     private void componentes() {
         setTitle("Login usuário");
         setBounds(0,0,300,250);
         setLayout(null);
         
         //botoes
       btLogar = new JButton("Logar");
       btLogar.setBounds(20,150,90,25);
        add(btLogar);
       
      btCancelar = new JButton("Cancelar");
      btCancelar.setBounds(150,150,90,25);
        add(btCancelar);
        
       lbUsuario =  new JLabel("Usuário");
       lbUsuario.setBounds(20,50,90,25);
        add(lbUsuario);
        
       lbSenha = new JLabel("Senha");
       lbSenha.setBounds(20,100,90,25);
        add(lbSenha);
        
        txtUsuario = new JTextField ();
        txtUsuario.setBounds(80,50,160,25);
            add(txtUsuario);
        
        pfSenha = new JPasswordField(5);
        pfSenha.setBounds(80,100,160,25);
         add(pfSenha);
      
       
    }

    private void eventos() {
      btLogar.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              String senha = String.valueOf(pfSenha.getPassword());
              
            if(txtUsuario.getText().equals("123")&& senha.equals("123")){
                JOptionPane.showMessageDialog(null,"Olá usuário!");
                
            }else{
                JOptionPane.showMessageDialog(null,"Usuário ou senha incorretos");
            }
          }
      });
      btCancelar.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              System.exit(0);
          }
      });
    }
    
    public void run(){
       Login tela = new Login(); 
       tela.setVisible(true);
    }

   
}
