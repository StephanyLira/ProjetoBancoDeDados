
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Usuario;
import view.AdministradorView;

public class TesteDAO {
    private AdministradorView dao;

    public TesteDAO(AdministradorView view) {
        this.dao = view;
    }

    public void testarUsuarioNoBanco() throws SQLException{
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
            
            //Teste insert
            Usuario usuarioInsert = new Usuario("stephany@gmail.com", "123", "null", "null", "null", "null", "null", "null", "null", "null", "null", "null", "null");
            Usuario usuarioInserido = usuarioDao.insert(usuarioInsert);
            
            //Teste Select Id
            Usuario usuarioSelecionado = usuarioDao.selectPorId(usuarioInserido);
            
            //Teste Delete
            usuarioDao.delete(usuarioInsert);
            
            //Teste Select All
            ArrayList<Usuario> usuarios = usuarioDao.selectAll();
            
            for (Usuario usuario : usuarios) {             
                JOptionPane.showInputDialog(null, usuario.getEmail());
            }
    }

        
}
