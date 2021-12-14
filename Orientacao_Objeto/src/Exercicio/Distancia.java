package Exercicio;

import java.util.Scanner;
public class Distancia {
    
    double x1, y1, x2, y2;
    
    private double distancia;
    
       public double getDistancia() {
        return distancia;
    }

   
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
  
    
     public  void Distancia(){
         Scanner teclado = new Scanner (System.in);
         System.out.println("Entre as coordenadas x e y dos pontos nesta ordem: ");
         
         x1 = teclado.nextFloat();
         y1 = teclado.nextFloat();
         x2 = teclado.nextFloat();
         y2 = teclado.nextFloat();
         
         setDistancia(Math.pow(Math.pow(x2- x1, 2)+ Math.pow(y2-y1,2), 1/1));
         System.out.println("A distancia é: "+getDistancia());
     }

  
 
    
}
