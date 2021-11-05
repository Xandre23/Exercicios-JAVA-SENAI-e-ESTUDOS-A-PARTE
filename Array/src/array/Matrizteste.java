/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author LABC18-14
 */
public class Matrizteste {
     public static void main(String[] args) {
         int [][]matriz = {{1,2,3,4},{5,6,7,8}};
         int [][]matriz1 = new int[1][3];
         
         for(int i = 0; i<matriz.length;i++){
           for(int j = 0; j<matriz[i].length;j++){
               System.out.println(" Linha "+i+" Valor " +matriz[i][j]);
           }  
           System.out.println();
         }
     }
    
}
