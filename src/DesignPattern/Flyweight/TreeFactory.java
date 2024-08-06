package DesignPattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    private Map<String,FlyWeightTree> treemap;

    public TreeFactory(){
        this.treemap = new HashMap<>();
    }

    public FlyWeightTree getTree(String color){
        if(treemap.containsKey(color)){
            return treemap.get(color);
        }
        FlyWeightTree flyWeightTree = new FlyWeightTree(color);
        treemap.put(color,flyWeightTree);
        return flyWeightTree;
    }
}
