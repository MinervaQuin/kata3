/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Minerva
 */
public class Histogram <T> {
    
    private final Map<T, Integer> histogr = new HashMap<>();

    public Map<T, Integer> getHistogr() {
        return histogr;
    }
    
    public Integer get(T clave){
        if(histogr.containsKey(clave)){
            return histogr.get(clave);
        }else{
            return null;
        }
    }
    
    public Set<T> keySet(){
        return histogr.keySet();
    }
    
    public void increment(T key){
        histogr.put(key, histogr.containsKey(key) ? histogr.get(key) + 1 : 1);
    }
    
    
    
    
}
