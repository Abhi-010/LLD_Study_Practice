package Revision.DesignAPen.Pen;

import Revision.DesignAPen.Ink;
import Revision.DesignAPen.Nib;
import Revision.DesignAPen.strategy.WriteStrategy;

public class FountainPen extends Pen{
    private Ink ink;
    private Nib nib;

    public FountainPen(WriteStrategy writeStrategy) {
        super(writeStrategy);
    }

    @Override
    public void write() {

    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Nib getNib() {
        return nib;
    }

    public void setNib(Nib nib) {
        this.nib = nib;
    }
}
