package variavel;


public class Variavel {

    public static void main(String[] args) {
        double a=2.4,b=2.8,c=4,d=1;
        String r;
        int numero;
        
        //1ºforma de fazer
        r = "arredondamento de "+a+ " = " +Math.round(a);
            System.out.println(r);
        
        r= "arredondamento de " +b+ " = " +Math.round(b);
            System.out.println(r);
        
        //2ºforma de fazer
         System.out.println("O maior numero entre " +a+ " e "+b+ " = " + Math.max(a,b));
         System.out.println("O menor numero entre " +a+ " e "+b+ " = " + Math.min(a,b));
         System.out.println("Exponenciação entre " +a+ " elevado a: "+c+ " = " + Math.pow(a,c));
         System.out.println("A raiz quadrade de " +c+ " é " + Math.sqrt(c));
         
         //Exibir numeros aleatorios
         
         numero = (int) (Math.random()*100);
         System.out.println(numero);
        
    }
    
}
