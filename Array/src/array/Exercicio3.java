package Array;

import java.util.Scanner;

public class Exercicio3 {
    
  public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
int i,j;
String[][] matriz = new String[3][3];
    System.out.println("Ordem de preenchimento:\nNome\nFuncao\nSalario ");
    for (i = 0; i< 3; i++){
        for(j = 0; j<3;j++){
        System.out.println("Digite seus dados: "+(i+1));
                       matriz[i][j]=leia.next();
            }
      System.out.println("\n");
           }
        for (i = 0; i<1;i++){
            for(j = 0; j<1;j++){
                System.out.println("Nome:["+matriz[0][0]+"]");
                System.out.println("Funcao:["+matriz[0][1]+"]");                 
                System.out.println("Salario:["+matriz[0][2]+"]");
            }   
             System.out.println("\n");
            }
        for (i = 0; i<1;i++){
            for(j = 0; j<1;j++){
                System.out.println("Nome:["+matriz[1][0]+"]");
                System.out.println("Funcao:["+matriz[1][1]+"]");                  
                System.out.println("Salario:["+matriz[1][2]+"]");
            }   
             System.out.println("\n");
            }
        for (i = 0; i<1;i++){ 
            for(j = 0; j<1;j++){
                System.out.println("Nome:["+matriz[2][0]+"]");           
                System.out.println("Funcao:["+matriz[2][1]+"]");                 
                System.out.println("Salario:["+matriz[2][2]+"]");
            }   
            }
}
}
