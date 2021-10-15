package exercicio1;

import java.util.Scanner;
import java.text.DecimalFormat;



public class ex35 {
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("##");
      double dg_maior, dg_menor, area;
      
      System.out.println("Digite a diagonal maior: ");
        dg_maior = leia.nextDouble();
        
        System.out.println("Digite a diagonal menor: ");
            dg_menor = leia.nextDouble();
            
          area = (dg_maior * dg_menor)/2;
          
          System.out.println("A aréa do Losango é : A = "+ area);
      
    }
}