package Revision.DesignAPen.Pen;

import Revision.DesignAPen.Refillable;
import Revision.DesignAPen.strategy.WriteStrategy;

public class ReyondsBallPen extends BallPen implements Refillable {

    public ReyondsBallPen(WriteStrategy writeStrategy){
        super(writeStrategy);
    }

    @Override
    public void refill() {
        System.out.println("this is refillable pen");
    }
}
