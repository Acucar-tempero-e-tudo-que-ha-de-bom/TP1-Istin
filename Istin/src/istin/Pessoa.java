package istin;

import java.util.ArrayList;

public class Pessoa {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private int[] listaIdJogos;

    public Pessoa(int id, String nome, String email, String senha, int[] listaIdJogos) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.listaIdJogos = listaIdJogos;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public int[] getListaIdJogos() {
        return listaIdJogos;
    }

    public void setListaIdJogos(int[] listaIdJogos) {
        this.listaIdJogos = listaIdJogos;
    }

}
