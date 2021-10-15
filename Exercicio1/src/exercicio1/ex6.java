package exercicio1;

import java.util.Scanner;

public class ex6 {
    
   public static void main(String[] args) {
    double precoPrato=12.00;
    double peso;
    double pagar;
    
    Scanner leia = new Scanner (System.in);
    
    System.out.println("Digite o peso do prato em kilos: KG:");
    peso = leia.nextDouble();
    
    pagar = precoPrato * peso;
    
    System.out.println("Total a pagar R$"+pagar);
    
    
    
    
}
}

