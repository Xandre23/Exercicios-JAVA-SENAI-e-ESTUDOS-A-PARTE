package exercicio1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
    
        String nome;
        int idade;
        int vividos;
        
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Digite seu nome: ");
            nome = leia.next();
        
        System.out.println("Digite sua idade: ");
            idade = leia.nextInt();
        
            vividos = idade *365;
            
            System.out.print("Dias vividos "+vividos);
            
            
        
}
}
