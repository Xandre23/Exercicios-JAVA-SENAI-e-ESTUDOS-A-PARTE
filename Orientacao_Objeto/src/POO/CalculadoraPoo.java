package POO;
import java.util.Scanner;

public class CalculadoraPoo{
    Scanner leia =  new Scanner(System.in);
    
    double valor1;
    double valor2;
    double soma;
    double subtracao;
    double divisao;
    double vezes;
    double resultado;
    double digite;
    
    
    String escolha;
    
      public void digite(){
     System.out.println("Digite o primeiro valor: ");
     valor1 = leia.nextDouble();
     System.out.println("Digite o segundo valor: ");
     valor2 = leia.nextDouble();
     
    }
    
    public void soma(){
       resultado = valor1 + valor2;
       System.out.println("total: "+ resultado);
    }
    
     public void subtracao(){
       resultado = valor1 - valor2;
       System.out.println("total: "+ resultado);
    }
     
      public void divisao(){
       resultado = valor1 / valor2;
       System.out.println("total: "+ resultado);
    }
      
       public void vezes(){
       resultado = valor1 * valor2;
       System.out.println("total: "+ resultado);
    }
    
    public void dig(){
         Scanner leia = new Scanner(System.in);
         
        System.out.println("1-SOMA\n2-Subtração\n3-Divisão\n4-Vezes ");
        escolha = leia.next();
        
        valor1 = leia.nextInt();
        valor2 = leia.nextInt();
       

        
    }
    
    
    public void escolha(){
        switch(escolha){
            case "soma":
        resultado = valor1+valor2;
        System.out.println("Total: " +resultado);
        break;
        
        case "subtracao":
        resultado = valor1 - valor2;
        System.out.println("Total: " +resultado);
        break;
        
        case "divisao":
        resultado = valor1 / valor2;
        System.out.println("Total: " +resultado);
        break;
        
        case "vezes":
        resultado = valor1 * valor2;
        System.out.println("Total: " +resultado);
        break;
        } 
        
        
    }
    

}
