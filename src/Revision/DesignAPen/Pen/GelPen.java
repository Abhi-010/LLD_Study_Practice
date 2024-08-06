package Revision.DesignAPen.Pen;

import Revision.DesignAPen.Refill;
import Revision.DesignAPen.Refillable;
import Revision.DesignAPen.strategy.WriteStrategy;

public class GelPen extends Pen implements Refillable {
    private Refill refill;

    public GelPen(WriteStrategy writeStrategy){
        super(writeStrategy);
    }

    @Override
    public void write() {
        this.getWriteStrategy().writeBehaviour();
    }

    @Override
    public void refill() {
        System.out.println("It is a refillable pen");
    }

    public Refill getRefill() {
        return refill;
    }

    public void setRefill(Refill refill) {
        this.refill = refill;
    }
}
