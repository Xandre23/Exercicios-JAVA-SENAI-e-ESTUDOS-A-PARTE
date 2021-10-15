package exercicio1;

import java.util.Scanner;
import java.text.DecimalFormat;



public class ex31 {
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("##,###");
      Double peso, novoPeso, engordar,emagrecer;
      
      System.out.println("Digite seu peso: ");
      peso = leia.nextDouble();
      
      engordar = peso+peso *0.15;
      emagrecer = peso - peso *0.20;
      
      System.out.println("cASO VOCE ENGORDE MAIS, SEU PESO SERÁ:  "+df.format(engordar));
      System.out.println("cASO VOCE EMAGREÇA SEU PESO SERÁ:  "+df.format(emagrecer));
      
      
    }
}