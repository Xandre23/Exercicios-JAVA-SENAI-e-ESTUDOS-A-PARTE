package ExercicioInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;

public class CalculadoraB extends JFrame  {
    //componentes
     private JTextField txtValor1, txtValor2;
     private JLabel lbValor1, lbValor2;
     private JButton btSoma, btSubtracao, btVezes, btDivisao ;

     //Construtor
     public CalculadoraB(){
      componentes();
      eventos();
    }
    private void componentes()  {
        setTitle("Calculadora");
         setBounds(0,0,300,250);
         setLayout(null);
         
         //botoes
         lbValor1=  new JLabel("Valor 1");
         lbValor1.setBounds(20,50,90,25);
            add(lbValor1);
        
         txtValor1 = new JTextField ();
         txtValor1.setBounds(80,50,160,25);
          add(txtValor1);
          
            lbValor2 = new JLabel("Valor 2");
            lbValor2.setBounds(20,100,90,25);
            add(lbValor2);
        
        txtValor2 = new JTextField();
        txtValor2.setBounds(80,100,160,25);
         add(txtValor2);

       btSoma = new JButton("Somar");
       btSoma.setBounds(20,150,90,25);
        add(btSoma);
        
        btSubtracao = new JButton("Subtrair");
        btSubtracao.setBounds(150,150,90,25);
         add(btSubtracao);
         
         btVezes = new JButton("Vezes");
         btVezes.setBounds(270,150,90,25);
         add(btVezes);
         
         btDivisao = new JButton("Dividir");
         btDivisao.setBounds(380,150,90,25);
         add(btDivisao);
 
    }
     void somar(){
         int Valor1 = Integer.parseInt(txtValor1.getText());
         int Valor2 = Integer.parseInt(txtValor2.getText());
         
        int  resultado = Valor1 +Valor2;
         JOptionPane.showMessageDialog(null,"Resultado: "+resultado);
         }
     void Subtrair(){
         int Valor1 = Integer.parseInt(txtValor1.getText());
         int Valor2 = Integer.parseInt(txtValor2.getText());
         
        int  resultado = Valor1 - Valor2;
         JOptionPane.showMessageDialog(null,"Resultado: "+resultado);
         }
        void Vezes(){
         int Valor1 = Integer.parseInt(txtValor1.getText());
         int Valor2 = Integer.parseInt(txtValor2.getText());
        int  resultado = Valor1 * Valor2;
         JOptionPane.showMessageDialog(null,"Resultado: "+resultado);
         }
        void Dividir(){
         int Valor1 = Integer.parseInt(txtValor1.getText());
         int Valor2 = Integer.parseInt(txtValor2.getText());
         
        int  resultado = Valor1 / Valor2;
         JOptionPane.showMessageDialog(null,"Resultado: "+resultado);
         }
        private void eventos() {
          btSoma.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {
              somar();
             }             
         });  
          btSubtracao.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {
              Subtrair();
             }
         });
          btVezes.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {
              Vezes();
             }
         });
           btDivisao.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {
              Dividir();
             }  
         });  
    }    
     public void run(){
       CalculadoraB tela = new CalculadoraB(); 
       tela.setVisible(true);
    }
     
}
