package exercicio1;
import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        
     Scanner leia = new Scanner (System.in);
     double blusa, novelo;
     
     System.out.println("Digite quantas blusas de lã você deseja: ");
        blusa = leia.nextDouble();
   
        novelo = blusa * blusa ;
     
     System.out.println("Novelados por blusa "+ novelo);
     
    
}
}
