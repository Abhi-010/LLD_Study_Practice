package DesignPrinciple.OpenClose;

// A new functionality comes that we have to calculate volume of sphere as well
// In order to accommodate this new change we need to the application class needs to be changed
// which violates Open/Closed Principle.


public class Client {
    public static void main(String[] args){
        Cuboid c1 = new Cuboid();
        c1.height = 5;
        c1.length = 10;
        c1.breadth = 15;

        Cuboid c2 = new Cuboid();
        c2.height = 2;
        c2.length = 4;
        c2.breadth = 6;

        Cuboid c3 = new Cuboid();
        c3.height = 3;
        c3.length = 12;
        c3.breadth = 15;

        Cuboid[] ar = new Cuboid[3];
        ar[0] = c1;
        ar[1] = c2;
        ar[2] = c3;
        Application ap = new Application();
        double vol = ap.get_total_volume(ar);
        System.out.println(vol);


    }
}
