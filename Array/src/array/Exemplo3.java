package Array;

import java.util.Scanner;

public class Exemplo3 {
    
  public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
      
      //declarando o array
    double [] notas = new double[6];
    double total = 0;
    
    //correndo no array
    for (int i = 0; i< notas.length; i++){
        
        //pedindo para o usuario escrever as notas
        System.out.println("Digite as notas: ");
        
        //lendo as notas que o usuario colocou
        notas[i]=leia.nextDouble();
        
        if(notas[i] >7){
             total =total+1;
        }
        
    }
     System.out.println("Digite o total de notas maior que 7: "+total);
     
     for(int i = 0; 1< notas.length; i++){
         System.out.println(notas[i]);
     }
    
 
    
    
   
     
    
    
    
}
}
