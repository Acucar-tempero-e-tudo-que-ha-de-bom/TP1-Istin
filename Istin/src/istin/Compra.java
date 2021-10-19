/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package istin;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author anasofia
 */
public class Compra {
    
    public Compra() {
    }
    
    public void comprar(Jogo jogo) {
        Cliente cliente = (Cliente) Login.getInstance().getUsuarioLogado();
        List<Integer> jogosUsuario = cliente.getListaIdJogos();
        
        for(int i=0; i < jogosUsuario.size(); i++) {
            if (jogosUsuario.get(i) == jogo.getId()) {
                JOptionPane.showMessageDialog(null, "Este jogo já está em sua biblioteca.", "Jogo já adquirido", JOptionPane.OK_OPTION);
                return;
            }
        }
        
        if (cliente.getSaldo() - jogo.getPreco() < 0f) {
            Object[] opcoes = {"Sim", "Não"};
            JOptionPane.showOptionDialog(null, "Saldo insuficiente. Gostaria de adicionar mais crédito a sua carteira?", "Saldo insuficiente", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        }
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
    
}
