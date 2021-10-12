package istin;

public class Autor extends Pessoa{

    public Autor(int id, String nome, String email, String senha, int[] listaIdJogos) {
        super(id, nome, email, senha, listaIdJogos);
    }
    
    public Autor(String nome, String email, String senha, int[] listaIdJogos) {
        super(0, nome, email, senha, listaIdJogos);
    }

}
