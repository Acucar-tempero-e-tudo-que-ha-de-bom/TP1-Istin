package istin.generic;

import org.json.JSONObject;

public interface JsonSerializavel {
    
    public Integer getId();
    public void setId(Integer id);
    
    public JSONObject toJSON();
    
}
