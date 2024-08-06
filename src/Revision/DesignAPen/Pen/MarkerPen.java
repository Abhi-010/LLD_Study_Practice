package Revision.DesignAPen.Pen;

import Revision.DesignAPen.Refill;
import Revision.DesignAPen.strategy.WriteStrategy;

public class MarkerPen extends Pen{
    private Refill refill;

    public Refill getRefill() {
        return refill;
    }

    public void setRefill(Refill refill) {
        this.refill = refill;
    }

    public MarkerPen(WriteStrategy writeStrategy) {
        super(writeStrategy);
    }

    @Override
    public void write() {

    }
}
