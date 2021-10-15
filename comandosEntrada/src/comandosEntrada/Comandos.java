package comandosEntrada;

import java.util.Scanner;
import java.util.InputMismatchException;


public class Comandos {

	public static void main(String[] args) {
		String nome, sobrenome;
		int idade;
		double salario;
		
		
		//Comandos de entrada
		//scanner
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
			nome=leia.next();
		
		System.out.println("Digite seu sobrenome: ");
			sobrenome=leia.next();
		
		System.out.println("Digite sua idade: ");
			idade=leia.nextInt();
			
		System.out.println("Digite o seu salario: ");
			salario=leia.nextInt();
		
		
		
		System.out.println(nome +" "+ sobrenome + "sua idade é: "+idade + "seu salario é:"+ salario);
		
		

		
	
	}

}
