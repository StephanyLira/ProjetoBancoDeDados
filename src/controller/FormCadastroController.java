package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;
import view.FormCadastroView;
/**
 *
 * @author steph
 */
public class FormCadastroController {
    
    private FormCadastroView view;

    public FormCadastroController(FormCadastroView view) {
        this.view = view;
    }
    
    public void salvaUsuario(){
        
        String email = view.getjTextFieldCadastrarEmail().getText();
        String senha = view.getjPasswordSenhaCadastrar().getText();
        String nome = view.getjTextFieldCadastrarNome().getText();
        String nomeSocial = view.getjTextFieldCadastrarNomeSocial().getText();
        String DDD = view.getjTextFieldCadastrarDDD().getText();
        String celular = view.getjTextFieldCadastarCelular().getText();
        String dia = view.getjComboBoxCadastrarDia().getSelectedItem().toString();
        String mes = view.getjComboBoxCadastrarMes().getSelectedItem().toString();
        String ano = view.getjComboBoxCadastarAno().getSelectedItem().toString();
        String endereco = view.getjTextFieldCadastrarEndereco().getText();
        String CEP = view.getjTextFieldCadastarCEP().getText();        
        String estado = view.getjComboBoxCadastrarEstado().getSelectedItem().toString();;
        String numero = view.getjTextFieldCadastarNumero().getText();
        
       Usuario usuarioAutenticar = new Usuario(email);
       Usuario usuarioMC = new Usuario(email, senha, nome, nomeSocial, DDD, celular, dia, mes, ano, endereco, CEP, estado, numero);
        try {
            //verificar se existe no banco de dados
        
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
            boolean existe = usuarioDao.existeNoBancoPorEmail(usuarioAutenticar);
        
        // se existir mandar mensagem para usuario
        if(existe){
           JOptionPane.showMessageDialog(view, "Email já cadastrado, utilize outro email!");
        }else{
            usuarioDao.insert(usuarioMC);
            JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");
                   }
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
