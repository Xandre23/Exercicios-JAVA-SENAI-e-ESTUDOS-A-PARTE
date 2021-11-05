
package ExercicioSArray;

import java.util.Scanner;


public class Ex1 {
     public static void main(String[] args) {
         Scanner leia = new Scanner(System.in);
         int [][]matriz = new int[4][4];
         
         for(int linha = 0; linha<matriz.length;linha++){
           for(int coluna = 0; coluna<matriz[linha].length;coluna++){
               int numero = (int)(Math.random()*9);
               System.out.println(linha+"Digite um numero");
               matriz[linha][coluna] = leia.nextInt();
              
               
           }  
           
           
         }
     }
    
}
