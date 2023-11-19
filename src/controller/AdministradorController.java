package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;
import view.AdministradorView;
import view.FormCadastroView;

public class AdministradorController {
    private final AdministradorView view;

    public AdministradorController(AdministradorView view) {
        this.view = view;
    }  
        public void salvaUsuarioNoBanco(){
            if ( !"".equals(view.getjTextFieldAdministradorNumero().getText())
            && (((((((((!"".equals(view.getjTextFieldAdministradorCelular().getText()) 
            && !"".equals(view.getjTextFieldAdministradorEmail().getText())) 
            && !"".equals(view.getjPasswordAdministradorSenha().getText())) 
            && !"".equals(view.getjTextFieldAdministradorNome().getText())) 
            && !"".equals(view.getjTextFieldAdministradorDDD().getText())) 
            && !"<Selecione>".equals(view.getjComboBoxAdministradorDia().getSelectedItem().toString())) 
            && !"<Selecione>".equals(view.getjComboBoxAdministradorMes().getSelectedItem().toString())) 
            && !"<Selecione>".equals(view.getjComboBoxAdministradorAno().getSelectedItem().toString()))
            && (!"".equals(view.getjTextFieldAdministradorEndereco().getText()) 
            && !"".equals(view.getjTextFieldAdministradorCEP().getText()))) 
            && !"<Selecione>".equals(view.getjComboBoxAdministradorEstado().getSelectedItem().toString())) )
            {
                String email = view.getjTextFieldAdministradorEmail().getText();
                String senha = view.getjPasswordAdministradorSenha().getText();
                String nome = view.getjTextFieldAdministradorNome().getText();
                String nomeSocial = view.getjTextFieldAdministradorNomeSocial().getText();
                String DDD = view.getjTextFieldAdministradorDDD().getText();
                String celular = view.getjTextFieldAdministradorCelular().getText();
                String dia = view.getjComboBoxAdministradorDia().getSelectedItem().toString();
                String mes = view.getjComboBoxAdministradorMes().getSelectedItem().toString();
                String ano = view.getjComboBoxAdministradorAno().getSelectedItem().toString();
                String endereco = view.getjTextFieldAdministradorEndereco().getText();
                String CEP = view.getjTextFieldAdministradorCEP().getText();        
                String estado = view.getjComboBoxAdministradorEstado().getSelectedItem().toString();
                String numero = view.getjTextFieldAdministradorNumero().getText();
        
                Usuario usuarioAutenticar = new Usuario(email);
                Usuario usuarioMC = new Usuario(email, senha, nome, nomeSocial, DDD, celular, dia, mes, ano, endereco, CEP, estado, numero);
                try {
                    //verificar se existe no banco de dados
                    Connection conexao = new Conexao().getConnection();
                    UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
                    boolean existe = usuarioDao.existeNoBancoPorEmail(usuarioAutenticar);
                    // se existir mandar mensagem para Usuario
                    if(existe){
                        JOptionPane.showMessageDialog(view, "Email já cadastrado, utilize outro email!");
                    }else{
                        usuarioDao.insert(usuarioMC);
                        JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");
                    }
                } catch (SQLException ex) {
                Logger.getLogger(FormCadastroView.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Todos os campos com * asteriscos são obrigatórios.");
            }
        }
    
        public void deletarUsuarioNoBanco(){
            if ( !"".equals(view.getjTextFieldAdministradorEmail().getText()) 
            && !"".equals(view.getjPasswordAdministradorSenha().getText()))
            {
                String email = view.getjTextFieldAdministradorEmail().getText();
                String senha = view.getjPasswordAdministradorSenha().getText();
                Usuario usuarioAutenticar = new Usuario(email, senha);
                try {
                    //verificar se existe no banco de dados
                    Connection conexao = new Conexao().getConnection();
                    UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
                    boolean existe = usuarioDao.existeNoBancoPorEmailESenha(usuarioAutenticar);
                    // se existir mandar mensagem para Usuario
                    if(existe){
                     usuarioDao.deletePorEmailESenha(usuarioAutenticar);
                    JOptionPane.showMessageDialog(view, "Usuário deletado!");
                    }
                } catch (SQLException ex) {
                Logger.getLogger(FormCadastroView.class.getName()).log(Level.SEVERE, null, ex);
                }
        } else {
                JOptionPane.showMessageDialog(null, "Este email e senha estão inválidos");
            }
        }   
    
        public void limparDadosNoAdminstrador(){
            view.getjTextFieldAdministradorNumero().setText("");
            view.getjTextFieldAdministradorCelular().setText(""); 
            view.getjTextFieldAdministradorEmail().setText("");
            view.getjPasswordAdministradorSenha().setText(""); 
            view.getjTextFieldAdministradorNome().setText("");
            view.getjTextFieldAdministradorDDD().setText("");
            view.getjComboBoxAdministradorDia().setSelectedIndex(0);
            view.getjComboBoxAdministradorMes().setSelectedIndex(0);
            view.getjComboBoxAdministradorAno().setSelectedIndex(0);
            view.getjTextFieldAdministradorEndereco().setText(""); 
            view.getjTextFieldAdministradorCEP().setText("");
            view.getjComboBoxAdministradorEstado().setSelectedIndex(0);
        }
}
