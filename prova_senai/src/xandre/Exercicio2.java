package xandre;
import java.util.Scanner;



public class Exercicio2 {

	public static void main(String[] args) {
		int idade = 0, cont = 0, acm=0;
                Scanner leia = new Scanner(System.in);
                
               while(cont <=10){
                System.out.println("Digite a idade: ");
                     idade = leia.nextInt();
                
                if(idade>=18){
                    acm = acm +1;
                }
                cont++;
               }
               System.out.println("A quantidade de pessoas maiores de idades é: "+acm);
        }
}


        
