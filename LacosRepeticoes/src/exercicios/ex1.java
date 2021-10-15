package exercicios;
import java.util.Scanner;


public class ex1 {

	public static void main(String[] args) {
		int i = 0, max,resultado;
                Scanner leia = new Scanner(System.in);
                
                System.out.println("Digite a tabuada que você deseja:");
                max = leia.nextInt();
                
                
                while (i<=10) {   
            resultado = i*max;
                System.out.println(max+ " X " +i + " = " +resultado);
            
                i++;
                
            }
                
                    
               

        }
}
