package istin.generic;

import org.json.JSONObject;

public interface JsonSerializavel {
    
    /**
     * @return id desse objeto 
     */
    public Integer getId();
    
    /**
     * Define o id desse objeto.
     * @param id novo id do objeto
     */
    public void setId(Integer id);
    
    /**
     * Transforma esse objeto em um objeto json.
     * @return objeto json que representa esse objeto
     */
    public JSONObject toJSON();
    
}
