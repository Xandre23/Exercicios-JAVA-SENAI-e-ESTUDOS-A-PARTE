package POO;


public class Carro {
    public static void main(String[] args) {
        Veiculo fusca = new Veiculo();
        
        fusca.marca = "Tesla";
        fusca.modelo = "2021";
        fusca.cor = "azul";
        fusca.combustivel = "GNV";
        fusca.motor = "1.6";
        
        fusca.exibir();
    }
    
    
}
