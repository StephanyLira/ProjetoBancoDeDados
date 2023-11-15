
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Usuario;

/**
 *
 * @author steph
 */
public class UsuarioDAO {
    
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public Usuario insert(Usuario usuario) throws SQLException{
       
        String sql = " insert into usuario(email,senha,nome,ddd,celular,dia,mes,ano,endereco,cep,estado,numero,nomesocial) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
        statement.setString(1, usuario.getEmail());
        statement.setString(2, usuario.getSenha());
        statement.setString(3, usuario.getNome());
        statement.setString(4, usuario.getDDD());
        statement.setString(5, usuario.getCelular());
        statement.setString(6, usuario.getDia());
        statement.setString(7, usuario.getMes());
        statement.setString(8, usuario.getAno());
        statement.setString(9, usuario.getEndereco());
        statement.setString(10, usuario.getCEP());
        statement.setString(11, usuario.getEstado());
        statement.setString(12, usuario.getNumero());
        statement.setString(13, usuario.getNomeSocial());
        statement.execute();
        
        ResultSet resultSet = statement.getGeneratedKeys();
        
        if(resultSet.next()){
            int id = resultSet.getInt("id");
            usuario.setId(id);
        }
        return usuario;
    }
    
    public void update(Usuario usuario) throws SQLException{
        String sql = "update usuario set email = ?,senha = ?,nome = ?,ddd = ?,celular = ?,dia = ?,mes = ?,ano = ?,endereco = ?,cep = ?,estado = ?,numero = ?,nomesocial = ? where id = ? ";
        PreparedStatement statement = connection.prepareStatement(sql);
            
        statement.setString(1, usuario.getEmail());
        statement.setString(2, usuario.getSenha());
        statement.setString(3, usuario.getNome());
        statement.setString(4, usuario.getDDD());
        statement.setString(5, usuario.getCelular());
        statement.setString(6, usuario.getDia());
        statement.setString(7, usuario.getMes());
        statement.setString(8, usuario.getAno());
        statement.setString(9, usuario.getEndereco());
        statement.setString(10, usuario.getCEP());
        statement.setString(11, usuario.getEstado());
        statement.setString(12, usuario.getNumero());
        statement.setString(13, usuario.getNomeSocial());
        statement.setInt(14, usuario.getId());
        statement.execute();
    }
    
    public void insertOrUpdate(Usuario usuario) throws SQLException {
        if(usuario.getId() > 0){
            update(usuario);
        }else{
            insert(usuario);
        }
    }
    
    public void delete(Usuario usuario) throws SQLException{
        String sql = "delete from usuario where id = ? ";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setInt(1, usuario.getId());
        statement.execute();
    }
    
    public ArrayList<Usuario> selectAll() throws SQLException{
        String sql = "select * from usuario";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        return pesquisa(statement);
    }

    private ArrayList<Usuario> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        
        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String email = resultSet.getString("email");
            String senha = resultSet.getString("senha");
            String nome = resultSet.getString("nome");
            String nomeSocial = resultSet.getString("nomeSocial");
            String DDD = resultSet.getString("ddd");
            String celular = resultSet.getString("celular");
            String dia = resultSet.getString("dia");
            String mes = resultSet.getString("mes");
            String ano = resultSet.getString("ano");
            String endereco = resultSet.getString("endereco");
            String CEP = resultSet.getString("cep");
            String estado = resultSet.getString("estado");
            String numero = resultSet.getString("numero");
            
            Usuario usuarioComDadosDoBanco = new Usuario(id, email, senha, nome, nomeSocial, DDD, celular, dia, mes, ano, endereco, CEP, estado, numero);
            usuarios.add(usuarioComDadosDoBanco);
        }
        
        return usuarios;
    }
    
    public Usuario selectPorId(Usuario usuario) throws SQLException{
        String sql = "select * from usuario where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, usuario.getId());
        
        return pesquisa(statement).get(0);
        
    }
    
    public boolean existeNoBancoPorEmailESenha(Usuario usuario) throws SQLException {
        
        String sql = "select * from usuario where email = ? and senha = ? ";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, usuario.getEmail());
        statement.setString(2, usuario.getSenha());
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        return resultSet.next();
    }
    
    public boolean existeNoBancoPorEmail(Usuario usuario) throws SQLException {
        
        String sql = "select * from usuario where email = ?";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, usuario.getEmail());
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        return resultSet.next();
    }
}
