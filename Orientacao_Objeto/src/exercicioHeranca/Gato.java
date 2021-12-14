package exercicioHeranca;

public class Gato extends Animal {
    public static void main(String[] args) {
        Gato gato = new Gato();
        
        gato.setNome("ted");
        gato.setSexo("masc");
        gato.miar();
        
        System.out.println("@@@@@: "+gato.getNome());
        
    }
    public void miar(){
        System.out.println("@@@@@");
    }
    
    
}
