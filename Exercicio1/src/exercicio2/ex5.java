package exercicio2;

import javax.swing.JOptionPane;

public class ex5 {
        public static void main(String[] args) {
            int idade, tempoContribuicao, tempoRestante;
            String sexo;
            
            
            idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a sua idade: "));
            
             sexo = JOptionPane.showInputDialog(null,"Digite o seu sexo: ");
             
            tempoContribuicao = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantos anos de contribuição: "));
             
             
          if(sexo.equals("f") && idade >= 60 || tempoContribuicao >= 35 ){
              JOptionPane.showMessageDialog(null,"Você pode se aposentar ");
              
          }else if(sexo.equals("f") && idade < 60 || tempoContribuicao < 35){
              tempoRestante = idade - 60;
              JOptionPane.showMessageDialog(null,"Você não pode se aposentar falta "+tempoRestante+" anos para sua aposentadoria");
              
          }else if(sexo.equals("f") && idade >= 60 && tempoContribuicao < 35){
              tempoRestante = tempoContribuicao - 35;
              JOptionPane.showMessageDialog(null,"Você não pode se aposentar falta "+tempoRestante+" anos de contribuição para sua aposentadoria");
              
          }
             
             
            
       
}
}
