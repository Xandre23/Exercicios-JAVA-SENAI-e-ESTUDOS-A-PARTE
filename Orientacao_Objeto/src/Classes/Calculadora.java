package Classes;



public class Calculadora {
    public static void main(String[] args) {

          
          CalculadoraBase cassio = new CalculadoraBase();
           CalculadoraBase hp = new CalculadoraBase();
          
          cassio.SolicitarNumero();
          cassio.escolherOperacao();
          cassio.exibirNumero();
          
          System.out.println("***********CALCULADORA HP ***********");
             hp.SolicitarNumero();
             hp.escolherOperacao();
             hp.exibirNumero();
          
        
       
        
    }
    
    
}
