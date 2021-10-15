package exercicio1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex22 {
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);
     double cent1, cent5,cent10, cent25, cent50,real, totalCent, totalReal;
     
     DecimalFormat df = new DecimalFormat("##.####");
     
     System.out.println("Quantas moedas de 1 Centavo? ");
         cent1 = leia.nextDouble();
     
      System.out.println("Quantas moedas de 5 Centavo? ");
        cent5 = leia.nextDouble();
     
      System.out.println("Quantas moedas de 10 Centavo? ");
         cent10 = leia.nextDouble();
     
      System.out.println("Quantas moedas de 25 Centavo? ");
         cent25 = leia.nextDouble();
     
      System.out.println("Quantas moedas de 50 Centavo? ");
         cent50 = leia.nextDouble();
     
      System.out.println("Quantas moedas de 1 Real? ");
        real = leia.nextDouble();
      
        
        cent1= cent1*1;
        cent5 = cent5*5;
        cent10 = cent10*10;
        cent25 = cent25*25;
        cent50 = cent50*50;
        
        totalCent = (cent1 + cent5 + cent10 + cent25 + cent50)/100;
        
        totalReal = real + totalCent;
        
        System.out.println("Total Poupado foi R$"+df.format(totalReal) );
        
        
        
        
     
     
     
    
}
}
