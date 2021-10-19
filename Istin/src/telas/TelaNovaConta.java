/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import istin.Autor;
import istin.Login;
import istin.Cliente;
import istin.Usuario;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author anasofia
 */
public class TelaNovaConta extends javax.swing.JFrame {

    private final Login login;
    private byte[] bytesArquivo;
    
    public TelaNovaConta() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(36, 40, 47));
        txtEmail.requestFocus(true);
        login = Login.getInstance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        btCriar = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        lbUsername = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        rbtCliente = new javax.swing.JRadioButton();
        rbtAutor = new javax.swing.JRadioButton();
        lblFotoPerfil = new javax.swing.JLabel();
        btnAddFoto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btCriar.setBackground(new java.awt.Color(36, 40, 47));
        btCriar.setForeground(new java.awt.Color(255, 255, 255));
        btCriar.setText("Criar Conta");
        btCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarActionPerformed(evt);
            }
        });

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lbUsername.setForeground(new java.awt.Color(255, 255, 255));
        lbUsername.setText("Nome de usuário");

        lbEmail.setForeground(new java.awt.Color(255, 255, 255));
        lbEmail.setText("Email");

        lbSenha.setForeground(new java.awt.Color(255, 255, 255));
        lbSenha.setText("Senha");

        btVoltar.setBackground(new java.awt.Color(36, 40, 47));
        btVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta-esquerda.png"))); // NOI18N
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        buttonGroup.add(rbtCliente);
        rbtCliente.setForeground(new java.awt.Color(255, 255, 255));
        rbtCliente.setText("Cliente");
        rbtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtClienteActionPerformed(evt);
            }
        });

        buttonGroup.add(rbtAutor);
        rbtAutor.setForeground(new java.awt.Color(255, 255, 255));
        rbtAutor.setText("Autor");

        btnAddFoto.setText("mudar foto");
        btnAddFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(lbEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCriar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbtAutor)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbUsername)
                                    .addComponent(lbSenha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddFoto))))
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btVoltar)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbUsername)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSenha)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblFotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddFoto)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtAutor)
                        .addComponent(rbtCliente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btCriar)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarActionPerformed
        
        String nome = txtUsername.getText();
        String email = txtEmail.getText();
        String senha = txtSenha.getText();
        lblFotoPerfil.getIcon();
        
        if(nome.equals("") || email.equals("") || senha.equals("")) {
            txtUsername.setText("");
            txtEmail.setText("");
            txtSenha.setText("");
            txtUsername.requestFocus();
            
            JOptionPane.showMessageDialog(null, "Todos os campos de cadastro devem estar preenchidos");
            
        } else if(!rbtAutor.isSelected() && !rbtCliente.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione o tipo de conta");
        } else if(login.existeContaNome(nome)) {
            JOptionPane.showMessageDialog(null, "Já existe uma conta com esse nome de usuário");
            txtUsername.setText("");
            txtUsername.requestFocus();
        }  else if(login.existeContaEmail(email)) {
            JOptionPane.showMessageDialog(null, "Já existe uma conta com esse email");
            txtEmail.setText("");
            txtEmail.requestFocus();
        } else {
            
            Usuario novoUsuario = rbtCliente.isSelected() ? new Cliente(0.0f, nome, email, senha, bytesArquivo) : new Autor(nome, email, senha, bytesArquivo);
            login.criaNovaConta(novoUsuario);
            
            JOptionPane.showMessageDialog(null, "Conta criada com sucesso");
            
            this.setVisible(false);
        }
    }//GEN-LAST:event_btCriarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        
        this.setVisible(false);
        
    }//GEN-LAST:event_btVoltarActionPerformed

    private void rbtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtClienteActionPerformed

    private void btnAddFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFotoActionPerformed
        JFileChooser inserirArquivo = new JFileChooser();
        inserirArquivo.setAcceptAllFileFilterUsed(false);
        inserirArquivo.setFileFilter(new FileNameExtensionFilter("Arquivos de imagem", "png", "jpg", "jpeg"));
        int resultado = inserirArquivo.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File arquivoSelecionado = inserirArquivo.getSelectedFile();
            try {
                bytesArquivo = Files.readAllBytes(arquivoSelecionado.toPath());

                ImageIcon imageIcon = new ImageIcon(bytesArquivo);
                Image image = imageIcon.getImage();
                Image newimg = image.getScaledInstance(99, 99, Image.SCALE_SMOOTH);

                lblFotoPerfil.setIcon(new ImageIcon(newimg));
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível ler o arquivo selecionado");
            }
        }
    }//GEN-LAST:event_btnAddFotoActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(TelaNovaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNovaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNovaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNovaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaNovaConta().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCriar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton btnAddFoto;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lblFotoPerfil;
    private javax.swing.JRadioButton rbtAutor;
    private javax.swing.JRadioButton rbtCliente;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
