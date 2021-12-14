package Exercicio;

import java.util.Scanner;

public class Contador {
     Scanner teclado = new Scanner (System.in);
    private int valor;
    String eventos;
    
    public int zera(){
        
       this.valor = 0;
       return valor;
       
    }
    public int incrementar(){
        System.out.println("Digite os eventos ");
            eventos = teclado.next();
        this.valor++;
        return valor;
    }
    public String retornar(){
        return eventos;
    }

    
}
