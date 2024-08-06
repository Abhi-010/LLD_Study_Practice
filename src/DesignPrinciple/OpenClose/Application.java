package DesignPrinciple.OpenClose;

public class Application {

    public double get_total_volume(Cuboid[] geo_objects){
        double vol_sum = 0;
        for(Cuboid geo_ojb : geo_objects){
            vol_sum+=geo_ojb.breadth*geo_ojb.length*geo_ojb.height;
        }
        return vol_sum ;
    }
}
