package Aula;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuiBotao extends JPanel {
    private JButton btMessagem, btTeimoso;
    private ImageIcon imageIcon1;
    
    public GuiBotao(){
        componentes();
        eventos();
    }

    private void componentes() {
        imageIcon1 = new ImageIcon("teste1.jpg");
        btMessagem = new JButton("Mensagem",imageIcon1);
        btMessagem.setBounds(50,20,140,38);
        btMessagem.setMnemonic(KeyEvent.VK_M);
        btMessagem.setToolTipText("Clique aqui para ver a mensagem");
        btTeimoso.setBounds(50,70,100,25);
        add(btMessagem);
        add(btTeimoso);
    }

    private void eventos() {
       btMessagem.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               JOptionPane.showMessageDialog(null,"Botão mensagem");
           }
       });
      btTeimoso.addMouseListener(new MouseListener() {
           @Override
           public void mouseClicked(MouseEvent me) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public void mousePressed(MouseEvent me) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public void mouseReleased(MouseEvent me) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public void mouseEntered(MouseEvent me) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public void mouseExited(MouseEvent me) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
        
    }
    
}
