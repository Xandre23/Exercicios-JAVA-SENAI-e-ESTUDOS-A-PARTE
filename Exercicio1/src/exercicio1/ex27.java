package exercicio1;

import java.util.Scanner;
import java.text.DecimalFormat;



public class ex27 {
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("##");
      double n1,n2,div;
      
      System.out.println("Digite um numero: ");
         n1 = leia.nextDouble();
         
       System.out.println("Digite um numero: ");
            n2 = leia.nextDouble();
            
         div = n1/n2;
         
         System.out.println("A divisão do primeiro numero com o segundo é: "+df.format(div));
            

    }
}
