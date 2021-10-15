package exercicio1;

import java.util.Scanner;


public class ex11 {
      public static void main(String[] args) {
          int tempo;
          int meses=0;
          int ano=0;
          int dias=0;
          int conta1;
          int conta2;
          int conta3;
          
         Scanner leia = new Scanner (System.in);
       System.out.println("Quanto dias sem sofrer acidente: ");
       dias = leia.nextInt();
       
      dias = 1;
      meses = 30;
      ano = 365;
      
      conta1 = dias / meses;
      conta2= dias / ano;
      conta3 = dias / ano;
       
       
       
       System.out.println("Tempo sem sofrer acidentes em ano: "+conta1);
       System.out.println("Tempo sem sofrer acidentes em meses: "+conta2);
         
       
       
       
      }
    
}
