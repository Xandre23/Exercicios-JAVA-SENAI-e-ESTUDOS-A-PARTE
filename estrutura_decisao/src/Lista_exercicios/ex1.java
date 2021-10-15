package Lista_exercicios;

import javax.swing.JOptionPane;

public class ex1 {
        public static void main(String[] args) {
        int a,b,c,result;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        
        result = a+b;
        
        if(result < c){
            JOptionPane.showMessageDialog(null,"A + B É MENOR QUE C: "+result);
        }else{
             JOptionPane.showMessageDialog(null,"A+B É MAIOR QUE C");
        }
        
        
              
          }
             
             
            
       
}

