package estrutura_decisao;


import java.text.DecimalFormat;
import javax.swing.JOptionPane;



public class ex5 {
    public static void main(String[] args) {
  
      DecimalFormat df = new DecimalFormat("##.###");
      int tabuada,resultado = 0;
      int i;
      String msg = "";
       tabuada = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual tabuada voce deseja: "));
      
      
      i=1;
      while(i<=10){
          
         resultado = tabuada * i  ;
        msg += tabuada+" X "+i+" =  "+resultado +"\n"; 
          
          
          i++;
      }
      JOptionPane.showMessageDialog(null,msg);
    }
}