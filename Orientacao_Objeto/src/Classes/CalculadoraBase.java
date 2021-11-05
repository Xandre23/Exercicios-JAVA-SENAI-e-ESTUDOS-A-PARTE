package Classes;

import java.util.Scanner;

public class CalculadoraBase {
    
   private double numero1;
    private double numero2;
     double resultado;
    String op;
    
  

    
    public void SolicitarNumero(){
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        numero1 = leia.nextDouble();
        
        System.out.println("Digite um numero: ");
        numero2 = leia.nextDouble();
    }
    public void escolherOperacao(){
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Escolha a operação");
            op = leia.next();
            switch (op){
                case "+":
                    resultado = numero1 + numero2;
                    System.out.println("Resultado "+resultado);
                    break;
                    
                    case "-":
                    resultado = numero1 - numero2;
                    System.out.println("Resultado "+resultado);
                    break;
                    
                    case "*":
                    resultado = numero1 * numero2;
                    System.out.println("Resultado "+resultado);
                    break;
                    
                    case "/":
                    resultado = numero1 / numero2;
                    System.out.println("Resultado "+resultado);
                    break;  
                    
                     default:
            System.out.println("numero invalido");
            }
           
    }
    public void exibirNumero(){
        System.out.println("O Primeiro Numero é " + numero1);
         System.out.println("O segundo Numero é " + numero2);
        
    }
    
}
