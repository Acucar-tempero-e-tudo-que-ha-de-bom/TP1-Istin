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

        pnlPainel = new javax.swing.JPanel();
        pnlJogo0 = new javax.swing.JPanel();
        pnlJogo1 = new javax.swing.JPanel();
        pnlJogo2 = new javax.swing.JPanel();
        pnlJogo3 = new javax.swing.JPanel();
        pnlJogo4 = new javax.swing.JPanel();
        pnlJogo5 = new javax.swing.JPanel();
        pnlJogo6 = new javax.swing.JPanel();
        pnlJogo7 = new javax.swing.JPanel();
        pnlJogo8 = new javax.swing.JPanel();
        pnlJogo9 = new javax.swing.JPanel();
        pnlJogo10 = new javax.swing.JPanel();
        pnlJogo11 = new javax.swing.JPanel();
        btPublicar = new javax.swing.JButton();
        mbMenu = new javax.swing.JMenuBar();
        mPerfil = new javax.swing.JMenu();
        miInformaçoes = new javax.swing.JMenuItem();
        miSair = new javax.swing.JMenuItem();
        mBiblioteca = new javax.swing.JMenu();
        miHome = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Istin");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LogoIstinIcon32x32.png")).getImage());

        pnlPainel.setBackground(new java.awt.Color(36, 40, 47));
        pnlPainel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Loja", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlPainel.setForeground(new java.awt.Color(255, 255, 255));

        pnlJogo0.setBackground(new java.awt.Color(36, 40, 47));
        pnlJogo0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlJogo0Layout = new javax.swing.GroupLayout(pnlJogo0);
        pnlJogo0.setLayout(pnlJogo0Layout);
        pnlJogo0Layout.setHorizontalGroup(
            pnlJogo0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        pnlJogo0Layout.setVerticalGroup(
            pnlJogo0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        pnlJogo1.setBackground(new java.awt.Color(36, 40, 47));
        pnlJogo1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlJogo1Layout = new javax.swing.GroupLayout(pnlJogo1);
        pnlJogo1.setLayout(pnlJogo1Layout);
        pnlJogo1Layout.setHorizontalGroup(
            pnlJogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        pnlJogo1Layout.setVerticalGroup(
            pnlJogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        pnlJogo2.setBackground(new java.awt.Color(36, 40, 47));
        pnlJogo2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlJogo2Layout = new javax.swing.GroupLayout(pnlJogo2);
        pnlJogo2.setLayout(pnlJogo2Layout);
        pnlJogo2Layout.setHorizontalGroup(
            pnlJogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        pnlJogo2Layout.setVerticalGroup(
            pnlJogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        pnlJogo3.setBackground(new java.awt.Color(36, 40, 47));
        pnlJogo3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlJogo3Layout = new javax.swing.GroupLayout(pnlJogo3);
        pnlJogo3.setLayout(pnlJogo3Layout);
        pnlJogo3Layout.setHorizontalGroup(
            pnlJogo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        pnlJogo3Layout.setVerticalGroup(
            pnlJogo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        pnlJogo4.setBackground(new java.awt.Color(36, 40, 47));
        pnlJogo4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlJogo4Layout = new javax.swing.GroupLayout(pnlJogo4);
        pnlJogo4.setLayout(pnlJogo4Layout);
        pnlJogo4Layout.setHorizontalGroup(
            pnlJogo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        pnlJogo4Layout.setVerticalGroup(
            pnlJogo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        pnlJogo5.setBackground(new java.awt.Color(36, 40, 47));
        pnlJogo5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlJogo5Layout = new javax.swing.GroupLayout(pnlJogo5);
        pnlJogo5.setLayout(pnlJogo5Layout);
        pnlJogo5Layout.setHorizontalGroup(
            pnlJogo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        pnlJogo5Layout.setVerticalGroup(
            pnlJogo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        pnlJogo6.setBackground(new java.awt.Color(36, 40, 47));
        pnlJogo6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlJogo6Layout = new javax.swing.GroupLayout(pnlJogo6);
        pnlJogo6.setLayout(pnlJogo6Layout);
        pnlJogo6Layout.setHorizontalGroup(
            pnlJogo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        pnlJogo6Layout.setVerticalGroup(
            pnlJogo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        pnlJogo7.setBackground(new java.awt.Color(36, 40, 47));
        pnlJogo7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlJogo7Layout = new javax.swing.GroupLayout(pnlJogo7);
        pnlJogo7.setLayout(pnlJogo7Layout);
        pnlJogo7Layout.setHorizontalGroup(
            pnlJogo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        pnlJogo7Layout.setVerticalGroup(
            pnlJogo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        pnlJogo8.setBackground(new java.awt.Color(36, 40, 47));
        pnlJogo8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlJogo8Layout = new javax.swing.GroupLayout(pnlJogo8);
        pnlJogo8.setLayout(pnlJogo8Layout);
        pnlJogo8Layout.setHorizontalGroup(
            pnlJogo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        pnlJogo8Layout.setVerticalGroup(
            pnlJogo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        pnlJogo9.setBackground(new java.awt.Color(36, 40, 47));
        pnlJogo9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlJogo9Layout = new javax.swing.GroupLayout(pnlJogo9);
        pnlJogo9.setLayout(pnlJogo9Layout);
        pnlJogo9Layout.setHorizontalGroup(
            pnlJogo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        pnlJogo9Layout.setVerticalGroup(
            pnlJogo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        pnlJogo10.setBackground(new java.awt.Color(36, 40, 47));
        pnlJogo10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlJogo10Layout = new javax.swing.GroupLayout(pnlJogo10);
        pnlJogo10.setLayout(pnlJogo10Layout);
        pnlJogo10Layout.setHorizontalGroup(
            pnlJogo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        pnlJogo10Layout.setVerticalGroup(
            pnlJogo10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        pnlJogo11.setBackground(new java.awt.Color(36, 40, 47));
        pnlJogo11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlJogo11Layout = new javax.swing.GroupLayout(pnlJogo11);
        pnlJogo11.setLayout(pnlJogo11Layout);
        pnlJogo11Layout.setHorizontalGroup(
            pnlJogo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        pnlJogo11Layout.setVerticalGroup(
            pnlJogo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlPainelLayout = new javax.swing.GroupLayout(pnlPainel);
        pnlPainel.setLayout(pnlPainelLayout);
        pnlPainelLayout.setHorizontalGroup(
            pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPainelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPainelLayout.createSequentialGroup()
                        .addComponent(pnlJogo0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlJogo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlJogo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlJogo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlJogo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlJogo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPainelLayout.createSequentialGroup()
                        .addComponent(pnlJogo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlJogo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlJogo8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlJogo9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlJogo10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlJogo11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        pnlPainelLayout.setVerticalGroup(
            pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPainelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlJogo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlJogo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlJogo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlJogo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlJogo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlJogo0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlJogo11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlJogo10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlJogo9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlJogo8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlJogo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlJogo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        btPublicar.setBackground(new java.awt.Color(0, 0, 0));
        btPublicar.setForeground(new java.awt.Color(255, 255, 255));
        btPublicar.setText("Publicar");
        btPublicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPublicarActionPerformed(evt);
            }
        });

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
            .addComponent(pnlPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btPublicar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPublicar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
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
    private javax.swing.JMenu mBiblioteca;
    private javax.swing.JMenu mPerfil;
    private javax.swing.JMenuBar mbMenu;
    private javax.swing.JMenuItem miHome;
    private javax.swing.JMenuItem miInformaçoes;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JPanel pnlJogo0;
    private javax.swing.JPanel pnlJogo1;
    private javax.swing.JPanel pnlJogo10;
    private javax.swing.JPanel pnlJogo11;
    private javax.swing.JPanel pnlJogo2;
    private javax.swing.JPanel pnlJogo3;
    private javax.swing.JPanel pnlJogo4;
    private javax.swing.JPanel pnlJogo5;
    private javax.swing.JPanel pnlJogo6;
    private javax.swing.JPanel pnlJogo7;
    private javax.swing.JPanel pnlJogo8;
    private javax.swing.JPanel pnlJogo9;
    private javax.swing.JPanel pnlPainel;
    // End of variables declaration//GEN-END:variables
}
