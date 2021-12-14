package Aula;
import java.awt.event.KeyEvent;

import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiMenuPrincipal extends JFrame {
    private Container contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnExemplos;
    private JMenuItem miSair, miBotao;
    
    public GuiMenuPrincipal(){
       componentes();
        eventos();
    }

    private void componentes() {
        setTitle("Menu Principal");
        setBounds(0,0,800,600);
        ImageIcon images = new ImageIcon();
        mnBarra = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        mnArquivo.setMnemonic('A');
        mnExemplos = new JMenu("Exemplos");
        mnExemplos.setMnemonic('E');
        miSair = new JMenuItem("Sair", new ImageIcon("sair.jpg"));        
//       miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Actionevent.ALT_MASK));
        miBotao = new JMenuItem("Botao");
        mnArquivo.add(miSair);
        mnExemplos.add(miBotao);
        mnBarra.add(mnArquivo);
        setJMenuBar(mnBarra);
        
    }
   
    private void eventos() {
      miSair.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              System.exit(0);
          }
      });
      miBotao.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
             GuiBotao botao = new GuiBotao();
             contentPane.removeAll();
             contentPane.add(botao);
             contentPane.validate();
             
          }
      });
    }
    
      public void run(){
       GuiMenuPrincipal tela = new GuiMenuPrincipal(); 
       tela.setVisible(true);
    }
    
    
}
