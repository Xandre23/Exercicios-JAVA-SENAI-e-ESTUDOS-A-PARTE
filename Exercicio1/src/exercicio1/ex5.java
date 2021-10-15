
package exercicio1;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        double tanque;
        double valorGasolina;
        double litros;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o valor que deseja encher o tanque: ");
            tanque = leia.nextDouble();
        System.out.println("Digite o valor da gasolina: R$");
            valorGasolina = leia.nextDouble();
            
            litros = valorGasolina / tanque;
            
            System.out.println("Litros colocados no tanque "+litros);
        
    }
    
}
