import java.util.Scanner;
import java.text.DecimalFormat;



public class ex38 {
    public static void main(String[] args) {
     Scanner leia = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("##.###");
      int ano_nasc, ano_atual,anos,meses,dias,semanas,idade;
      
      System.out.println("Digite o ano de nascimento: ");
        ano_nasc = leia.nextInt();
        
       System.out.println("Digite o ano atual: ");
        ano_atual = leia.nextInt();
      
        
        idade = ano_nasc -ano_atual;
        anos = idade*365;
        meses = anos *12;
        dias =  meses*30;
        semanas = meses/7;
        
        System.out.println("Idade dessa pessoa em anos: "+anos);
        System.out.println("Idade dessa pessoa em meses: "+meses);
        System.out.println("Idade dessa pessoa em dias: "+dias);
        System.out.println("Idade dessa pessoa em semanas: "+semanas);
      
    }
}
