package xandre;
import java.util.Scanner;


public class Exercicio9 {

	public static void main(String[] args) {
            int numero;
            Scanner leia = new Scanner(System.in);
            
		System.out.println("Digite um numero entre 12 e 20: ");
                numero = leia.nextInt();
                
                if(numero>=12 && numero<=20){
                    System.out.println("Numero valido!! numero digitado: "+numero);
                }else{
                     System.out.println("Entrada invalida, digite novamente");
               
                }
                
                
            }
                
                    
               

        }

