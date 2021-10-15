package exercicio1;

import java.util.Scanner;


public class Exercicio1 {

 
    public static void main(String[] args) {
       double base;
       double area;
       double altura;
       
       Scanner leia = new Scanner(System.in);
       
       System.out.println("Digite a base do terreno: ");
       base = leia.nextDouble();
       
         System.out.println("Digite a altura do terreno: ");
       altura = leia.nextDouble();
       
       area = base * altura;
       
       System.out.println("a area do terreno é: " +area);
       
       
       
    }
    
}
