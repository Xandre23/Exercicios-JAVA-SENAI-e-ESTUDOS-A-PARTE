package Lista_exercicios;

import javax.swing.JOptionPane;

public class ex7 {
        public static void main(String[] args) {
        double Salario, NovoSalario;
        
        
      
        
        
        Salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario "));
        
        
       
        
        
        if(Salario < 1000 ){
            NovoSalario = Salario+Salario *0.40;
            JOptionPane.showMessageDialog(null, "Seu salário reajustado com 40%: "+NovoSalario);
        }else if(Salario >1000){
            NovoSalario = Salario+Salario *0.30;
            JOptionPane.showMessageDialog(null, "Seu salário reajustado com 30%: "+NovoSalario);
        }
        
               }
        }
        
        
        
              
          
             
             
            
       


