package Aula;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Guiradio extends JFrame {
 
    private JLabel lbSexo;
    private JButton btVerificar;
    private JRadioButton rbMasculino, rbFeminino;
    private ButtonGroup buttonGroup;
    
    public Guiradio(){
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("tela");
		setBounds(0, 0, 600, 650);
		setLayout(null);
                
                
        btVerificar = new JButton("Verificar");
        rbMasculino = new JRadioButton("Masculino");
        lbSexo = new JLabel ("Seleciona o sexo: ");
        rbFeminino = new JRadioButton("Feminino");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(rbMasculino);
        buttonGroup.add(rbFeminino);
        btVerificar.setBounds(55,105,100,20);
        rbMasculino.setBounds(55,45,100,25);
        lbSexo.setBounds(55,10,105,30);
        rbFeminino.setBounds(55,70,100,25);
        rbMasculino.setSelected(true);
        add(btVerificar);
        add(rbMasculino);
        add(lbSexo);
        add(rbFeminino);
    }

    private void definirEventos() {
        btVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(rbMasculino.isSelected()){
                   JOptionPane.showMessageDialog(null,"Masculino selecionado");
               }else if(rbFeminino.isSelected()){
                   JOptionPane.showMessageDialog(null,"Feminino selecionado"); 
               }
                   
                   
            }
        });
        
    }
    	public void run() {

		Guiradio tela = new Guiradio();
		tela.setVisible(true);

	}
}



