package exercicio1;
import java.util.Scanner;

public class ex7 {
     public static void main(String[] args) {
         int dia;
         int mes;
         double resultado;
         
      Scanner leia = new Scanner (System.in);
      
      System.out.println("Digite o dia: ");
      dia = leia.nextInt();
      
      System.out.println("Digite o mês");
      mes = leia.nextInt();
      
      resultado = mes*30+dia;
      
      System.out.println("Se passaram "+resultado+"Dias");
      
      
      
        
}
}
