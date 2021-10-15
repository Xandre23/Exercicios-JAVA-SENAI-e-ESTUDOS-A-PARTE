package exercicios;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class ex5 {

	public static void main(String[] args) {
		int idade = 0, cont = 0, acm=0;
                Scanner leia = new Scanner(System.in);
                
               while(cont <=10){
                idade = Integer.parseInt(JOptionPane.showInputDialog("Digite as idades: "));
                
                if(idade>=18){
                    acm = acm +1;
                }
                cont++;
               }
               System.out.println("A quantidade de pessoas maiores de idades é: "+acm);
        }
}


        

           

