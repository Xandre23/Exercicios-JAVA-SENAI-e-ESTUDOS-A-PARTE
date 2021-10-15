package exercicio1;

import java.util.Scanner;
import java.text.DecimalFormat;



public class ex37 {
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("##.###");
      int tabuada,resultado;
      int i;
      System.out.println("Qual tabuada voce deseja: ");
      tabuada = leia.nextInt();
      
      i=1;
      while(i<=10){
         resultado = tabuada * i;
          System.out.println(tabuada+" X "+i+" = "+resultado);
          i++;
      }
      
    }
}