/*A granja Frangotech possui um controle automatizado de cada frango da sua produção. No pé
direito do frango há um anel com um chip de identificação; no pé esquerdo são dois anéis para
indicar o tipo de alimento que ele deve consumir. Sabendo que o anel com chip custa R$4,00 e o
anel de alimento custa R$3,50, faça um algoritmo para calcular o gasto total da granja para marcar
todos os seus frangos. */

package exercicio1;


import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        double anel1,anel2,frango;
         Scanner leia = new Scanner (System.in);
            System.out.print("Quantos frangos tem? ");
                 frango = leia.nextDouble();
         
         anel1= 4.00;
         anel2= 3.50*2;
         frango = (anel1+anel2 )*frango;
         
        System.out.print("Total gasto para marcar os frangos:  R$"+frango);
        
}
}
