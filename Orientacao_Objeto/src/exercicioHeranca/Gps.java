package exercicioHeranca;

import java.util.Scanner;

public class Gps {
    Scanner leia = new Scanner(System.in);
    
    private String idioma;
    private String rota;

    public Gps(String idioma, String rota) {
        this.idioma = idioma;
        this.rota = rota;
    }

    public Gps() {
      this.idioma = "Portugues";
      this.idioma = "tatuape";
    
    }
    
    
    
    public void StatusGps(){
        System.out.println("Digite o idioma que deseja");
            idioma = leia.next();
            
            System.out.println("Digite a rota que deseja");
                rota = leia.next();
            
        if("portugues".equals(idioma)){
            System.out.println("Gps Ligado!!");
            System.out.println("Idioma definido: "+ idioma);
            System.out.println("Rota definida: "+ rota);
        }
}
    

   
    public String getIdioma() {
        return idioma;
    }

   
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

  
    public String getRota() {
        return rota;
    }

   
    public void setRota(String rota) {
        this.rota = rota;
    }
    
    
}
