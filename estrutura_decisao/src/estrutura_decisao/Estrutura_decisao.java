package estrutura_decisao;

import java.util.Scanner;

public class Estrutura_decisao {

    public static void main(String[] args) {
       double altura;
       int idade;
       
       Scanner leia = new Scanner(System.in);
       
       System.out.println("Digite a altura da modelo: ");
        altura = leia.nextDouble();
        
          System.out.println("Digite a sua idade: ");
        idade = leia.nextInt();
        
        if(altura >= 1.75 || idade ==15){
            System.out.println("Candidata aprovada");
        }else{
             System.out.println("Candidata reprovada");
        }
    }
    
}
