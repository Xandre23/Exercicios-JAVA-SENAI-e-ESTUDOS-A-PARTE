package exercicio2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ex61 {
        public static void main(String[] args) {
            String nomeProduto;
            Double valorProduto;
            Double desconto = null;
            
            DecimalFormat df = new DecimalFormat("##,###");
            
            nomeProduto = (JOptionPane.showInputDialog(null,"Digite o nome do produto: "));
            valorProduto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do produto"));
            
            if(valorProduto >=50 && valorProduto<200){
                desconto = valorProduto-valorProduto*0.5;
            
        }else if(valorProduto >=200 && valorProduto<500){
            desconto = valorProduto - valorProduto*0.06;
            
        }else if(valorProduto >=500 && valorProduto<1000){
            desconto = valorProduto - valorProduto*0.07;
            
        }
            
            else if(valorProduto >=1000){
            desconto = valorProduto - valorProduto*0.08;
            
        }
            
            JOptionPane.showMessageDialog(null,"Nome: "+nomeProduto+"\nValor Produto: R$"+valorProduto+"\nValor do produto com desconto: R$"+desconto);
            
            
            
        }
}
