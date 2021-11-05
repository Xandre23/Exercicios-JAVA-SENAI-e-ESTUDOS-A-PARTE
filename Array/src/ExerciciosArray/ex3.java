
package ExercicioSArray;

import java.util.Scanner;


public class ex3 {
     public static void main(String[] args) {
         Scanner leia = new Scanner(System.in);
         int acm = 0;
         int [][]matriz= new int[3][3];
         
         for(int i = 0; i<matriz.length;i++){
             for(int j = 0; j<matriz.length;j++){

            System.out.println("Digite um numero: ");
               matriz[i][j] = leia.nextInt();
                
               acm = acm + 1;
          
           } 
            
              if(acm %2 == 0){
                System.out.println("Numero pares: "+acm);
                 
             }else{
                System.out.println("Numero impar: "+acm);
            }

         }
         }
     }
    


