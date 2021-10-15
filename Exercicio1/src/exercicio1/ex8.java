package exercicio1;

import java.util.Scanner;

public class ex8 {
     public static void main(String[] args) {
    double n1=1,n2=2,n3=3, media;
    
    
    Scanner leia = new Scanner (System.in);
    
    System.out.println("Digite a Primeira nota do aluno: ");
        n1 = leia.nextDouble();
    
    System.out.println("Digite a segunda nota do aluno: ");
        n2 = leia.nextDouble();
    
    System.out.println("Digite a terceira nota do aluno: ");
        n3 = leia.nextDouble();
        
        media = (n1+n2+n3)/3;
        
        System.out.println("Nota do aluno: "+ media);
     
        
    
    
    
    
    
    
}
}
