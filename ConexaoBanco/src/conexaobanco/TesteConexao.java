package conexaobanco;

public class TesteConexao {
    public static void main(String[] args) {
         Conectando bd = new Conectando();
         
         bd.getConnection();
         bd.close();
     }
}
