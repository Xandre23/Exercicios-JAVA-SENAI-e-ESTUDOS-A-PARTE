package exercicio1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex23 {
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("##.####");
      double altura,predio, pSombra, sombra;
      
      
       System.out.println("Digite a altura da sombra do predio: ");
        pSombra = leia.nextDouble();
      
       System.out.println("Digite a altura da sua sombra: ");
        sombra = leia.nextDouble();
      
      System.out.println("Digite sua altura: ");
        altura = leia.nextDouble();
      
      predio = altura * pSombra * sombra;
      
      System.out.println("A altura do prédio É "+ df.format(predio));
      
      
    
}
}
