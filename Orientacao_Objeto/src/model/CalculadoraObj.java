package model;

import java.util.Scanner;

public class CalculadoraObj {

	private double valor1;
	private double valor2;
	private double resultado;

	String escolha;

	public void getDig() {

		try (Scanner leia = new Scanner(System.in)) {

			System.out.println("1-SOMA\n2-Subtração\n3-Divisão\n4-Multiplicação ");
			escolha = leia.next();

			valor1 = leia.nextInt();
			valor2 = leia.nextInt();
		}

	}

	public void setEscolha() {
		switch (escolha) {
		case "1":
			this.resultado = valor1 + valor2;
			System.out.println("Total: " + resultado);
			break;

		case "2":
			this.resultado = valor1 - valor2;
			System.out.println("Total: " + resultado);
			break;

		case "3":
			this.resultado = valor1 / valor2;
			System.out.println("Total: " + resultado);
			break;

		case "4":
			this.resultado = valor1 * valor2;
			System.out.println("Total: " + resultado);
			break;
		}
	}
}