package exercicio1;

import java.util.Scanner;
import java.text.DecimalFormat;



public class ex30 {
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("##,###");
      Double salarioFixo, comissao,vendas;
      
      System.out.println("Digite o seu salario fixo: ");
      salarioFixo = leia.nextDouble();
      
       System.out.println("Digite o seu total de vendas: ");
        vendas = leia.nextDouble();
        
        comissao = salarioFixo + vendas *0.4;
        
        System.out.println("Seu salário com a comissão ficara de:  R$"+df.format(comissao));
      
    }
}
