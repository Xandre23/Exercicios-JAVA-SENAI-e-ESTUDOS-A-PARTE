import java.util.Scanner;
import java.text.DecimalFormat;



public class ex39 {
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("##.###");
      double salario, totalPagar,divida1,divida2,imposto;
      System.out.println("Salario: ");
        salario = leia.nextDouble();
        
        System.out.println("Valor divida: ");
            divida1 = leia.nextDouble();
            
            System.out.println("Valor divida: ");
            divida2 = leia.nextDouble();
            
        divida2 = divida2 + divida2 *2/100;
        
        totalPagar = salario - divida1 - divida2;
        
        System.out.println("Restará: R$"+df.format(totalPagar));
      
      
    }
}

