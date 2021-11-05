package model;

import java.util.Scanner;

public class Garoto {
    Scanner leia = new Scanner(System.in);
      public static void main(String[] args) {
          Pessoa garoto = new Pessoa();
          
          garoto.setNome("Didi");
          garoto.setIdade(80);
          
          System.out.println(garoto.getNome());
          System.out.println(garoto.getIdade());
      }
    
}
