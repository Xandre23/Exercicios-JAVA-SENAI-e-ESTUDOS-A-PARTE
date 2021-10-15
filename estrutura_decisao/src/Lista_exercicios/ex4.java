package Lista_exercicios;

import javax.swing.JOptionPane;

public class ex4 {
        public static void main(String[] args) {
        int a,b,c;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        
        
        
        
        if(a == b ){
            c = a+b;
            JOptionPane.showMessageDialog(null,"Resultado: "+c);
        }else{
            c= a * b;
             JOptionPane.showMessageDialog(null,"Resultado: "+c);
        }
        
        
              
          }
             
             
            
       
}

