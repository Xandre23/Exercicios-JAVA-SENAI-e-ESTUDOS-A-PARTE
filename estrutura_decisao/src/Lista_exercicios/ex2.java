package Lista_exercicios;

import javax.swing.JOptionPane;

public class ex2 {
        public static void main(String[] args) {
        String nome,sexo,estadoCivil,tempo;
        
        nome = (JOptionPane.showInputDialog("Digite seu nome: "));
        sexo = (JOptionPane.showInputDialog("Digite seu sexo: "));
        estadoCivil = (JOptionPane.showInputDialog("Digite seu estado civil: "));
        
        switch (sexo){
            case "f":
               if("casada".equals(estadoCivil)){
                   
                   tempo = (JOptionPane.showInputDialog("Digite o tempo de casada: "));
                    JOptionPane.showMessageDialog(null,"Nome: "+nome+"\n sexo: "+sexo+"\nestado Civil: "+ estadoCivil + "\nAnos casada: " +tempo+ " Anos" );
               }
        }
        
        
        
              
          }
             
             
            
       
}

