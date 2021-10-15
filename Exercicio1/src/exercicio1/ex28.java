package exercicio1;

import java.util.Scanner;
import java.text.DecimalFormat;



public class ex28 {
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("##,###");
      double nota1, nota2, media;
      
      System.out.println("Digite a primeira nota: ");
         nota1 =  leia.nextDouble();
         
       System.out.println("Digite a segunda nota: ");
         nota2 =  leia.nextDouble();
         
        
         
         media = (nota1*2)+(nota2*3)/3+2;
         
         System.out.println("Média final: "+df.format(media));
         
         
    }
}
