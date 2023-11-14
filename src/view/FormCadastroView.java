/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.FormCadastroController;
import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.Usuario;
import view.util.LimitaCaracteres;

/**
 *
 * @author steph
 */
public class FormCadastroView extends javax.swing.JFrame {
    private final FormCadastroController controller;

    public FormCadastroView() {
        initComponents();
        controller = new FormCadastroController(this);
        jTextFieldCadastrarEmail.setDocument(new LimitaCaracteres(345, LimitaCaracteres.TipoEntrada.EMAIL));
        jPasswordSenhaCadastrar.setDocument(new LimitaCaracteres(15, LimitaCaracteres.TipoEntrada.EMAIL));
        jTextFieldCadastrarNome.setDocument(new LimitaCaracteres(60, LimitaCaracteres.TipoEntrada.NOME));
        jTextFieldCadastrarNomeSocial.setDocument(new LimitaCaracteres(60, LimitaCaracteres.TipoEntrada.NOME));
        jTextFieldCadastrarDDD.setDocument(new LimitaCaracteres(2, LimitaCaracteres.TipoEntrada.NUMEROINTEIRO));
        jTextFieldCadastarCelular.setDocument(new LimitaCaracteres(9, LimitaCaracteres.TipoEntrada.NUMEROINTEIRO));
        jTextFieldCadastrarEndereco.setDocument(new LimitaCaracteres(60, LimitaCaracteres.TipoEntrada.NOME));
        jTextFieldCadastarCEP.setDocument(new LimitaCaracteres(8, LimitaCaracteres.TipoEntrada.NUMEROINTEIRO));
        jTextFieldCadastarNumero.setDocument(new LimitaCaracteres(10, LimitaCaracteres.TipoEntrada.NUMEROINTEIRO));
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jTextFieldCadastrarNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCadastrarEmail = new javax.swing.JTextField();
        jPasswordSenhaCadastrar = new javax.swing.JPasswordField();
        jButtonSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCadastarCelular = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCadastrarEndereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCadastarNumero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxCadastarAno = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCadastrarNomeSocial = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCadastrarDDD = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxCadastrarEstado = new javax.swing.JComboBox();
        jComboBoxCadastrarDia = new javax.swing.JComboBox();
        jComboBoxCadastrarMes = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldCadastarCEP = new javax.swing.JTextField();
        imagemCadastro = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCadastrarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadastrarNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCadastrarNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 450, 40));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 199, 44));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CADASTRAR-SE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 1210, -1));
        getContentPane().add(jTextFieldCadastrarEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 450, 40));

        jPasswordSenhaCadastrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordSenhaCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordSenhaCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordSenhaCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 450, 40));

        jButtonSalvar.setBackground(new java.awt.Color(255, 199, 41));
        jButtonSalvar.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(218, 41, 28));
        jButtonSalvar.setText("SALVAR");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 710, 370, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 199, 44));
        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 70, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 199, 44));
        jLabel1.setText("Email:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 70, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 199, 44));
        jLabel4.setText("Nome:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 70, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 199, 44));
        jLabel3.setText("Número:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, 100, 30));
        getContentPane().add(jTextFieldCadastarCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 220, 240, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 199, 44));
        jLabel6.setText("Data de Nascimento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 220, 30));
        getContentPane().add(jTextFieldCadastrarEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 440, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 199, 44));
        jLabel7.setText("DDD:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 60, 30));
        getContentPane().add(jTextFieldCadastarNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 610, 170, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 199, 44));
        jLabel8.setText("Endereço:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 110, 30));

        jComboBoxCadastarAno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECIONE>", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900", " " }));
        jComboBoxCadastarAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCadastarAnoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCadastarAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 100, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 199, 44));
        jLabel9.setText("Estado:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, 80, 30));

        jTextFieldCadastrarNomeSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadastrarNomeSocialActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCadastrarNomeSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 420, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 199, 44));
        jLabel10.setText("Nome Social:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 170, 30));

        jTextFieldCadastrarDDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadastrarDDDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCadastrarDDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 100, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 199, 44));
        jLabel11.setText("Celular:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 90, 30));

        jComboBoxCadastrarEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECIONE>", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        jComboBoxCadastrarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCadastrarEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCadastrarEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 620, 120, 30));

        jComboBoxCadastrarDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECIONE>", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxCadastrarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCadastrarDiaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCadastrarDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 100, 40));

        jComboBoxCadastrarMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<SELECIONE>", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        jComboBoxCadastrarMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCadastrarMesActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCadastrarMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 120, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 199, 44));
        jLabel12.setText("CEP:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 80, 30));
        getContentPane().add(jTextFieldCadastarCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 440, 40));

        imagemCadastro.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        imagemCadastro.setForeground(new java.awt.Color(255, 199, 44));
        imagemCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/CadastrarImagem.jpg"))); // NOI18N
        imagemCadastro.setText("Amora");
        getContentPane().add(imagemCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 1260, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordSenhaCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordSenhaCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordSenhaCadastrarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        controller.salvaUsuario();
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jComboBoxCadastarAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCadastarAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCadastarAnoActionPerformed

    private void jTextFieldCadastrarDDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadastrarDDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCadastrarDDDActionPerformed

    private void jComboBoxCadastrarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCadastrarEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCadastrarEstadoActionPerformed

    private void jComboBoxCadastrarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCadastrarDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCadastrarDiaActionPerformed

    private void jComboBoxCadastrarMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCadastrarMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCadastrarMesActionPerformed

    private void jTextFieldCadastrarNomeSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadastrarNomeSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCadastrarNomeSocialActionPerformed

    private void jTextFieldCadastrarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadastrarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCadastrarNomeActionPerformed

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
            java.util.logging.Logger.getLogger(FormCadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroView().setVisible(true);
            }
        });
    }

    public JButton getjButtonSalvar() {
        return jButtonSalvar;
    }

    public void setjButtonSalvar(JButton jButtonSalvar) {
        this.jButtonSalvar = jButtonSalvar;
    }

    public JComboBox getjComboBoxCadastarAno() {
        return jComboBoxCadastarAno;
    }

    public void setjComboBoxCadastarAno(JComboBox jComboBoxCadastarAno) {
        this.jComboBoxCadastarAno = jComboBoxCadastarAno;
    }

    public JComboBox getjComboBoxCadastrarDia() {
        return jComboBoxCadastrarDia;
    }

    public void setjComboBoxCadastrarDia(JComboBox jComboBoxCadastrarDia) {
        this.jComboBoxCadastrarDia = jComboBoxCadastrarDia;
    }

    public JComboBox getjComboBoxCadastrarEstado() {
        return jComboBoxCadastrarEstado;
    }

    public void setjComboBoxCadastrarEstado(JComboBox jComboBoxCadastrarEstado) {
        this.jComboBoxCadastrarEstado = jComboBoxCadastrarEstado;
    }

    public JComboBox getjComboBoxCadastrarMes() {
        return jComboBoxCadastrarMes;
    }

    public void setjComboBoxCadastrarMes(JComboBox jComboBoxCadastrarMes) {
        this.jComboBoxCadastrarMes = jComboBoxCadastrarMes;
    }

    public JMenuItem getjMenuItem1() {
        return jMenuItem1;
    }

    public void setjMenuItem1(JMenuItem jMenuItem1) {
        this.jMenuItem1 = jMenuItem1;
    }

    public JPasswordField getjPasswordSenhaCadastrar() {
        return jPasswordSenhaCadastrar;
    }

    public void setjPasswordSenhaCadastrar(JPasswordField jPasswordSenhaCadastrar) {
        this.jPasswordSenhaCadastrar = jPasswordSenhaCadastrar;
    }

    public JTextField getjTextFieldCadastarCEP() {
        return jTextFieldCadastarCEP;
    }

    public void setjTextFieldCadastarCEP(JTextField jTextFieldCadastarCEP) {
        this.jTextFieldCadastarCEP = jTextFieldCadastarCEP;
    }

    public JTextField getjTextFieldCadastarCelular() {
        return jTextFieldCadastarCelular;
    }

    public void setjTextFieldCadastarCelular(JTextField jTextFieldCadastarCelular) {
        this.jTextFieldCadastarCelular = jTextFieldCadastarCelular;
    }

    public JTextField getjTextFieldCadastarNumero() {
        return jTextFieldCadastarNumero;
    }

    public void setjTextFieldCadastarNumero(JTextField jTextFieldCadastarNumero) {
        this.jTextFieldCadastarNumero = jTextFieldCadastarNumero;
    }

    public JTextField getjTextFieldCadastrarDDD() {
        return jTextFieldCadastrarDDD;
    }

    public void setjTextFieldCadastrarDDD(JTextField jTextFieldCadastrarDDD) {
        this.jTextFieldCadastrarDDD = jTextFieldCadastrarDDD;
    }

    public JTextField getjTextFieldCadastrarEmail() {
        return jTextFieldCadastrarEmail;
    }

    public void setjTextFieldCadastrarEmail(JTextField jTextFieldCadastrarEmail) {
        this.jTextFieldCadastrarEmail = jTextFieldCadastrarEmail;
    }

    public JTextField getjTextFieldCadastrarEndereco() {
        return jTextFieldCadastrarEndereco;
    }

    public void setjTextFieldCadastrarEndereco(JTextField jTextFieldCadastrarEndereco) {
        this.jTextFieldCadastrarEndereco = jTextFieldCadastrarEndereco;
    }

    public JTextField getjTextFieldCadastrarNome() {
        return jTextFieldCadastrarNome;
    }

    public void setjTextFieldCadastrarNome(JTextField jTextFieldCadastrarNome) {
        this.jTextFieldCadastrarNome = jTextFieldCadastrarNome;
    }

    public JTextField getjTextFieldCadastrarNomeSocial() {
        return jTextFieldCadastrarNomeSocial;
    }

    public void setjTextFieldCadastrarNomeSocial(JTextField jTextFieldCadastrarNomeSocial) {
        this.jTextFieldCadastrarNomeSocial = jTextFieldCadastrarNomeSocial;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagemCadastro;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxCadastarAno;
    private javax.swing.JComboBox jComboBoxCadastrarDia;
    private javax.swing.JComboBox jComboBoxCadastrarEstado;
    private javax.swing.JComboBox jComboBoxCadastrarMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPasswordField jPasswordSenhaCadastrar;
    private javax.swing.JTextField jTextFieldCadastarCEP;
    private javax.swing.JTextField jTextFieldCadastarCelular;
    private javax.swing.JTextField jTextFieldCadastarNumero;
    private javax.swing.JTextField jTextFieldCadastrarDDD;
    private javax.swing.JTextField jTextFieldCadastrarEmail;
    private javax.swing.JTextField jTextFieldCadastrarEndereco;
    private javax.swing.JTextField jTextFieldCadastrarNome;
    private javax.swing.JTextField jTextFieldCadastrarNomeSocial;
    // End of variables declaration//GEN-END:variables
}
