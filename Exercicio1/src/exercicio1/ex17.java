/*Alguns países medem temperaturas em graus Celsius, e outros em graus Fahrenheit. Faça um
algoritmo para ler uma temperatura Celsius e imprimi-Ia em Fahrenheit (pesquise como fazer este
tipo de conversão)*/
package exercicio1;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        double grau,fah;
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Informe os graus em CELSIUS: ");
            grau = leia.nextDouble();
            
            fah = (9*grau/5)+32;
            System.out.println(" GRAU FAHRENHEIT: "+fah);
        
    }
    
    
    
}
