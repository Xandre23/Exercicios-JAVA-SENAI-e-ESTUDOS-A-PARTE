package heranca;

public class Passaro extends Animal implements AnimalSelvagem {
    public static void main(String[] args) {
        Animal an = new Animal();
        
        an.setCor("Azul");
        an.setTamanho(30);
        
        
        System.out.println("Cor do passaro: "+an.getCor());
         System.out.println("Tamanho do passaro: "+an.getTamanho()+"CM");
    
    }
    public void Voar(){
        System.out.println("@@@@@@@@@@@@@@@@");
    }

    @Override
    public void atacar() {
       System.out.println("@@@@@");
    }
    
}

