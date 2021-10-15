package Exercicio;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	int	PontosLider;
	int PontosLanterna;
	
	int resultado;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.print("Digite quantos pontos o lider tem: ");
		PontosLider = leia.nextInt();
	
	System.out.print("Digite quantos pontos o lanterna tem: ");
		PontosLanterna = leia.nextInt();
		
		resultado = (PontosLider-PontosLanterna)/3;
		
		System.out.println("Resultado "+ resultado );
	
	
	
	}

}
