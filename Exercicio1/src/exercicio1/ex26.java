package exercicio1;

import java.util.Scanner;
import java.text.DecimalFormat;



public class ex26 {
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("##.####");
         double n1,n2,n3,calc;
         
         System.out.println("Digite um numero ");
            n1= leia.nextDouble();
            
         System.out.println("Digite um numero ");
            n2= leia.nextDouble();
            
         System.out.println("Digite um numero ");
            n3= leia.nextDouble();
            
            calc = n1 * n2 * n3;
            
           System.out.println("Calculo:  "+calc);
     
      
    }
}
