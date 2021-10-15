package Lista_exercicios;

import javax.swing.JOptionPane;

public class ex6 {
        public static void main(String[] args) {
        int numero1,numero2;
        boolean resultado;
        
      
        
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        
       
        
        
        if(numero1%2==0 && numero2%2==0){
            resultado = true;
            JOptionPane.showMessageDialog(null, "Numero: "+resultado);
        }else{
            resultado = false;
            JOptionPane.showMessageDialog(null, "Numero "+resultado);
        }
        
               }
        }
        
        
        
              
          
             
             
            
       


