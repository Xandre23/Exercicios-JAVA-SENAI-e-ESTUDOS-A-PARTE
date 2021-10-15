package exercicios;
import java.util.Scanner;


public class ex2 {

	public static void main(String[] args) {
		int i = 0, max,total;
                Scanner leia = new Scanner(System.in);
                
                System.out.println("Digite um valor:");
                max = leia.nextInt();
                
                do{
                    total = max *i;
                    System.out.println(max+" X "+ i +" = "+total);
                
              i++;
                
            }while(i<=10);
                
                    
               

        }
}
