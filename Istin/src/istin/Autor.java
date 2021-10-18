package istin;

import java.util.List;
import org.json.JSONObject;

public class Autor extends Usuario {

    public Autor(String nome, String email, String senha, List<Integer> listaIdJogos) {
        super(nome, email, senha, listaIdJogos);
    }

    public Autor(JSONObject json) {
        super(json);
    }

}
