package Funcionario;

import java.util.Scanner;

public class Pessoa {
    private String Nome;
    private String Dp;
    private Double Salario;
    private String DataEntrada;
    private String Rg;
    private String Status;

    public void CadastrarFunc(){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite Seu Nome: ");
        Nome = leia.next();
        
        System.out.println("Digite Seu departamento: ");
        Dp = leia.next();
        
        System.out.println("Digite Seu Salario: ");
        Salario = leia.nextDouble();
        
        System.out.println("Digite Sua data de entrada: ");
        DataEntrada = leia.next();
        
        System.out.println("Digite Seu RG: ");
        Rg = leia.next();
        
       System.out.println("Ainda está na empresa? ");
       Status = leia.next();
 
    }
    public String getNome() {
        return Nome;
    }


    public void setNome(String Nome) {
        this.Nome = Nome;
        
    }

  
    public String getDp() {
        return Dp;
    }

  
    public void setDp(String Dp) {
        this.Dp = Dp;
    }


    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }

  
    public String getDataEntrada() {
        return DataEntrada;
    }

   
    public void setDataEntrada(String DataEntrada) {
        this.DataEntrada = DataEntrada;
    }

 
    public String getRg() {
        return Rg;
    }

   
    public void setRg(String Rg) {
        this.Rg = Rg;
    }

 
    public String Status() {
        return Status;
    }

   
    public void setStatus(String Status) {
        this.Status = Status;
    }
    public void exibir(){
        System.out.println("Nome: "+this.Nome);
        System.out.println("Departamento: "+this.Dp);
        System.out.println("Salario: "+this.Salario);
        System.out.println("data de entrada: "+this.DataEntrada);
        System.out.println("Rg: "+this.Rg);
        System.out.println("Status: "+this.Status);
    }
    
}
