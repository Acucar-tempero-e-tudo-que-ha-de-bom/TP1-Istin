/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import istin.Loja;

public class TelaLoja extends javax.swing.JFrame {
    
    private Loja loja;
    
    public TelaLoja() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(36, 40, 47));
        loja = Loja.getInstance();   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btPublicar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lojaPanel = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        lblpreviaImagem = new javax.swing.JLabel();
        lblpreviaImagem1 = new javax.swing.JLabel();
        lblpreviaImagem2 = new javax.swing.JLabel();
        lblpreviaImagem3 = new javax.swing.JLabel();
        lblpreviaImagem4 = new javax.swing.JLabel();
        lblpreviaImagem5 = new javax.swing.JLabel();
        lblpreviaImagem6 = new javax.swing.JLabel();
        lblpreviaImagem7 = new javax.swing.JLabel();
        mbMenu = new javax.swing.JMenuBar();
        mPerfil = new javax.swing.JMenu();
        miInformaçoes = new javax.swing.JMenuItem();
        miSair = new javax.swing.JMenuItem();
        mBiblioteca = new javax.swing.JMenu();
        miHome = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Istin");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LogoIstinIcon32x32.png")).getImage());

        btPublicar.setBackground(new java.awt.Color(0, 0, 0));
        btPublicar.setForeground(new java.awt.Color(255, 255, 255));
        btPublicar.setText("Publicar");
        btPublicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPublicarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(36, 40, 47));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Loja", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lojaPanel.setBackground(new java.awt.Color(36, 40, 47));
        lojaPanel.setBorder(null);
        lojaPanel.setForeground(new java.awt.Color(255, 255, 255));
        lojaPanel.setToolTipText("");
        lojaPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        lojaPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(36, 40, 47));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(874, 409));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblpreviaImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoIstinIcon32x32.png"))); // NOI18N
        jPanel2.add(lblpreviaImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 117, 150));

        lblpreviaImagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoIstinIcon32x32.png"))); // NOI18N
        jPanel2.add(lblpreviaImagem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 234, 117, 150));

        lblpreviaImagem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoIstinIcon32x32.png"))); // NOI18N
        jPanel2.add(lblpreviaImagem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 25, 117, 150));

        lblpreviaImagem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoIstinIcon32x32.png"))); // NOI18N
        jPanel2.add(lblpreviaImagem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 25, 117, 150));

        lblpreviaImagem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoIstinIcon32x32.png"))); // NOI18N
        jPanel2.add(lblpreviaImagem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 234, 117, 150));

        lblpreviaImagem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoIstinIcon32x32.png"))); // NOI18N
        jPanel2.add(lblpreviaImagem5, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 234, 117, 150));

        lblpreviaImagem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoIstinIcon32x32.png"))); // NOI18N
        jPanel2.add(lblpreviaImagem6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 25, 117, 150));

        lblpreviaImagem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoIstinIcon32x32.png"))); // NOI18N
        jPanel2.add(lblpreviaImagem7, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 234, 117, 150));

        lojaPanel.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lojaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lojaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lojaPanel.getAccessibleContext().setAccessibleName("Loja");

        mbMenu.setBackground(new java.awt.Color(36, 40, 47));

        mPerfil.setText("Perfil");

        miInformaçoes.setText("Detalhes");
        miInformaçoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miInformaçoesActionPerformed(evt);
            }
        });
        mPerfil.add(miInformaçoes);

        miSair.setText("Sair");
        mPerfil.add(miSair);

        mbMenu.add(mPerfil);

        mBiblioteca.setText("Biblioteca");

        miHome.setText("Home");
        mBiblioteca.add(miHome);

        mbMenu.add(mBiblioteca);

        setJMenuBar(mbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btPublicar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPublicar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miInformaçoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miInformaçoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miInformaçoesActionPerformed

    private void btPublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPublicarActionPerformed
        
        new TelaCadastroJogo().setVisible(true);
        
    }//GEN-LAST:event_btPublicarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPublicar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblpreviaImagem;
    private javax.swing.JLabel lblpreviaImagem1;
    private javax.swing.JLabel lblpreviaImagem2;
    private javax.swing.JLabel lblpreviaImagem3;
    private javax.swing.JLabel lblpreviaImagem4;
    private javax.swing.JLabel lblpreviaImagem5;
    private javax.swing.JLabel lblpreviaImagem6;
    private javax.swing.JLabel lblpreviaImagem7;
    private javax.swing.JScrollPane lojaPanel;
    private javax.swing.JMenu mBiblioteca;
    private javax.swing.JMenu mPerfil;
    private javax.swing.JMenuBar mbMenu;
    private javax.swing.JMenuItem miHome;
    private javax.swing.JMenuItem miInformaçoes;
    private javax.swing.JMenuItem miSair;
    // End of variables declaration//GEN-END:variables
}
