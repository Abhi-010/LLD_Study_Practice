package Revision.DesignAPen.Pen;

import Revision.DesignAPen.Refill;
import Revision.DesignAPen.strategy.WriteStrategy;

public class BallPen extends Pen {
    private Refill refill;

    public BallPen(WriteStrategy writeStrategy) {
        super(writeStrategy);
    }

    @Override
    public void write() {
        WriteStrategy writeStrategy = getWriteStrategy();

        System.out.println("Writing with ball pen in" + writeStrategy);
    }

    public Refill getRefill() {
        return refill;
    }

    public void setRefill(Refill refill) {
        this.refill = refill;
    }
}
