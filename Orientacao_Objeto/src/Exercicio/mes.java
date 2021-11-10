
package Exercicio;

import java.util.Scanner;

public class mes {
    
   
    String escolha;
    String escolhaLingua;

    public String getEscolha() {
        return escolha;
    }

    public void setEscolha(String escolha) {
        this.escolha = escolha;
    }
      public void escolherlingua(){
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Escolha a lingua 1-BR 2-EN");
            escolhaLingua = leia.next();
            switch (escolhaLingua ){
               case "1":
                   escolherMesBR();
                   break;
               case "2":
                   escolherMesEN(); 
                   break;
               default:
                   System.out.println("Linguagem não existente, Escolha entre 1-Br 2-En");
                    escolherlingua();
            }
      }      
    public void escolherMesBR(){
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Escolha o mês");
            escolha = leia.next();
            switch (escolha){
                    case "1":
                    System.out.println("Janeiro");
                    break;
                    case "2":
                    System.out.println("Fevereiro");
                    break;
                    case "3":
                    System.out.println("Março");
                    break;
                    case "4":
                    System.out.println("Abril");
                    break;
                    case "5":
                    System.out.println("Maio");
                    break;  
                    case "6":
                    System.out.println("Junho");
                    break;  
                    case "7":
                    System.out.println("Julho");
                    break;  
                    case "8":
                    System.out.println("Agosto");
                    break;  
                    case "9":
                    System.out.println("Setembro");
                    break;
                    case "10":
                    System.out.println("Outubro");
                    break; 
                    case "11":
                    System.out.println("Novembro");
                    break;
                    case "12":
                    System.out.println("Dezembro");
                    break;  
                         default:
                                System.out.println("Mês não existente, escolha entre 1 a 12");
                                escolherMesBR();
            }
    }
     public void escolherMesEN(){
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Escolha o numero do mês");
            escolha = leia.next();
            switch (escolha){
                case "1":
                    System.out.println("January");
                    break;
                    case "2":
                    System.out.println("Fabuary");
                    break;
                    case "3":
                    System.out.println("March");
                    break;
                    case "4":
                    System.out.println("April");
                    break;
                    case "5":
                    System.out.println("May");
                    break;  
                    case "6":
                    System.out.println("June");
                    break;  
                    case "7":
                    System.out.println("July");
                    break;  
                    case "8":
                    System.out.println("August");
                    break;  
                    case "9":
                    System.out.println("September");
                    break;
                    case "10":
                    System.out.println("October");
                    break; 
                    case "11":
                    System.out.println("November");
                    break;
                    case "12":
                    System.out.println("December");
                    break;
                      default:
                            System.out.println("Mês não existente, escolha entre 1 a 12");
                            escolherMesEN();
                    
            }
    }
    
    
}
