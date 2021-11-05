package Calculadora_Cientifica;

import java.util.Scanner;

public class CalculadoraPOO {
Scanner leia = new Scanner(System.in);
	private double valor1;
	private double valor2;
	private double resultado;

	String escolha;

	public void getDig() {

		  {
			System.out.println("1-EXPONENCIAÇÃO\n2-RAIZ QUADRADA\n3-PORCENTAGEM\n4-mais\n5-menos\n6-vezes\n7-dividir ");
			escolha = leia.next();
		}

	}
       

	public void setEscolha() {
		switch (escolha) {
		case "1":
                        
			this.resultado = Math.pow(this.valor1, this.valor2);
			System.out.println("Total: " + this.resultado);
			break;

		case "2":
                        System.out.println("Digite o numero que deseja saber a raiz quadrada: ");
                        valor1 = leia.nextInt();
                        
			this.resultado = Math.sqrt(valor1);
			System.out.println("Total: " + resultado);
			break;

		case "3":
                        valor1 = leia.nextInt();
                        valor2 = leia.nextInt();
                        resultado = (valor1*100)/valor2;
                        
			this.resultado = (this.valor1*100)/this.valor2;
			System.out.println("Porcentagem: " + this.resultado);
			break;
                        
                case "4":
                        valor1 = leia.nextInt();
                        valor2 = leia.nextInt();
                        
                        
			this.resultado = this.valor1+this.valor2;
			System.out.println("Soma: " + this.resultado);
			break;        
                        
		
                case "5":
                        valor1 = leia.nextInt();
                        valor2 = leia.nextInt();
                        
                        
			this.resultado = this.valor1-this.valor2;
			System.out.println("Menos: " + this.resultado);
			break; 
                        
                 case "6":
                        valor1 = leia.nextInt();
                        valor2 = leia.nextInt();
                        
                        
			this.resultado = this.valor1*this.valor2;
			System.out.println("Vezes: " + this.resultado);
			break;
                        
                 case "7":
                        valor1 = leia.nextInt();
                        valor2 = leia.nextInt();
                        
                        
			this.resultado = this.valor1/this.valor2;
			System.out.println("Dividir: " + this.resultado);
			break;        
                      
		}
	}
}