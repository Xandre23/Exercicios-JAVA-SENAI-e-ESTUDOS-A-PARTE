package exercicio1;

import java.util.Scanner;
import java.text.DecimalFormat;



public class ex36 {
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("##.###");
      double salarioMin, salarioFunc, calc;
      
      System.out.println("Digite o salario Minimo atual: ");
        salarioMin = leia.nextDouble();
      System.out.println("Digite seu salario atual: ");
        salarioFunc = leia.nextDouble();
      
        calc = salarioMin / salarioFunc ;
        
        System.out.println("Total de salario min ganho: "+df.format(calc));
}
}
