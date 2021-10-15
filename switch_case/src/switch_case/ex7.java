package Switch_case;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ex7 {
        public static void main(String[] args) {
        String sexo;
        double altura,result;
        
        DecimalFormat df = new DecimalFormat("##.###");
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
        sexo = (JOptionPane.showInputDialog("Digite seu sexo: "));
        
        
        switch (sexo){
            case "feminino":
             
                result = (62.1* altura)-44.7;
 
                    JOptionPane.showMessageDialog(null,"Peso ideal "+ df.format(result) );
                break;
                    
            case "masculino":
            
                 result = (72.7* altura)-58;
 
                    JOptionPane.showMessageDialog(null,"Peso ideal "+ df.format(result) );
                  break;
               }
        
        
                
        }
         
}
        
        
              
          
             
             


