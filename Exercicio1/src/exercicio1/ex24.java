package exercicio1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex24 {
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("##.####");
      
      double agua, suco, litros;
      
      System.out.println("Quantas garrafas de agua irá utilizar? ");
        agua = leia.nextDouble();
      
      System.out.println("Quantas partes de suco vai utilizar? ");
        suco = leia.nextDouble();
      
        litros = agua * suco;
        
        System.out.println("Voce irá precisar de "+df.format(litros)+"LITROS Para fazer o suco");
    }
}
