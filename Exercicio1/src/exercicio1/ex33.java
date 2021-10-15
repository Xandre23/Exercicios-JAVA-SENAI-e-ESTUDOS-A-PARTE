package exercicio1;

import java.util.Scanner;
import java.text.DecimalFormat;



public class ex33 {
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("##");
      double baseM,baseMenor,altura, area;
      
      System.out.println("Digite a base maior: ");
        baseM = leia.nextDouble();
        
          System.out.println("Digite a base menor: ");
        baseMenor = leia.nextDouble();
        
          System.out.println("Digite a altura: ");
        altura = leia.nextDouble();
        
        area = ((baseM + baseMenor)*altura)/2;
        
        System.out.println("Aréa do trapézio A= "+area);
        
    }
}
