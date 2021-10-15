package Exercicio;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
	double Produto;
	double desconto;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o valor do produto: ");
		Produto=leia.nextDouble();
	
	desconto = Produto * 0.10;
	
	System.out.println("O valor de desconto é: "+desconto);
	
	
	
	
	
	
}
}
