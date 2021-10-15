package Lista_2;

import javax.swing.JOptionPane;

public class ex5 {
     public static void main(String[] args) {
    int a,b,c;
    
    
    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
    c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor: "));
    
  
    
    if(a < b && a<c){
      if(b<c){
        JOptionPane.showMessageDialog(null,"Valor em ordem crescente "+a+","+b+","+c);
        }else{
            JOptionPane.showMessageDialog(null,"Valor em ordem crescente "+a+","+c+","+b);
        }
    if(b < a && b<c){
      if(a<c){
        JOptionPane.showMessageDialog(null,"Valor em ordem crescente "+b+","+a+","+c);
        }else{
            JOptionPane.showMessageDialog(null,"Valor em ordem crescente "+b+","+c+","+a);
        }
      if(a<c){
          JOptionPane.showMessageDialog(null,"Valor em ordem crescente "+c+","+a+","+b);
      }else{
          JOptionPane.showMessageDialog(null,"Valor em ordem crescente "+c+","+b+","+a);
      }
    }
    }
     }
}
         
         
          
    

  


