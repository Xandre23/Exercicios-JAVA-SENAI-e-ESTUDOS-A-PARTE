package exercicio1;

import java.util.Scanner;
import java.text.DecimalFormat;



public class ex29 {
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("##,###");
      double produto, desconto;
      
      System.out.println("Digite o preço do produto: ");
        produto = leia.nextDouble();
      
      desconto = produto - produto*0.10;
      
      System.out.println("Valor a pagar com DESCONTO R$"+desconto);
  
    }
}