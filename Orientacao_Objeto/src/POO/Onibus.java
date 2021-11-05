package POO;
public class Onibus {
    public static void main(String[] args) {
        Veiculo Onibus = new Veiculo();
        
        Onibus.marca = "Mercedez";
        Onibus.modelo = "2010";
        Onibus.cor = "azul";
        Onibus.combustivel = "Gasolina";
        Onibus.motor = "1.0";
        Onibus.capacidade = 50;
        
        Onibus.exibir();
    }
    
}
