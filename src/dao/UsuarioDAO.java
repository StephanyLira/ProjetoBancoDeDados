
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
       
        String sql = " insert into usuario(email,senha,nome,ddd,celular,dia,mes,ano,endereco,cep,estado,numero,nomesocial) values (?, ?, ?, ?,?,?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
        statement.setString(1, usuario.getEmail());
        statement.setString(2, usuario.getSenha());
        statement.setString(3, usuario.getNome());
        statement.setInt(4, usuario.getDDD());
        statement.setInt(5, usuario.getCelular());
        statement.setInt(6, usuario.getDia());
        statement.setString(7, usuario.getMes());
        statement.setInt(8, usuario.getAno());
        statement.setString(9, usuario.getEndereco());
        statement.setInt(10, usuario.getCEP());
        statement.setString(11, usuario.getEstado());
        statement.setInt(12, usuario.getNumero());
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
        statement.setInt(4, usuario.getDDD());
        statement.setInt(5, usuario.getCelular());
        statement.setInt(6, usuario.getDia());
        statement.setString(7, usuario.getMes());
        statement.setInt(8, usuario.getAno());
        statement.setString(9, usuario.getEndereco());
        statement.setInt(10, usuario.getCEP());
        statement.setString(11, usuario.getEstado());
        statement.setInt(12, usuario.getNumero());
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
            int DDD = resultSet.getInt("ddd");
            int celular = resultSet.getInt("celular");
            int dia = resultSet.getInt("dia");
            String mes = resultSet.getString("mes");
            int ano = resultSet.getInt("ano");
            String endereco = resultSet.getString("endereco");
            int CEP = resultSet.getInt("cep");
            String estado = resultSet.getString("estado");
            int numero = resultSet.getInt("numero");
            
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
    
    public boolean existeNoBancoPorUsuarioESenha(Usuario usuario) throws SQLException {
        
        String sql = "select * from usuario where email = ? and senha = ? ";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1, usuario.getEmail());
        statement.setString(2, usuario.getSenha());
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        return resultSet.next();
    }

}
