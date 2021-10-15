package estrutura_decisao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
       double n1,n2,n3,n4,media;
       
    
       DecimalFormat df = new DecimalFormat("###,##");
        Scanner leia = new Scanner(System.in);
       
       System.out.println("Digite a primeira nota ");
            n1 = leia.nextDouble();
        
        System.out.println("Digite a segunda  nota ");
            n2 = leia.nextDouble();
        
        System.out.println("Digite a terceira nota ");
            n3 = leia.nextDouble();
        
        System.out.println("Digite a quarta nota ");
            n4 = leia.nextDouble();
        
            media = (n1+n2+n3+n4)/4;

        if(media >= 7){
            
            System.out.println("Aprovado "+media);
          
            }
            else if(media <=6  || media >=4) {
                 System.out.println("recuperação "+media);
            
                }
                    else if(media <4){
                                 System.out.println("reprovado "+ media);
                            }
            
    }
    
}

