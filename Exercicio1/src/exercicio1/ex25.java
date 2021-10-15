package exercicio1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex25 {
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("##.####");
      double comprimento, altura, largura,V;
      
      System.out.println("Digite o comprimento da caixa: ");
      comprimento = leia.nextDouble();
      
      System.out.println("Digite a altura da caixa: ");
      altura = leia.nextDouble();
      
      System.out.println("Digite a  largura da caixa: ");
      largura = leia.nextDouble();
      
      V = comprimento * altura *largura;
      
      System.out.println("O volume da caixa é: "+df.format(V));
      
    
    }
}
