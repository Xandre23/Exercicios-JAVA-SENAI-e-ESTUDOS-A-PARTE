package Aula;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiLabel extends JFrame {
    private JLabel labe11,label2, label3,label4;
    private ImageIcon imageIcon1;
    
    
    public  GuiLabel(){
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        setTitle("tela");
		setBounds(0, 0, 600, 650);
		setLayout(null);
        
        
        
        setLayout(new GridLayout(4,1));
        imageIcon1 = new  ImageIcon("java.jpg");
        setBackground(new Color(100,220,100));
        labe11 = new JLabel(" Aprendendo", JLabel.LEFT);
        labe11.setForeground(Color.WHITE);
        label2 = new JLabel(imageIcon1);
        label3 = new JLabel(" Inserir", JLabel.RIGHT);
        label3.setForeground(Color.BLUE);
        label4 = new JLabel(" Labels e imagens", imageIcon1,JLabel.CENTER);
        label4.setFont (new Font("Serif", Font.BOLD,20));
        label4.setForeground(Color.black);
        add(labe11);
        add(label2);
        add(label3);
        add(label4);
        
    }
    public void run() {

		GuiLabel tela = new GuiLabel();
		tela.setVisible(true);

	}
    
}
