package exercicios;
import java.util.Scanner;

public class exFor6 {

	public static void main(String[] args) {
		String prod = null;
                int preco = 0;
                int acm=0;
                Scanner leia = new Scanner(System.in);
                
                for (int i = 0; i<5; i++ ) {
                    System.out.println("Digite o nome do produto: ");
                        prod = leia.next();
                        
                       
                        
                        
                    
                    System.out.println("Digite o valor: ");
                      preco = leia.nextInt();
                       acm = acm+preco;
                   
                    }
                 
                 System.out.println("Valor acumulado: "+ acm);
                  
            
                
            }
             
}



        

           

