package Lista_exercicios;

import javax.swing.JOptionPane;

public class ex5 {
        public static void main(String[] args) {
        int numero, x2,x3,resultado;
        
      
        
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        
        x2 = numero*2;
        x3 = numero*3;
        
        resultado = x2;
        if(numero%2==0 && x2 ==resultado){
            JOptionPane.showMessageDialog(null, "O número é "+numero+" POSITIVO e seu dobro é: "+x2);
        }else{
            
            JOptionPane.showMessageDialog(null, "O número é "+numero+" NEGATIVO e seu TRIPLO é: "+x3);
        }
        
               }
        }
        
        
        
              
          
             
             
            
       


