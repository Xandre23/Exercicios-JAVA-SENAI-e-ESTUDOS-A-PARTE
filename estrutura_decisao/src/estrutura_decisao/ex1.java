package estrutura_decisao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
       double salario;
       double novoSalario;
    
       DecimalFormat df = new DecimalFormat("###,###.###");
        Scanner leia = new Scanner(System.in);
       
       System.out.println("Digite o seu salario: ");
        salario = leia.nextDouble();
        
        
        
       
        if(salario <= 1000){
            novoSalario =  salario +salario * 0.40;
                System.out.println("seu novo salario é:" +df.format(novoSalario));
          
        }
        else if(salario > 1000){
            novoSalario = salario + salario * 0.30;
                System.out.println("seu novo salario é:" +df.format(novoSalario));
            
            
        }
    }
    
}

