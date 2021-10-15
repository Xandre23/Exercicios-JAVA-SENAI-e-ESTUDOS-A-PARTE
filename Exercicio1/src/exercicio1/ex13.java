package exercicio1;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
      int unidade, dezena, centena;
      int resultado1,resultado2,resultado3;
            Scanner leia = new Scanner (System.in);
            
        System.out.println("Digite um numero inteiro: ");
        unidade = leia.nextInt();
        
        System.out.println("Digite um numero inteiro: ");
        dezena = leia.nextInt();
        
        System.out.println("Digite um numero inteiro: ");
        centena = leia.nextInt();
        
       resultado1= ((unidade%100)%10);
       resultado2 = (dezena%100)/10;
       resultado3 = centena/100;
       
       System.out.println("Unidade: "+resultado1);
       System.out.println("dezena: "+resultado2);
       System.out.println("centena: "+resultado3);
            
        
    }
    
}
