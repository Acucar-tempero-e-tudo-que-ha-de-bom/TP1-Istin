package istin.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public abstract class GerenciadorJson<T extends JsonSerializavel> {
    
    private final String arquivo;
    private int contadorId = 1;
    protected Map<Integer, T> jsonTratado = new HashMap<>();;
    
    public GerenciadorJson(String arquivo) {
        this.arquivo = arquivo;
        carregaJson();
    }
    
    public void salvarJson () {
        try (FileWriter escreve = new FileWriter(arquivo)) {
            JSONObject json = new JSONObject();

            json.put("contadorId", contadorId);
            json.put("dados",
                    jsonTratado
                            .entrySet()
                            .parallelStream()
                            .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue().toJSON())));
            
            escreve.write(json.toString(4));
        } catch(IOException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected final void carregaJson() {
        try {
            FileInputStream is = new FileInputStream(arquivo);
            JSONTokener tokener = new JSONTokener(is);
            JSONObject obj = new JSONObject(tokener);
            
            contadorId = obj.optInt("contadorId", 1);
            JSONObject dados = obj.optJSONObject("dados");
            if (dados != null) {
                jsonTratado = dados
                        .keySet()
                        .parallelStream()
                        .collect(Collectors.toMap(key -> Integer.parseInt(key), key -> carregarObjeto(dados.getJSONObject(key))));
            } else {
                jsonTratado = new HashMap<>();
            }
        } catch(FileNotFoundException | JSONException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
            salvarJson(); // Salva o JSON vazio
        }   
    }
    
    // Getters
    public Collection<T> valueCollection() {
        return jsonTratado.values();
    }
    
    public T get(int id) {
        return jsonTratado.get(id);
    }
    
    // Add
    public T add(T valor, boolean salvar) {
        if (valor.getId() == null) {
            valor.setId(contadorId);
            contadorId++;
        }
        
        jsonTratado.put(valor.getId(), valor);
        if (salvar) {
            salvarJson();
        }
        
        return valor;
    }
    
    public T add(T valor) {
        return add(valor, true);
    }
    
    // Remove
    public void remove(int key) {
        jsonTratado.remove(key);
        salvarJson();
    }
    
    public void remove(T valor) {
        remove(valor.getId());
    }
    
    abstract protected T carregarObjeto(JSONObject json);
    
}
