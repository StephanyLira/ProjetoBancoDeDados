
package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.LoginView;
import view.MenuView;

/**
 *
 * @author steph
 */
public class LoginController {
     private LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {
        
        //buscar o usuario da view
        String email = view.getjTextFieldLoginEmail().getText();
        String senha = view.getjPasswordFieldLoginSenha().getText();
        
        Usuario usuarioAutenticar = new Usuario(email, senha);
        
        //verificar se existe no banco de dados
        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        
        boolean existe = usuarioDao.existeNoBancoPorUsuarioESenha(usuarioAutenticar);
        
        // se existir direcionar para o menu
        if(existe){
           MenuView telaDeMenu = new MenuView();
           telaDeMenu.setVisible(true); 
        }else{
            JOptionPane.showMessageDialog(view, "Usuário ou senha inválidos");
        }
        
        
    }
     
     
}
