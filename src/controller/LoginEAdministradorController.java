
package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.AdministradorView;
import view.LoginView;
import view.CupomDeDescontoView;

/**
 *
 * @author steph
 */
public class LoginEAdministradorController {
     private LoginView view;

    public LoginEAdministradorController(LoginView view) {
        this.view = view;
    }

    public void autenticarUsuario() throws SQLException {
        
        //buscar o usuario da view
        String email = view.getjTextFieldLoginEmail().getText();
        String senha = view.getjPasswordFieldLoginSenha().getText();
        
        Usuario usuarioAutenticar = new Usuario(email, senha);
        
        //verificar se existe no banco de dados
        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        
        boolean existe = usuarioDao.existeNoBancoPorEmailESenha(usuarioAutenticar);
        
        // se existir direcionar para o menu
        if(existe){
           CupomDeDescontoView telaDeMenu = new CupomDeDescontoView();
           telaDeMenu.setVisible(true); 
        }else{
            JOptionPane.showMessageDialog(view, "Usuário ou senha inválidos");
        }
    }
     
    public void autenticarAdministrador() throws SQLException {
        
        //buscar o usuario da view
        String email = view.getjTextFieldLoginEmail().getText();
        String senha = view.getjPasswordFieldLoginSenha().getText();
        
        Usuario usuarioAutenticar = new Usuario(email, senha);
        
       //verificar se é login administrador
        String emailAdm = "admin123";
        String senhaAdm = "admin123";
        if( !senha.equals(senhaAdm) || !email.equals(emailAdm)){
            JOptionPane.showMessageDialog(view, "Acesso somente o administrador!");
        }else{
            
            AdministradorView telaDeMenu = new AdministradorView();
            telaDeMenu.setVisible(true);
        }
    } 
}
