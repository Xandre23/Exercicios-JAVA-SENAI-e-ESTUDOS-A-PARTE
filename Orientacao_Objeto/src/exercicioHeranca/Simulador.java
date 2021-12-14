package exercicioHeranca;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Simulador {
    Scanner leia = new Scanner(System.in);
    private boolean status;
    public void status(){
        
    }

    public void ligar() throws InterruptedException{
        System.out.println("deseja ligar a bomba?");
        status = leia.nextBoolean();
        
        if(status == true){
            System.out.println("Bomba ligada!!");
            for(int i= 0; i<30; i++){
                System.out.println(i);
                TimeUnit.SECONDS.sleep(1);
            }
            desligar();
        }else if(status == false){      
            desligar();
        }
    }
    public void desligar (){
        System.out.println("a bomba está desligada");
    }

    public boolean isStatus() {
        return status;
    }

   
    public void setStatus(boolean status) {
        this.status = status;
    }
}