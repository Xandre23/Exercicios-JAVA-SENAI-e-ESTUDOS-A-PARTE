package Lista_2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ex7 {
        public static void main(String[] args) {
        
        double lado,area,base,cm;
        
        DecimalFormat df = new DecimalFormat("##.###");
        lado = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de lados: "));
        cm = Double.parseDouble(JOptionPane.showInputDialog("Digite os centimetros: "));
        
       
        if(lado == 3){
            area = cm*cm;
             JOptionPane.showMessageDialog(null,"Triângulo: "+area);
        }else if(lado == 4){
            
            area = lado *lado;
            JOptionPane.showMessageDialog(null,"Quadrado: "+area);
            
        }else if(lado == 5){
            JOptionPane.showMessageDialog(null,"PENTÁGONO");
        }
        
        
        
                
        }
         
}
        
        
              
          
             
             


