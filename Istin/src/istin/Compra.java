/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package istin;

import javax.swing.JOptionPane;

/**
 *
 * @author anasofia
 */
public class Compra {
<<<<<<< Updated upstream
=======
    public Compra() {
    }
    
    public void comprar(Jogo jogo) {
        Usuario usuario = Login.getInstance().getLogado();
        int[] jogosUsuario = usuario.getListaIdJogos();
        
        for(int i=0; i < jogosUsuario.length; i++) {
            if (jogosUsuario[i] == jogo.getId()) {
                JOptionPane.showMessageDialog(null, "Este jogo já está em sua biblioteca.", "Jogo já adquirido", JOptionPane.OK_OPTION);
                return;
            }
        }
        
        if (usuario) // o problema é que aqui eu precisaria que meu objeto fosse
                    // um cliente pra poder pegar o saldo dele
    }
    // Primeira coisa que tem que fazer é verificar se o jogo que o cliente quer
    // comprar já não está na biblioteca dele, se isso acontecer, a compra deve 
    // ser cancelada e uma mensagem aparece na tela. -> OK
    // Depois é preciso verificar se o cliente tem saldo suficiente pra comprar
    // o jogo, se ele não tiver é interessante perguntar se ele quer adicionar
    // saldo, aí leva pra uma tela de colocar saldo. 
    // Depois dessa verificação, o cliente é perguntado se tem certeza de sua
    // compra e aí sim o valor é debitado do saldo dele e o jogo adicionado
    // a sua biblioteca
>>>>>>> Stashed changes
    
}
