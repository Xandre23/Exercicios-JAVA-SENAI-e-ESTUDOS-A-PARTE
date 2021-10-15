package exercicio1;

import java.util.Scanner;


public class ex9 {
   public static void main(String[] args) {
    double camisaP;
    double camisaM;
    double camisaG;
    double valorArrecadado;
    
    Scanner leia = new Scanner (System.in);
    
    System.out.println("Digite a quantidade de camisetas PEQUENAS que irá levar: ");
        camisaP = leia.nextDouble();
    
    System.out.println("Digite a quantidade de camisetas MEDIAS que irá levar: ");
        camisaM= leia.nextDouble();
    
    System.out.println("Digite a quantidade de camisetas GRANDE que irá levar: ");
        camisaG = leia.nextDouble();
        
        camisaP = 10;
        camisaM=12;
        camisaG=15;
        
    valorArrecadado = (camisaP*10)+ (camisaM*12) + (camisaG*15);
    
    System.out.println("Valor Arrecadado: R$"+valorArrecadado);
        
        
}
}
