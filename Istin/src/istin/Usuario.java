package istin;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private int[] listaIdJogos;
    private byte[] fotoPerfil;

    public Usuario(String nome, String email, String senha, int[] listaIdJogos, byte[] fotoPerfil) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.listaIdJogos = listaIdJogos;
        this.fotoPerfil = fotoPerfil;
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

    public byte[] getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(byte[] fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public void setListaIdJogos(int[] listaIdJogos) {
        this.listaIdJogos = listaIdJogos;
    }
    
    
}
