package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
    
  public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
      
      //declarando o array
    String [] [] matriz = new String [6] [6];

    
    //acumulador
    String acmm;

    for(int i = 0; i<matriz.length; i++){
        
        System.out.println("Digite seu nome: ");
        matriz[i] [i]=leia.next();
        System.out.println("Nome "+matriz[i][i]);
        
            
       System.out.println("Digite sua funcao : ");
        matriz[i] [i]=leia.next();
        System.out.println("Função "+matriz[i][i]);
        
        
        System.out.println("Digite sua idade : ");
        matriz[i] [i]=leia.next();
        System.out.println("Idade "+matriz[i][i]);
        
        
         System.out.println("Sexo: ");
        matriz[i] [i]=leia.next();
        System.out.println("Sexo: "+matriz[i][i]);
        
         System.out.println("Salario : ");
        matriz[i] [i]=leia.next();
        System.out.println("Salario "+matriz[i][i]);
       
       
       

    }
    
   
  }
}
     
    

      
          
    
    

   
    
    
   
     
    
    
    


