package exercicio1;

import java.util.Scanner;

public class ex2 {
    
  public static void main(String[] args) {
    int qtdCavalos;
    double resultado;
    
    Scanner leia = new Scanner (System.in);
    
    System.out.println("Digite a quantidade de cavalos: ");
    qtdCavalos = leia.nextInt();
    
    resultado = qtdCavalos * qtdCavalos;
    
    System.out.println("Pela quantidade de cavalos, vamos precisar de "+resultado+" ferraduras");
     
    
    
    
}
}
