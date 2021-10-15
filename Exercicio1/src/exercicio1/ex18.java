/*A empresa Hipotheticus paga R$10,00 por hora normal trabalhada, e R$15,00 por hora extra. Faça
um algoritmo para calcular e imprimir o salário bruto e o salário líquido de um determinado
funcionário. Considere que o salário líquido é igual ao salário bruto descontando-se 10% de
impostos*/
package exercicio1;
import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        double salarioNormal,salarioExtra, horaNormal,horaExtra,desconto,salarioBruto,imposto,liquido;
        
        
         Scanner leia = new Scanner (System.in);
          System.out.println("Digite as horas trabalhadas: ");
            horaNormal = leia.nextDouble();
            
            System.out.println("Digite quantas horas extra vocês fez: ");
            horaExtra = leia.nextDouble();
         
         
         salarioNormal = horaNormal*10;
         salarioExtra = horaExtra*15;
         salarioBruto = salarioNormal + salarioExtra;
         imposto = (salarioNormal + salarioExtra) * 0.10 ; 
         liquido = salarioBruto-imposto;
        
         System.out.print("Você trabalhou: " +  horaNormal + "\nHoras,  Recebendo:R$" +  salarioNormal + "\n Em horas extra vc totalizou: R$" + salarioExtra + " \n Seu Salário Bruto é de: R$" + salarioBruto+ "\nSeu Salário Liquido é de: R$ " + liquido);
        
         
    }
    
}
