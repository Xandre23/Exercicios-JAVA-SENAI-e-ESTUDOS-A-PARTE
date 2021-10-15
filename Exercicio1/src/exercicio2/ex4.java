package exercicio2;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ex4 {
        public static void main(String[] args) {
            Double nota1, nota2, notaTrab, media;
            DecimalFormat df = new DecimalFormat("##,###");
            
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
            
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
            
            notaTrab = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho: "));
            
            media =  (nota1 + nota2 +notaTrab)/3;
            
            if(media >=6){
                JOptionPane.showMessageDialog(null, "Você foi aprovado\n nota final:"+df.format(media));
                }else if(media ==5.50){
                    JOptionPane.showMessageDialog(null, "Você está de recuperação\n nota:"+df.format(media));
                    }else{
                        JOptionPane.showMessageDialog(null, "Você foi reprovado\n nota final:"+df.format(media));
                    }
            
            
            
        }
        
}
