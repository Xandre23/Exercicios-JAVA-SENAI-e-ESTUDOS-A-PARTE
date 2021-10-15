package Array;

import java.util.Scanner;

public class exemplo2 {
    
  public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
      
      //declarando o array
    double [] notas = new double[6];
    
    //fazendo a contagem do array
    for (int i = 0; i< notas.length; i++){
        
        //pedindo para o usuario escrever as notas
        System.out.println("Digite as notas: ");
        
        //lendo as notas que o usuario colocou
        notas[i]=leia.nextDouble();
        
    }
    //fazendo a contagem do array
    for (int i = 0; i< notas.length; i++){
        //Imprimindo as notas que foi digitada
        System.out.println(notas[i]);
    }
    
   
     
    
    
    
}
}
