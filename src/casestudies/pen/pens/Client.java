package casestudies.pen.pens;

import casestudies.pen.pens.Pen.BallPen;
import casestudies.pen.pens.Pen.Pen;
import casestudies.pen.pens.WriteStrategy.SmoothWriteStrategy;

public class Client {
    public static void main(String[] args) {
        Pen reyondsTrimax = new BallPen(new SmoothWriteStrategy());
        reyondsTrimax.setBrand("Reyonds");
        reyondsTrimax.setCap(new Cap());
        reyondsTrimax.setLength(30);
        reyondsTrimax.write();

        System.out.println(reyondsTrimax.getBrand());
    }
}
