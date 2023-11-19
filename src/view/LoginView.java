package view;

import controller.LoginEAdministradorController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends javax.swing.JFrame {
    private  final LoginEAdministradorController controller;

    public LoginView() {
        initComponents();
        controller = new LoginEAdministradorController(this);
        //controller = new AdministradorController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldLoginEmail = new javax.swing.JTextField();
        jToggleButtonLoginEntrar = new javax.swing.JToggleButton();
        jToggleButtonLoginCadastrar = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordFieldLoginSenha = new javax.swing.JPasswordField();
        jToggleButtonLoginAdministrador = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(218, 41, 28));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 450, 80));

        jTextFieldLoginEmail.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldLoginEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(218, 41, 28), 1, true));
        jTextFieldLoginEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoginEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldLoginEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 261, 30));

        jToggleButtonLoginEntrar.setBackground(new java.awt.Color(218, 41, 28));
        jToggleButtonLoginEntrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jToggleButtonLoginEntrar.setForeground(new java.awt.Color(255, 199, 44));
        jToggleButtonLoginEntrar.setText("ENTRAR");
        jToggleButtonLoginEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonLoginEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonLoginEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 540, 290, 40));

        jToggleButtonLoginCadastrar.setBackground(new java.awt.Color(218, 41, 28));
        jToggleButtonLoginCadastrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jToggleButtonLoginCadastrar.setForeground(new java.awt.Color(255, 199, 44));
        jToggleButtonLoginCadastrar.setText("CADASTRAR");
        jToggleButtonLoginCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonLoginCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonLoginCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 600, 290, 40));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(218, 41, 28));
        jLabel2.setText("EMAIL:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(218, 41, 28));
        jLabel5.setText("SENHA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, -1, -1));

        jPasswordFieldLoginSenha.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPasswordFieldLoginSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(218, 41, 28), 1, true));
        getContentPane().add(jPasswordFieldLoginSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 480, 260, 30));

        jToggleButtonLoginAdministrador.setBackground(new java.awt.Color(255, 199, 44));
        jToggleButtonLoginAdministrador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jToggleButtonLoginAdministrador.setForeground(new java.awt.Color(218, 41, 28));
        jToggleButtonLoginAdministrador.setText("ADMINISTRADOR");
        jToggleButtonLoginAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonLoginAdministradorActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonLoginAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 660, 290, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(218, 41, 28));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/LoginImagem.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1190, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonLoginEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonLoginEntrarActionPerformed
        try {
            controller.autenticarUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButtonLoginEntrarActionPerformed

    private void jToggleButtonLoginCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonLoginCadastrarActionPerformed
        FormCadastroView telaDeCadastro = new FormCadastroView();
        telaDeCadastro.setVisible(true);
    }//GEN-LAST:event_jToggleButtonLoginCadastrarActionPerformed

    private void jTextFieldLoginEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoginEmailActionPerformed

    private void jToggleButtonLoginAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonLoginAdministradorActionPerformed
        try {
            controller.autenticarAdministrador();
        } catch (SQLException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButtonLoginAdministradorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    public JPasswordField getjPasswordFieldLoginSenha() {
        return jPasswordFieldLoginSenha;
    }

    public void setjPasswordFieldLoginSenha(JPasswordField jPasswordFieldLoginSenha) {
        this.jPasswordFieldLoginSenha = jPasswordFieldLoginSenha;
    }

    public JTextField getjTextFieldLoginEmail() {
        return jTextFieldLoginEmail;
    }

    public void setjTextFieldLoginEmail(JTextField jTextFieldLoginEmail) {
        this.jTextFieldLoginEmail = jTextFieldLoginEmail;
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordFieldLoginSenha;
    private javax.swing.JTextField jTextFieldLoginEmail;
    private javax.swing.JToggleButton jToggleButtonLoginAdministrador;
    private javax.swing.JToggleButton jToggleButtonLoginCadastrar;
    private javax.swing.JToggleButton jToggleButtonLoginEntrar;
    // End of variables declaration//GEN-END:variables
}
