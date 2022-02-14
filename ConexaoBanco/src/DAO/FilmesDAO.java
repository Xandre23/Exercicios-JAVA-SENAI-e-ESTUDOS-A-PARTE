package DAO;

import Model.Filmes;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.protocol.Resultset;
import conexaobanco.Conectando;
import java.sql.PreparedStatement;

public class FilmesDAO {
    public Filmes filme;
    public Conectando bd;
    
    private PreparedStatement statement;
    //private Resultset resultSet;
    private Resultset resultSet;
    private String men, sql;
    
    private static final byte INCLUSAO = 1;
     private static final byte ALTERACAO  = 2;
      private static final byte EXCLUSAO = 3;
    
    public FilmesDAO(){
         bd = new Conectando ();
          filme  = new Filmes();
    }

    public boolean localizar(){
        sql = "select * from filmes where = ?";
        try{
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1,filme.getCodigo());
            resultSet.next();
            //resultSet.next();
            filme.setCodigo(resultSet.getString(1));
            filme.setTitulo(resultSet.getString(2));
            filme.setGenero(resultSet.getString(3));
            filme.setProdutora(resultSet.getString(4));
            filme.setDatacompra(resultSet.getString(5));
            
            return true;
            
        }catch (Exception e){
            return false;
        }
  
    }
        public String atualizar(int operacao){
        men = "Operação realizada com sucesso";
        try {
            if(operacao ==  INCLUSAO){
 
            sql = "insert into filmes values = (?,?,?,?,?)";
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, filme.getCodigo());
            statement.setString(2, filme.getTitulo());
            statement.setString(3, filme.getGenero());
            statement.setString(4, filme.getProdutora());
            statement.setString(5, filme.getDatacompra());
            
            }else if(operacao == ALTERACAO){
                sql = "update filmes set titulo =?, genero=?,produtora=?,datacompra=?, where codigo=?";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(5, filme.getCodigo());
                statement.setString(1, filme.getTitulo());
                statement.setString(2, filme.getGenero());
                statement.setString(3, filme.getProdutora());
                statement.setString(4, filme.getDatacompra());
            }else if(operacao == EXCLUSAO){
                sql = "delete from filmes where codigo=?";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1, filme.getCodigo());
            }
            if(statement.executeUpdate()==0){
                men = "Falha na operação";
            }
        } catch (Exception e) {
            men="Falha na operação"+ e.toString();
        }
        return men;
    }
    
    

}
