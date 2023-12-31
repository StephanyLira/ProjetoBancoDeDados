/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AdministradorController;
import dao.TesteDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import view.util.LimitaCaracteres;


public class AdministradorView extends javax.swing.JFrame {
    private final  AdministradorController controller;
    private final TesteDAO dao;
 
    public AdministradorView() {
        initComponents();
        controller = new AdministradorController(this);
        dao = new TesteDAO(this);
        jTextFieldAdministradorEmail.setDocument(new LimitaCaracteres(100, LimitaCaracteres.TipoEntrada.EMAIL));
        jPasswordAdministradorSenha.setDocument(new LimitaCaracteres(15, LimitaCaracteres.TipoEntrada.EMAIL));
        jTextFieldAdministradorNome.setDocument(new LimitaCaracteres(60, LimitaCaracteres.TipoEntrada.NOME));
        jTextFieldAdministradorNomeSocial.setDocument(new LimitaCaracteres(60, LimitaCaracteres.TipoEntrada.NOME));
        jTextFieldAdministradorDDD.setDocument(new LimitaCaracteres(2, LimitaCaracteres.TipoEntrada.NUMEROINTEIRO));
        jTextFieldAdministradorCelular.setDocument(new LimitaCaracteres(9, LimitaCaracteres.TipoEntrada.NUMEROINTEIRO));
        jTextFieldAdministradorEndereco.setDocument(new LimitaCaracteres(60, LimitaCaracteres.TipoEntrada.NOME));
        jTextFieldAdministradorCEP.setDocument(new LimitaCaracteres(8, LimitaCaracteres.TipoEntrada.NUMEROINTEIRO));
        jTextFieldAdministradorNumero.setDocument(new LimitaCaracteres(10, LimitaCaracteres.TipoEntrada.NUMEROINTEIRO));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButtonInsert = new javax.swing.JButton();
        jTextFieldAdministradorNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAdministradorEmail = new javax.swing.JTextField();
        jPasswordAdministradorSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxAdministradorDia = new javax.swing.JComboBox();
        jComboBoxAdministradorMes = new javax.swing.JComboBox();
        jComboBoxAdministradorAno = new javax.swing.JComboBox();
        jTextFieldAdministradorEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldAdministradorCEP = new javax.swing.JTextField();
        jComboBoxAdministradorEstado = new javax.swing.JComboBox();
        jTextFieldAdministradorNumero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldAdministradorDDD = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldAdministradorCelular = new javax.swing.JTextField();
        jTextFieldAdministradorNomeSocial = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 46)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 199, 44));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BANCO DE DADOS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1250, -1));

        jButtonInsert.setBackground(new java.awt.Color(255, 199, 41));
        jButtonInsert.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonInsert.setForeground(new java.awt.Color(218, 41, 28));
        jButtonInsert.setText("INSERT");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, 230, 50));

        jTextFieldAdministradorNome.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldAdministradorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAdministradorNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAdministradorNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 450, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 199, 44));
        jLabel4.setText("*Nome:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 199, 44));
        jLabel2.setText("*Email:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, 30));

        jTextFieldAdministradorEmail.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(jTextFieldAdministradorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 450, 40));

        jPasswordAdministradorSenha.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPasswordAdministradorSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordAdministradorSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordAdministradorSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordAdministradorSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 450, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 199, 44));
        jLabel3.setText("*Senha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 90, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 199, 44));
        jLabel7.setText("*Data de Nascimento:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 230, 30));

        jComboBoxAdministradorDia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxAdministradorDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxAdministradorDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAdministradorDiaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxAdministradorDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 110, 40));

        jComboBoxAdministradorMes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxAdministradorMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        jComboBoxAdministradorMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAdministradorMesActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxAdministradorMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 120, 40));

        jComboBoxAdministradorAno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxAdministradorAno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));
        jComboBoxAdministradorAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAdministradorAnoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxAdministradorAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 110, 40));

        jTextFieldAdministradorEndereco.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(jTextFieldAdministradorEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 440, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 199, 44));
        jLabel8.setText("*Endereço:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 120, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 199, 44));
        jLabel12.setText("*CEP:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 80, 30));

        jTextFieldAdministradorCEP.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(jTextFieldAdministradorCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 440, 40));

        jComboBoxAdministradorEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxAdministradorEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        jComboBoxAdministradorEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAdministradorEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxAdministradorEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 130, 40));

        jTextFieldAdministradorNumero.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(jTextFieldAdministradorNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 190, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 199, 44));
        jLabel9.setText("*Número:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 100, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 199, 44));
        jLabel13.setText("*Estado:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 90, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 199, 44));
        jLabel10.setText("Todos os campos com * asteriscos são obrigatórios.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 480, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 199, 44));
        jLabel11.setText("*DDD:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 70, 30));

        jTextFieldAdministradorDDD.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldAdministradorDDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAdministradorDDDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAdministradorDDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 100, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 199, 44));
        jLabel14.setText("*Celular:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 200, 100, 30));

        jTextFieldAdministradorCelular.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(jTextFieldAdministradorCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 190, 190, 40));

        jTextFieldAdministradorNomeSocial.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldAdministradorNomeSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAdministradorNomeSocialActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldAdministradorNomeSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 430, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 199, 44));
        jLabel15.setText("Nome Social:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 170, 30));

        jButtonDelete.setBackground(new java.awt.Color(255, 199, 41));
        jButtonDelete.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(218, 41, 28));
        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 690, 230, 50));

        jButtonLimpar.setBackground(new java.awt.Color(255, 199, 41));
        jButtonLimpar.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButtonLimpar.setForeground(new java.awt.Color(218, 41, 28));
        jButtonLimpar.setText("LIMPAR");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 760, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/CadastrarImagem.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1249, -1));

        jMenu2.setText("Teste do USuario DAO");

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenuItem1.setText("Testa Usuario DAO");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {  
            dao.testarUsuarioNoBanco();
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
    controller.salvaUsuarioNoBanco();
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jTextFieldAdministradorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAdministradorNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAdministradorNomeActionPerformed

    private void jPasswordAdministradorSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordAdministradorSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordAdministradorSenhaActionPerformed

    private void jComboBoxAdministradorDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAdministradorDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAdministradorDiaActionPerformed

    private void jComboBoxAdministradorMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAdministradorMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAdministradorMesActionPerformed

    private void jComboBoxAdministradorAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAdministradorAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAdministradorAnoActionPerformed

    private void jComboBoxAdministradorEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAdministradorEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAdministradorEstadoActionPerformed

    private void jTextFieldAdministradorDDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAdministradorDDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAdministradorDDDActionPerformed

    private void jTextFieldAdministradorNomeSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAdministradorNomeSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAdministradorNomeSocialActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        controller.deletarUsuarioNoBanco();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        controller.limparDadosNoAdminstrador();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorView().setVisible(true);
            }
        });
    }

    public JComboBox getjComboBoxAdministradorAno() {
        return jComboBoxAdministradorAno;
    }

    public void setjComboBoxAdministradorAno(JComboBox jComboBoxAdministradorAno) {
        this.jComboBoxAdministradorAno = jComboBoxAdministradorAno;
    }

    public JComboBox getjComboBoxAdministradorDia() {
        return jComboBoxAdministradorDia;
    }

    public void setjComboBoxAdministradorDia(JComboBox jComboBoxAdministradorDia) {
        this.jComboBoxAdministradorDia = jComboBoxAdministradorDia;
    }

    public JComboBox getjComboBoxAdministradorEstado() {
        return jComboBoxAdministradorEstado;
    }

    public void setjComboBoxAdministradorEstado(JComboBox jComboBoxAdministradorEstado) {
        this.jComboBoxAdministradorEstado = jComboBoxAdministradorEstado;
    }

    public JComboBox getjComboBoxAdministradorMes() {
        return jComboBoxAdministradorMes;
    }

    public void setjComboBoxAdministradorMes(JComboBox jComboBoxAdministradorMes) {
        this.jComboBoxAdministradorMes = jComboBoxAdministradorMes;
    }

    public JPasswordField getjPasswordAdministradorSenha() {
        return jPasswordAdministradorSenha;
    }

    public void setjPasswordAdministradorSenha(JPasswordField jPasswordAdministradorSenha) {
        this.jPasswordAdministradorSenha = jPasswordAdministradorSenha;
    }

    public JTextField getjTextFieldAdministradorCEP() {
        return jTextFieldAdministradorCEP;
    }

    public void setjTextFieldAdministradorCEP(JTextField jTextFieldAdministradorCEP) {
        this.jTextFieldAdministradorCEP = jTextFieldAdministradorCEP;
    }

    public JTextField getjTextFieldAdministradorCelular() {
        return jTextFieldAdministradorCelular;
    }

    public void setjTextFieldAdministradorCelular(JTextField jTextFieldAdministradorCelular) {
        this.jTextFieldAdministradorCelular = jTextFieldAdministradorCelular;
    }

    public JTextField getjTextFieldAdministradorDDD() {
        return jTextFieldAdministradorDDD;
    }

    public void setjTextFieldAdministradorDDD(JTextField jTextFieldAdministradorDDD) {
        this.jTextFieldAdministradorDDD = jTextFieldAdministradorDDD;
    }

    public JTextField getjTextFieldAdministradorEmail() {
        return jTextFieldAdministradorEmail;
    }

    public void setjTextFieldAdministradorEmail(JTextField jTextFieldAdministradorEmail) {
        this.jTextFieldAdministradorEmail = jTextFieldAdministradorEmail;
    }

    public JTextField getjTextFieldAdministradorEndereco() {
        return jTextFieldAdministradorEndereco;
    }

    public void setjTextFieldAdministradorEndereco(JTextField jTextFieldAdministradorEndereco) {
        this.jTextFieldAdministradorEndereco = jTextFieldAdministradorEndereco;
    }

    public JTextField getjTextFieldAdministradorNome() {
        return jTextFieldAdministradorNome;
    }

    public void setjTextFieldAdministradorNome(JTextField jTextFieldAdministradorNome) {
        this.jTextFieldAdministradorNome = jTextFieldAdministradorNome;
    }

    public JTextField getjTextFieldAdministradorNomeSocial() {
        return jTextFieldAdministradorNomeSocial;
    }

    public void setjTextFieldAdministradorNomeSocial(JTextField jTextFieldAdministradorNomeSocial) {
        this.jTextFieldAdministradorNomeSocial = jTextFieldAdministradorNomeSocial;
    }

    public JTextField getjTextFieldAdministradorNumero() {
        return jTextFieldAdministradorNumero;
    }

    public void setjTextFieldAdministradorNumero(JTextField jTextFieldAdministradorNumero) {
        this.jTextFieldAdministradorNumero = jTextFieldAdministradorNumero;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JComboBox jComboBoxAdministradorAno;
    private javax.swing.JComboBox jComboBoxAdministradorDia;
    private javax.swing.JComboBox jComboBoxAdministradorEstado;
    private javax.swing.JComboBox jComboBoxAdministradorMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPasswordField jPasswordAdministradorSenha;
    private javax.swing.JTextField jTextFieldAdministradorCEP;
    private javax.swing.JTextField jTextFieldAdministradorCelular;
    private javax.swing.JTextField jTextFieldAdministradorDDD;
    private javax.swing.JTextField jTextFieldAdministradorEmail;
    private javax.swing.JTextField jTextFieldAdministradorEndereco;
    private javax.swing.JTextField jTextFieldAdministradorNome;
    private javax.swing.JTextField jTextFieldAdministradorNomeSocial;
    private javax.swing.JTextField jTextFieldAdministradorNumero;
    // End of variables declaration//GEN-END:variables
   
}
