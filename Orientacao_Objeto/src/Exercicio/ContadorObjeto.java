package Exercicio;

public class ContadorObjeto {
      public static void main(String[] args) {
          Contador cont = new Contador();
          
         cont.incrementar();
         cont.retornar();
         System.out.println("Eventos:" +cont.retornar());
      }
    
}
