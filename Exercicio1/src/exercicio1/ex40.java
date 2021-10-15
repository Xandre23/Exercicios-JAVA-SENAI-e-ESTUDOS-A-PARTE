package exercicio1;

import java.util.Scanner;
import java.text.DecimalFormat;



public class ex40 {
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("##,###");
      double hipo, l1,l2,l3;
      System.out.println("Digite o lado A-");
      l1 = leia.nextDouble();
      
       System.out.println("Digite o lado B-");
        l2 = leia.nextDouble();
        
        hipo = (l1*2)+(l2*2);
        
        System.out.println("HIPOTENUZA = "+hipo);
        
      
      
      
      
      
      
    }
}
