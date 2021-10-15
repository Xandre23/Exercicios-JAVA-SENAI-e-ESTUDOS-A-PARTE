package estrutura_decisao;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ex3 {
        public static void main(String[] args) {
           int r1,r2,r3;
           
            
            DecimalFormat df = new DecimalFormat("##,###.###");
            
            r1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a primeira resistencia: "));
            r2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a segunda resistencia: "));
            r3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a terceira resistencia: "));
           
           JOptionPane.showMessageDialog(null,"Resistencias fornecidas: "+r1 +", " +r2+", " +r3);
           
           if(r1>r2 && r1>r3 ){
          if(r2>r3){
             JOptionPane.showMessageDialog(null,"A maior resistência é: "+r1+"\nA Menor resistência é: "+r3);
          }
            else{
                JOptionPane.showMessageDialog(null,"A maior resistência é: "+r1+"\nA Menor resistência é: "+r2);
            }

           }//fim do primeiro if
           
                else if(r2>r1 && r2>r3){
                    if(r1>r3){
                        JOptionPane.showMessageDialog(null,"A maior resistência é: "+r2+"\nA Menor resistência é: "+r3);

       }   
                       else{
                          JOptionPane.showMessageDialog(null,"A maior resistência é: "+r2+"\nA Menor resistência é: "+r1);

                    }
        }   //fim do segundo if
                
                else if(r3>r2 && r3>r1){
                              if(r2>r1){
                                 JOptionPane.showMessageDialog(null,"A maior resistência é: "+r3+"\nA Menor resistência é: "+r1);
                                 }
                                }
                            else{
                                JOptionPane.showMessageDialog(null,"A maior resistência é: "+r3+"\nA Menor resistência é: "+r2);

                               }  //fim do terceiro if 
                   
    
}
}      //fim do programa

    
      
               
          
     
    


