package Exercicio;

import java.util.Scanner;

public class Produto {
      Scanner teclado = new Scanner (System.in);
    private String nome;
    private double preco;
    private int quantidade;
    private int desconto;

    
    public  void Cadastro(){
        System.out.println("Nome: ");
            nome = teclado.next();
            
        System.out.println("Preço: ");
            preco = teclado.nextDouble();
            
        System.out.println("Quantidade: ");
           quantidade = teclado.nextInt();    
            
    }
   
    public String getNome() {
        return nome;
    }

  
    public void setNome(String nome) {
        this.nome = nome;
        
    }

  
    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }


    public int getQuantidade() {
        return quantidade;
    }

   
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
       
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
   
    
    public void desconto(){
        if(quantidade <= 1 && quantidade <= 10 ){
            System.out.println("Valor total do produto: R$"+ desconto);  
        }else
        if(quantidade >= 11 && quantidade <= 20 ){
          desconto = quantidade - (quantidade*10/100);
            System.out.println("Desconto de 10% R$"+ desconto);
        }else
         if(quantidade >= 21 && quantidade <= 50){
             
          desconto = quantidade - (quantidade*20/100);
          System.out.println("Desconto de 20% R$"+ desconto);
        }
          if(quantidade >=50){
          desconto = quantidade - (quantidade*25/100);
          System.out.println("Desconto de 25% R$"+ desconto);
     
        }
    }
 
    
    
    public void Status(){
        System.out.println("Nome do produto: "+ getNome());
        System.out.println("Preço do produto: R$"+ getPreco());
        System.out.println("Quantidade de produtos: "+ getQuantidade());
        
        
      
 
    }

    
}
