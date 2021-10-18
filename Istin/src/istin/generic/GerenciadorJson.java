package istin.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public abstract class GerenciadorJson<T extends JsonSerializavel> {
    
    private String arquivo;
    protected List<T> jsonTratado;
    
    public GerenciadorJson(String arquivo) {
        this.arquivo = arquivo;
        carregaJson();
    }
    
    protected void salvarJson () {
        try (FileWriter escreve = new FileWriter(arquivo)) {
            JSONArray json = new JSONArray(jsonTratado.stream().map(T::toJSON).collect(Collectors.toList()));
            escreve.write(json.toString(4));
        } catch(IOException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected final void carregaJson() {
        try {
            FileInputStream is = new FileInputStream(arquivo);
            JSONTokener tokener = new JSONTokener(is);
            
            JSONArray jsonArr = new JSONArray(tokener);
            jsonTratado = IntStream.range(0, jsonArr.length()).mapToObj(i -> {
                JSONObject json = jsonArr.getJSONObject(i);
                return carregarObjeto(json);
            }).collect(Collectors.toList());
        } catch(FileNotFoundException e) {
            jsonTratado = new ArrayList<>();
        } catch(JSONException e) {
            jsonTratado = new ArrayList<>();
            salvarJson(); // Salva o JSON vazio
        }
    }
    
    
    abstract protected T carregarObjeto(JSONObject json);
    
}
