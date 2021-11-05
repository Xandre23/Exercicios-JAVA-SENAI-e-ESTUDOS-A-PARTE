package animal;

public class Animal {
    private String nome;
    private String raca;
    private String cor;
    private String tamanho;
    private String sexo;
    private String tipoPelo;
    private String comendo;

   
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getRaca() {
        return raca;
    }

    
    public void setRaca(String raca) {
        this.raca = raca;
    }

   
    public String getCor() {
        return cor;
    }

  
    public void setCor(String cor) {
        this.cor = cor;
    }

   
    public String getTamanho() {
        return tamanho;
    }

    
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

   
    public String getSexo() {
        return sexo;
    }

  
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

  
    public String getTipoPelo() {
        return tipoPelo;
    }

  
    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

 
    public String getComendo() {
        return comendo;
    }

   
    public void setComendo(String comendo) {
        this.comendo = comendo;
    }
    public void latir(){
       System.out.println("auau");
    }
    public void comer(){
     
    }
}


