/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        int DDD = Integer.parseInt(view.getjTextFieldCadastrarDDD().getText());
        int celular = Integer.parseInt(view.getjTextFieldCadastarCelular().getText());
        int dia = Integer.parseInt(view.getjComboBoxCadastrarDia().getSelectedItem().toString());
        String mes = view.getjComboBoxCadastrarDia().getSelectedItem().toString();
        int ano = Integer.parseInt(view.getjComboBoxCadastrarDia().getSelectedItem().toString());
        String endereco = view.getjTextFieldCadastrarEndereco().getText();
        int CEP = Integer.parseInt(view.getjComboBoxCadastrarDia().getSelectedItem().toString());
        String estado = view.getjComboBoxCadastrarEstado().getToolTipText();
        int numero = Integer.parseInt(view.getjComboBoxCadastrarDia().getSelectedItem().toString());
        
        //Usuario usuarioXandi = new Usuario("xandi", "123456");
       Usuario usuarioStephany = new Usuario(email, senha, nome, nomeSocial, DDD, celular, dia, mes, ano, endereco, CEP, estado, numero);
        try {
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
            usuarioDao.insert(usuarioStephany);
            
            JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
