/*A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de
queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou
presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça um algoritmo em
que o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em
quilos) de queijo, presunto e carne necessários para compra.*/

package exercicio1;

import java.util.Scanner;


public class ex16 {
    public static void main(String[] args) {
        double sanduiche, queijo, presunto,hamburguer,conta1,conta2,conta3;
        
         Scanner leia = new Scanner (System.in);
         
         System.out.println("Digite a quantidade de sanduiches: ");
            sanduiche = leia.nextDouble();
            
            queijo = 0.5;
            presunto = 0.5;
            hamburguer = 0.1;
            
            conta1 = sanduiche * queijo;
            conta2 =sanduiche * presunto;
            conta3 =sanduiche * hamburguer;
            
            System.out.println("Quantidade de queijo: KG:"+conta1);
            System.out.println("Quantidade de presunto: KG:"+conta2);
            System.out.println("Quantidade de hamburguer: KG:"+conta3);
         
         
    }
    
}
