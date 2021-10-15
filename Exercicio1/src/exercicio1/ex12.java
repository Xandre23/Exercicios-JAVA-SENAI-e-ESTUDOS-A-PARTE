package exercicio1;
import java.util.Scanner;


public class ex12 {
    public static void main(String[] args) {
    double salario;
    double Aumento;
    
       
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Digite seu salario: ");
        salario = leia.nextDouble();
        
        Aumento = salario+salario*0.15;
        
        System.out.println("Aumento de salário: R$"+Aumento);
        
           
    
       }
}
