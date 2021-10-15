package exercicio1;

import java.util.Scanner;


public class ex3 {
    
   public static void main(String[] args) {
       double QtdPaes = 0.12;
       double QtdBroa = 1.50;
       double resultado;
       double poupanca;
       
       Scanner leia = new Scanner (System.in);
       
       System.out.println("Quantidades de pães: ");
        QtdPaes = leia.nextDouble();
       
       System.out.println("Quantidades de broa: ");
        QtdBroa= leia.nextDouble();
        
        resultado = QtdPaes + QtdBroa;
        
        System.out.println("Arrecadação de vendas: "+resultado);
        
        poupanca = resultado * 0.10;
        
        System.out.println("Podendo guardar " +poupanca +" na poupança");
        

       
    
}
}
