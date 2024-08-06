package DesignPattern.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<FlyWeightTree> flyWeightTreeList;
    private List<TreePosition> treePositionList;
    private TreeFactory treeFactory;
    public Game(){
        this.flyWeightTreeList = new ArrayList<>();
        this.treePositionList = new ArrayList<>();
        this.treeFactory = new TreeFactory();
    }

    public void addTree(int x, int y, String color){
        flyWeightTreeList.add(treeFactory.getTree(color));
        treePositionList.add(new TreePosition(x,y));
        render(flyWeightTreeList.size()-1);
    }
    public void render(int id){
        System.out.println(
                "Tree " + id + " with " + flyWeightTreeList.get(id).getColor() + " color rendered at " +
                        treePositionList.get(id).getX() +","+
                        treePositionList.get(id).getY()
        );
    }
}
