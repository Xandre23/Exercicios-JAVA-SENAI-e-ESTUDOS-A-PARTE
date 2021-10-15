package exercicio1;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class ex10 {
    
    public static void main(String[] args) {
         Scanner leia = new Scanner (System.in);
         DecimalFormat df = new DecimalFormat("##,###");
        Locale.setDefault(Locale.US);
        Double x1 = null;
        Double x2 = null;
        Double y1 = null;
        Double y2 = null;
        
       double distancia  = Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2));
       
          System.out.println("RAIZ: "+df.format(distancia));
        
        
        
        
            
           
           
           
         
           
           
          
    }

    
    }
    
