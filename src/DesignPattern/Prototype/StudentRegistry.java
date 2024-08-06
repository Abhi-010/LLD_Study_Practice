package DesignPattern.Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private static Map<String,Student> map = new HashMap<>();

    void register(String key, Student student){
        map.put(key,student);
    }
    static Student get(String key) {
        return map.get(key);
    }

}
