package exercicio1;

import java.util.Scanner;
import java.text.DecimalFormat;



public class ex32 {
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("##");
      Double peso, pesoGrama, engordar,emagrecer;
      
      System.out.println("Digite seu peso: ");
           peso = leia.nextDouble();
           
       pesoGrama = peso *1000; 
       
       System.out.println("Seu peso em grama é: "+df.format(pesoGrama)+"g");
           
      
      
      
      
    }
}