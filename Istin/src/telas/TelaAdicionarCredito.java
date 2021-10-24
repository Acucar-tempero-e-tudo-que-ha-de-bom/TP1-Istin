package telas;

import istin.Login;
import istin.Cliente;
import javax.swing.JOptionPane;

public class TelaAdicionarCredito extends javax.swing.JFrame {

    private Cliente cliente;
    private Login login;
    
    /**
     * Construtor da TelaLogin
     */
    public TelaAdicionarCredito() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(36, 40, 47));
        
        login = Login.getInstance();
        cliente = (Cliente) login.getUsuarioLogado();
        
        lblSaldo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblSaldo.setForeground(new java.awt.Color(255, 255, 255));
        lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaldo.setText("Saldo: R$ " + cliente.getSaldo());
        txtValor.requestFocus();
    }
    
    private void adicionar() {
        /* Adiciona crédito no saldo do cliente */
        if (txtValor.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Preencha o campo com o valor a ser inserido",
                                           "Valor não inserido", JOptionPane.WARNING_MESSAGE);
        else {
            
            try {
                /* Estrutura de tratamento de erro caso o usuário digite um valor
                inválido como por exemplo contendo valores não numéricos ou negativos */
                float valor = Float.parseFloat(txtValor.getText());
                
                if (valor <= 0f)
                    throw new NumberFormatException();
                
                cliente.setSaldo(cliente.getSaldo() + valor);
                txtValor.setText("");
                lblSaldo.setText("Saldo: R$ " + String.format("%.2f", cliente.getSaldo()));
                
                JOptionPane.showMessageDialog(null, "Crédito adicionado com sucesso!","Crédito adicionado",
                                                                            JOptionPane.INFORMATION_MESSAGE);
                
                login.salvarJson();
                
                dispose();
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Insira um valor válido", "Erro", JOptionPane.ERROR_MESSAGE);
                txtValor.setText("");
                txtValor.requestFocus();
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSaldo = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar crédito");
        setBackground(new java.awt.Color(36, 40, 47));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoIstinIcon32x32.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSaldo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblSaldo.setForeground(new java.awt.Color(255, 255, 255));
        lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaldo.setText("Saldo: R$ 100,00");
        getContentPane().add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 15, 468, 146));

        txtValor.setColumns(7);
        txtValor.setForeground(new java.awt.Color(0, 0, 0));
        txtValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor.setToolTipText("");
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 167, -1, -1));

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdicionarMouseClicked(evt);
            }
        });
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 209, 91, -1));

        btnVoltar.setBackground(new java.awt.Color(36, 40, 47));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta-esquerda.png"))); // NOI18N
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarMouseClicked
        adicionar();
    }//GEN-LAST:event_btnAdicionarMouseClicked

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        adicionar();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        
    }//GEN-LAST:event_txtValorActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdicionarCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdicionarCredito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
