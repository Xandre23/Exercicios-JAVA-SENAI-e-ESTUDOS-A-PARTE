package exercicio1;
import java.util.Scanner;

public class ex15 {
     public static void main(String[] args) {
         double total;
         int conta1, conta2;
         double conta3;
     
          Scanner leia = new Scanner (System.in);
          
          System.out.println("Total a pagar: ");
           total = leia.nextDouble();
          
          
         System.out.println("Valor da conta: "+ total);
          
          conta1 =   (int) total / 3;
          conta2 = (int) total /3;
          conta3 = total /3;
          
           System.out.println("######## Quanto cada um tem que pagar?? ######\n ");
           
          System.out.println("Carlos: "+conta1);
          System.out.println("André: "+conta2);
          System.out.println("Felipe: "+conta3);
          
          
          
          
          
     }
    
}
