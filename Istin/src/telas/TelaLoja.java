/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import istin.Autor;
import istin.Jogo;
import istin.Login;
import istin.Loja;
import java.awt.Cursor;
import java.awt.Dimension;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TelaLoja extends javax.swing.JFrame {
    
    private final Loja loja;
    
    public TelaLoja() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(36, 40, 47));
        loja = Loja.getInstance();
        atualizarLoja();
        
        // Se usuario logado for um autor, mostra o botão de publicar
        if (Login.getInstance().getUsuarioLogado() instanceof Autor) {
            btPublicar.setVisible(true);
        } else {
            btPublicar.setVisible(false);
        }                                                                                                                                                                                                                                                    
    }
    
    public final void atualizarLoja() {
        painelLoja.removeAll();
        
        List<Jogo> jogos = loja.getJogos().parallelStream().collect(Collectors.toList());
        for (int i = 0; i < jogos.size(); i++) {          
            Jogo jogo = jogos.get(i);
            
            int x = 25 + (167 * (i / 2));
            int y = 25 + (209 * (i % 2));
            
            JLabel labelJogo = new JLabel();

            labelJogo.setIcon(new ImageIcon(jogo.getImagem()));
            
            TelaLoja self = this;
            labelJogo.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    new TelaJogo(jogo, self, new TelaBiblioteca()).setVisible(true);
                }
            });
            labelJogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            
            painelLoja.add(labelJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, 117, 150));
            
            if (i == loja.getJogos().size() - 1) {
                painelLoja.setPreferredSize(new Dimension(x + 132, 409));
            }
            
            painelLoja.revalidate();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btPublicar = new javax.swing.JButton();
        panelPai = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        painelLoja = new javax.swing.JPanel();
        mbMenu = new javax.swing.JMenuBar();
        mPerfil = new javax.swing.JMenu();
        miInformaçoes = new javax.swing.JMenuItem();
        miSair = new javax.swing.JMenuItem();
        mMenu = new javax.swing.JMenu();
        miBiblioteca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Istin");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoIstinIcon32x32.png")).getImage());

        btPublicar.setBackground(new java.awt.Color(0, 0, 0));
        btPublicar.setForeground(new java.awt.Color(255, 255, 255));
        btPublicar.setText("Publicar");
        btPublicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPublicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPublicarActionPerformed(evt);
            }
        });

        panelPai.setBackground(new java.awt.Color(36, 40, 47));
        panelPai.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Loja", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        panelPai.setForeground(new java.awt.Color(255, 255, 255));

        scrollPanel.setBackground(new java.awt.Color(36, 40, 47));
        scrollPanel.setBorder(null);
        scrollPanel.setForeground(new java.awt.Color(255, 255, 255));
        scrollPanel.setToolTipText("");
        scrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scrollPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        painelLoja.setBackground(new java.awt.Color(36, 40, 47));
        painelLoja.setForeground(new java.awt.Color(255, 255, 255));
        painelLoja.setPreferredSize(new java.awt.Dimension(674, 409));
        painelLoja.setRequestFocusEnabled(false);
        painelLoja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        scrollPanel.setViewportView(painelLoja);

        javax.swing.GroupLayout panelPaiLayout = new javax.swing.GroupLayout(panelPai);
        panelPai.setLayout(panelPaiLayout);
        panelPaiLayout.setHorizontalGroup(
            panelPaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanel)
                .addContainerGap())
        );
        panelPaiLayout.setVerticalGroup(
            panelPaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        scrollPanel.getAccessibleContext().setAccessibleName("Loja");

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
        miSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miSairMouseClicked(evt);
            }
        });
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        mPerfil.add(miSair);

        mbMenu.add(mPerfil);

        mMenu.setText("Menu");
        mMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mMenuMouseClicked(evt);
            }
        });
        mMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMenuActionPerformed(evt);
            }
        });

        miBiblioteca.setText("Biblioteca");
        miBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBibliotecaActionPerformed(evt);
            }
        });
        mMenu.add(miBiblioteca);

        mbMenu.add(mMenu);

        setJMenuBar(mbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btPublicar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addComponent(panelPai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPublicar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miInformaçoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miInformaçoesActionPerformed
        new TelaPerfil().setVisible(true);
    }//GEN-LAST:event_miInformaçoesActionPerformed

    private void btPublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPublicarActionPerformed
        
        new TelaCadastroJogo(this).setVisible(true);
        
    }//GEN-LAST:event_btPublicarActionPerformed

    private void mMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mMenuMouseClicked
        
    }//GEN-LAST:event_mMenuMouseClicked

    private void miSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miSairMouseClicked

    }//GEN-LAST:event_miSairMouseClicked

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        Login.getInstance().setUsuarioLogado(null);
        new TelaLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_miSairActionPerformed

    private void mMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMenuActionPerformed
        Login.getInstance().setUsuarioLogado(null);
        new TelaLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_mMenuActionPerformed

    private void miBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBibliotecaActionPerformed
        
        new TelaBiblioteca().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_miBibliotecaActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> {
            new TelaLoja().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPublicar;
    private javax.swing.JMenu mMenu;
    private javax.swing.JMenu mPerfil;
    private javax.swing.JMenuBar mbMenu;
    private javax.swing.JMenuItem miBiblioteca;
    private javax.swing.JMenuItem miInformaçoes;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JPanel painelLoja;
    private javax.swing.JPanel panelPai;
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration//GEN-END:variables
}
