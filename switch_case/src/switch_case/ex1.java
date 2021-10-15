package switch_case;

import javax.swing.JOptionPane;

public class ex1 {
     public static void main(String[] args) {
         int idade, tempoContribuicao, tempoRestante = 0;
            String sexo;
            
            idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a sua idade: "));
            
            sexo = JOptionPane.showInputDialog(null,"Digite o seu sexo: ");
             
            tempoContribuicao = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantos anos de contribuição: "));
            
            
            switch (sexo){
                case "Masculino":
                   if(idade >= 65 || tempoContribuicao >= 35 ){
                       JOptionPane.showMessageDialog(null, "Você pode se aposentar");
                       
                   }else if(tempoContribuicao <= 35){
                     tempoRestante = 35 - tempoContribuicao ;
                      JOptionPane.showMessageDialog(null, "Você não pode se aposentar "+tempoRestante+" tempo restante de contribuição");
                   }
                     
                     break;
                case "Feminino":
                    if(idade >= 60 || tempoContribuicao >= 35 ){
                        JOptionPane.showMessageDialog(null, "Você pode se aposentar");
                        
                    }else if(tempoContribuicao <= 30)
                        tempoRestante =   30 - tempoContribuicao;
                        JOptionPane.showMessageDialog(null, "Você não pode se aposentar "+tempoRestante+" Anos restante de contribuição");
                         break;
                default:                  
                break;
            }
            
           
     }
}
            


             
             
                 
                 
                     
                 
             
            
            

     



