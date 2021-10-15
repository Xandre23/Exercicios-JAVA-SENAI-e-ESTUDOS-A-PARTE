package exercicio1;

import java.util.Scanner;
import java.text.DecimalFormat;



public class ex34 {
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("##");
      double lado1,lado2,area;

      System.out.println("Digite o primeiro lado do quadrado: ");
        lado1 = leia.nextDouble();
        
        System.out.println("Digite o segundo lado do quadrado: ");
        lado2 = leia.nextDouble();
        
        area = lado1*lado2;
        System.out.println("A = "+area);
      
    }
}

