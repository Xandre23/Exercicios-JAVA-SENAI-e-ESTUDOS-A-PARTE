package switch_case;

import javax.swing.JOptionPane;

public class ex2 {
     public static void main(String[] args) {
         double pag = 0,valor, avista, debito,credito, parcelado,parcela;
         String formaPg;
           
            
            valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de pagamento "));
            formaPg = JOptionPane.showInputDialog(null,"Digite a forma de pagamento: ");
            
            switch(formaPg){
                case "avista":
                    pag = valor+valor * 0.10;
                    JOptionPane.showMessageDialog(null,"O valor de acrescimo é de: "+ pag);
                    break;
                case "debito":
                    pag = valor+valor * 0.5;
                    JOptionPane.showMessageDialog(null,"O valor de acrescimo é de: "+ pag);
                    break;
                case "credito":
                    pag = valor+valor * 0.0;
                    JOptionPane.showMessageDialog(null,"O valor de acrescimo é de: "+ pag);
                    break;
                case "parcelado":
                    pag = valor * 0.5;
                    parcela = pag / 4;
                    JOptionPane.showMessageDialog(null,"O valor de acrescimo é da parcela é: "+ parcela);
                    break;
            }
     }
}
           
            
            
          
               
                       
                  
            


             
             
                 
                 
                     
                 
             
            
            

     



