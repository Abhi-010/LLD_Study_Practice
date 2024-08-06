package DesignPattern.PrototypeRevision;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    //Registry allows you to store and also allows you to fetch
    private Map<String,Student> map = new HashMap<String, Student>();
    void register(String key, Student student){
        map.put(key,student);
    }
    Student get(String key){
        return map.get(key);
    }
}
