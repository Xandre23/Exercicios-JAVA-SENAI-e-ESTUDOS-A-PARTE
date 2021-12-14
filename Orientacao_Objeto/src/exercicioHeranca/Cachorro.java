package exercicioHeranca;

public class Cachorro extends Animal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        
        cachorro.setNome("dob");
        cachorro.latir();
        
        
        
    }
 
    public void latir(){
        System.out.println("@@@@@@");
    }
    
}
