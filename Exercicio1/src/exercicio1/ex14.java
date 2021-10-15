package exercicio1;

import java.util.Scanner;



public class ex14 {
    public static void main(String[] args) {
        final double PI=3.14;
        double area;
        double raio;
        
        
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Informa o raio da pizza: ");
        raio = leia.nextDouble();
        
        
        
        area = PI * (raio * raio) ;
        
          System.out.println("o raio da circuferencia é: : "+area);
        
        
        
        
        
        
        
        
    }
    
}
