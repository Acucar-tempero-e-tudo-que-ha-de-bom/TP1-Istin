package istin.generic;

import org.json.JSONObject;

public abstract class JsonSerializavel {
    
    private final JSONObject jsonFonte;
    
    public JsonSerializavel(JSONObject json) {
        jsonFonte = json;
    };
    
    abstract public JSONObject toJSON();
    
}
