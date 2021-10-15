package Array;

import java.util.Scanner;

public class Exercicio1 {
    
  public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
      
      //declarando o array
    double [] valorInvestimento = new double[1];
    double [] valorDeposito = new double[12];
    //acumulador
    double acm = 0;
    //criando variavel inteira, enquanto o i for menor que o vetor, vai acrescetar i++
    
    for(int i = 0; i<valorInvestimento.length; i++){
        //usuario digite o valor do INVESTIMENTO
        System.out.println("Digite o valor do investimento ");
            valorInvestimento[i] = leia.nextDouble();
        
       
    }
    
    //exibir precos
    for(int i = 0; i<valorDeposito.length; i++){
        System.out.println("Digite o valor de deposito: R$");
        valorDeposito[i] = leia.nextDouble();
        
         
          System.out.println(valorDeposito[i]);
          acm = acm+valorDeposito[i] *0.1;
    }
    

   
    
    
   
     
    
    
    
}
}
