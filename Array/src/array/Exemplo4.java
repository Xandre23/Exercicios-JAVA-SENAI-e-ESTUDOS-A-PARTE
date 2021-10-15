package Array;

import java.util.Scanner;

public class Exemplo4 {
    
  public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
      
      //declarando o array
    double [] preco = new double[5];
    //acumulador
    double acm = 0;
    //criando variavel inteira, enquanto o i for menor que o vetor, vai acrescetar i++
    for(int i = 0; i<preco.length; i++){
        //usuario digite o valor do produto
        System.out.println("Digite o valor do produto: ");
        
        preco[i] = leia.nextDouble();
        //acumulador recebe valor mais preco
        acm = acm+preco[i];
    }
    //exibir precos
    for(int i = 0; i<preco.length; i++){
        System.out.println("O valor do produto é: "+preco[i]);
    }

    System.out.println("O total da compra é: "+acm);
    
    
   
     
    
    
    
}
}
