package Lista_2;

import javax.swing.JOptionPane;

public class ex2 {
     public static void main(String[] args) {
    int ano,idade;
    
    ano = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));
    
    idade = 2021 -  ano;
    
    if(idade > 17){
        JOptionPane.showMessageDialog(null,"você tem "+idade+" pode votar!!!");
    }else{
        JOptionPane.showMessageDialog(null,"você tem "+idade+" Você não pode votar");
    }
}
}
