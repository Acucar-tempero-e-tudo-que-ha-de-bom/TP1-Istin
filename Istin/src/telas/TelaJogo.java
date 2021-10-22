package telas;

import istin.Autor;
import istin.Cliente;
import istin.enums.TipoUsuario;
import istin.Jogo;
import istin.Login;
import istin.Loja;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaJogo extends javax.swing.JFrame {
    
    private final Jogo jogo;
    private final Loja loja;
    private final Login login;
    private final TelaLoja lojaPai;
    private final TelaBiblioteca bibPai;
    
    /**
     * Creates new form TelaJogo
     * @param jogo Jogo apresentado na tela
     * @param lojaPai
     */
    public TelaJogo(Jogo jogo, TelaLoja lojaPai, TelaBiblioteca bibPai) {
        this.jogo = jogo;
        this.lojaPai = lojaPai;
        this.bibPai = bibPai;
        this.loja = Loja.getInstance();
        this.login = Login.getInstance();
        
        initComponents();
        getContentPane().setBackground(new java.awt.Color(36, 40, 47));
        
        boolean ehCliente = false, jaAvaliou = false;
        if(login.getUsuarioLogado().getTipo() == TipoUsuario.CLIENTE) {
            Cliente cliente = (Cliente) login.getUsuarioLogado();
            for(Integer idJogo : cliente.getIdJogosAvaliados()){
                System.out.println("id jogo: " + jogo.getId() + " tamo no: " + idJogo);
                if(idJogo.equals(jogo.getId())) jaAvaliou = true;
                break;
            }
            ehCliente = true;
        }
        
        System.out.println(jaAvaliou);
        
        btnExcluir.setVisible(jogo.getAutorId().equals(login.getUsuarioLogado().getId()));
        btnComprar.setVisible(ehCliente);
        
        rdbtn1.setVisible(ehCliente&&!jaAvaliou);
        rdbtn2.setVisible(ehCliente&&!jaAvaliou);
        rdbtn3.setVisible(ehCliente&&!jaAvaliou);
        rdbtn4.setVisible(ehCliente&&!jaAvaliou);
        rdbtn5.setVisible(ehCliente&&!jaAvaliou);
        btnAvaliar.setVisible(ehCliente&&!jaAvaliou);
        
        setTitle("Istin - " + jogo.getNome());
        ImageIcon imageIcon = new ImageIcon(jogo.getImagem());
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(94, 120, Image.SCALE_SMOOTH);
        lblcapaJogo.setIcon(new ImageIcon(newimg));
        lblnomeJogo.setText(jogo.getNome());
        lblPreco.setText(String.format("%.2f",jogo.getPreco()));
        lblValorNota.setText(String.valueOf(jogo.getMediaAvaliacao()));
        
        Autor autor = (Autor) login.get(jogo.getAutorId());
        lblnomeAutor.setText(autor.getNome());
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpNota = new javax.swing.ButtonGroup();
        lblcapaJogo = new javax.swing.JLabel();
        lblnomeJogo = new javax.swing.JLabel();
        lblnomeAutor = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        lblNota = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        rdbtn1 = new javax.swing.JRadioButton();
        rdbtn2 = new javax.swing.JRadioButton();
        rdbtn3 = new javax.swing.JRadioButton();
        rdbtn4 = new javax.swing.JRadioButton();
        rdbtn5 = new javax.swing.JRadioButton();
        lblValorNota = new javax.swing.JLabel();
        btnAvaliar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(36, 40, 47));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoIstinIcon32x32.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcapaJogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Agreste-pequeno.png"))); // NOI18N
        getContentPane().add(lblcapaJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 42, -1, -1));

        lblnomeJogo.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblnomeJogo.setForeground(new java.awt.Color(255, 255, 255));
        lblnomeJogo.setText("NOME DO JOGO");
        getContentPane().add(lblnomeJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 50, -1, -1));

        lblnomeAutor.setForeground(new java.awt.Color(255, 255, 255));
        lblnomeAutor.setText("AutorNome");
        getContentPane().add(lblnomeAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 91, -1, -1));

        lblPreco.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco.setText("Preço: R$ 00,00");
        getContentPane().add(lblPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 112, -1, -1));

        lblNota.setForeground(new java.awt.Color(255, 255, 255));
        lblNota.setText("Nota:");
        getContentPane().add(lblNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 147, -1, -1));

        btnExcluir.setBackground(new java.awt.Color(36, 40, 47));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        btnVoltar.setBackground(new java.awt.Color(36, 40, 47));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta-esquerda.png"))); // NOI18N
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        btnComprar.setBackground(new java.awt.Color(36, 40, 47));
        btnComprar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar.setText("Comprar");
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        btnGrpNota.add(rdbtn1);
        rdbtn1.setText("1");
        rdbtn1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rdbtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rdbtn1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(rdbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 198, -1, 38));

        btnGrpNota.add(rdbtn2);
        rdbtn2.setText("2");
        rdbtn2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rdbtn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rdbtn2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(rdbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 198, -1, 38));

        btnGrpNota.add(rdbtn3);
        rdbtn3.setText("3");
        rdbtn3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rdbtn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rdbtn3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(rdbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 198, -1, 38));

        btnGrpNota.add(rdbtn4);
        rdbtn4.setText("4");
        rdbtn4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rdbtn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rdbtn4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(rdbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 198, -1, 38));

        btnGrpNota.add(rdbtn5);
        rdbtn5.setText("5");
        rdbtn5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rdbtn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rdbtn5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(rdbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 198, -1, 38));

        lblValorNota.setForeground(new java.awt.Color(255, 255, 255));
        lblValorNota.setText("5,00");
        getContentPane().add(lblValorNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 147, -1, -1));

        btnAvaliar.setText("Avaliar");
        btnAvaliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaliarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvaliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 198, -1, 38));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        loja.remove(jogo.getId());
        login.removerJogoPublicado(jogo);
        lojaPai.atualizarLoja();
        bibPai.atualizarBiblioteca();
        dispose();

    }//GEN-LAST:event_btnExcluirActionPerformed

    /*
        NÃO ESQUECER DE SALVAR NO JSON
        FAZER ISSO DPS
        TO INDO FAZER A PARTE DE CONFIGURAR TODOS OS CADASTROS BONITINHOS
    */
    
    private void btnAvaliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvaliarActionPerformed
        
        boolean[] avaliacao = {rdbtn1.isSelected(), rdbtn2.isSelected(), rdbtn3.isSelected(), rdbtn4.isSelected(), rdbtn5.isSelected()};
        
        if(!rdbtn1.isSelected()&&!rdbtn2.isSelected()&&!rdbtn3.isSelected()&&!rdbtn4.isSelected()&&!rdbtn5.isSelected()) {
            JOptionPane.showMessageDialog(null, "Alguma nota deve estar selecionada");
        } else {
            for(int i = 0; i < 5; i ++) {
                if(avaliacao[i]) {
                    int numeroAvaliacao = jogo.getNumeroAvaliacoes();
                    float mediaAvaliacao = jogo.getMediaAvaliacao();
                    jogo.setMediaAvaliacao((numeroAvaliacao*mediaAvaliacao + i  + 1) / (++numeroAvaliacao));
                    jogo.setNumeroAvaliacoes(numeroAvaliacao);
                    lblValorNota.setText(String.format("%.2f",jogo.getMediaAvaliacao()));
                    break;
                }
            }
            btnAvaliar.setVisible(false);
            Cliente cliente = (Cliente) login.getUsuarioLogado();
            login.adicionarJogoAvaliado(cliente, jogo.getId());
        }
        
    }//GEN-LAST:event_btnAvaliarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            TelaLoja lojaPai = new TelaLoja();
            TelaBiblioteca bibPai = new TelaBiblioteca();
            lojaPai.setVisible(true);
            Jogo jogo = Loja.getInstance().getJogos().iterator().next();
            new TelaJogo(jogo, lojaPai, bibPai).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvaliar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.ButtonGroup btnGrpNota;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblValorNota;
    private javax.swing.JLabel lblcapaJogo;
    private javax.swing.JLabel lblnomeAutor;
    private javax.swing.JLabel lblnomeJogo;
    private javax.swing.JRadioButton rdbtn1;
    private javax.swing.JRadioButton rdbtn2;
    private javax.swing.JRadioButton rdbtn3;
    private javax.swing.JRadioButton rdbtn4;
    private javax.swing.JRadioButton rdbtn5;
    // End of variables declaration//GEN-END:variables
}
