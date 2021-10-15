package exercicio;

import java.util.Scanner;


public class ExRandom {

    public static void main(String[] args) {
        
        
        int numero = 0;
        int random;
        
        
        Scanner leia = new Scanner(System.in);
        for (int i = 0; i<6; i++ ){
            
        System.out.println("Digite 6 numeros que você: ");
        numero = leia.nextInt();
        
        }
         System.out.println("***************** NUMEROS SORTEADOS *************");
         
        random = (int) (Math.random()*100);
        System.out.println(random);
        
         random = (int) (Math.random()*100);
        System.out.println(random);
        
         random = (int) (Math.random()*100);
        System.out.println(random);
        
         random = (int) (Math.random()*100);
        System.out.println(random);
        
         random = (int) (Math.random()*100);
        System.out.println(random);
        
         random = (int) (Math.random()*100);
        System.out.println(random);
        
        if(numero == random ){
            System.out.print("Você acertou");
        }else{
            System.out.println("Você errou, tente novamente");
        }
        
        
        
        
    }
    
}
