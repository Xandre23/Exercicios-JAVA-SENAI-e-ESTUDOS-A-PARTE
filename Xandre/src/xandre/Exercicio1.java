package xandre;

import java.util.Scanner;

public class Exercicio1 {
    
  public static void main(String[] args) {
    int idade1,idade2,idade3,idade4,idade5,soma;
   
    Scanner leia = new Scanner (System.in);
    
    System.out.println("Digite sua idade: ");
        idade1 = leia.nextInt();
    
    System.out.println("Digite sua idade: ");
        idade2 = leia.nextInt();
        
    System.out.println("Digite sua idade: ");
        idade3 = leia.nextInt();
    
    System.out.println("Digite sua idade: ");
        idade4 = leia.nextInt();
        
    System.out.println("Digite sua idade: ");
        idade5 = leia.nextInt();
        
        System.out.println("Primeira idade: "+idade1);
        System.out.println("Segunda idade: "+idade2);
        System.out.println("Terceira: "+idade3);
        System.out.println("Quarta idade: "+idade4);
        System.out.println("Quinta idade: "+idade5);
        
        
        
    soma = idade1 + idade2 + idade3 + idade4 + idade5;
     System.out.println("A soma das idades é: "+soma);
       
    
   
     
    
    
    
}
}
