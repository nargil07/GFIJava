/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfitest.metier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 *
 * @author antony
 */
public abstract class AbstractMetier<T> {
    
    protected Map<String, T> entityMap;
    
    protected abstract String getId(T entity);
    
    public void addEntity(T entity){
        if(search(getId(entity))==null){
            entityMap.put(getId(entity), entity);
        }
    }
    
    public void addEntities(Collection<T> entities){
        for(T entity : entities){
            addEntity(entity);
        }
    }
    
    public void setListEntities(Collection<T>entities){
        entityMap.clear();
        addEntities(entities);
    }
    
    protected T search(String id)
    {
        return entityMap.get(id);
    }
    
    public List<T> getList(){
       return new ArrayList<>(entityMap.values());
    }
}
