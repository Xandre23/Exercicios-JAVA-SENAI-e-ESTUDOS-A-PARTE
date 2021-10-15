package exercicio1;
import java.util.Scanner;
import java.text.DecimalFormat;


public class ex21 {
    public static void main(String[] args) {
        double lata, garrafa6, garrafa2, litros;
        
     Scanner leia = new Scanner (System.in);
     DecimalFormat df = new DecimalFormat("##.####");
     
     System.out.println("Quantos refri de lata? ");
        lata = leia.nextDouble();
     
      System.out.println("Quantos refri de garrafa de 600ml? ");
       garrafa6 = leia.nextDouble();
        
       System.out.println("Quantos refri de garrafa de 2L? ");
        garrafa2 = leia.nextDouble();
        
       
        
        
        litros = (lata *0.35)+ (garrafa6 *0.6) + (garrafa2 * 2);
        
        System.out.println("Litros: "+df.format(litros));
        
        
        
        
        
    
}
}
