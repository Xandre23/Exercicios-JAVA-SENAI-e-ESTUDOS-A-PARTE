package heranca;
import java.util.Scanner;
public class Veiculo {
    
    private int velocidade;
    private boolean status;

    public void mostrar(){
        Scanner leia = new Scanner(System.in);
         System.out.println("Está ligado?");
         status = leia.nextBoolean();
         
        if(this.status == true ){
        System.out.println("Veiculo ligado!");
        
        System.out.println("Digite a velocidade");
            this.velocidade = leia.nextInt();
            
            System.out.println("Velocidade atual: "+this.velocidade);

        }else if(this.status == false){
            System.out.println("Veiculo desligado!");
        }  
    }
  
     
    public int getVelocidade() {
        return velocidade;
    }

    
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    
    public boolean isStatus() {
        return status;
    }

  
    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
