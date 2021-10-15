package xandre;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
            
         double nota1,nota2,nota3,media;
          Scanner leia = new Scanner(System.in);
          DecimalFormat df = new DecimalFormat("##,####");
         
         System.out.println("Digite a primeira nota:");
            nota1 = leia.nextDouble();
            
         System.out.println("Digite a segunda nota:");
            nota2 = leia.nextDouble();
            
         System.out.println("Digite a terceira nota:");
            nota3 = leia.nextDouble();
            
            media = nota1+nota2+nota3/3;
            
            System.out.println("MÉDIA DO ALUNO: "+media);
                     
                
               
               
        }
                
}
                
            
             









        

           

