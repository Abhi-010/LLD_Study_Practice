package casestudies.pen.pens.Pen;

import casestudies.pen.pens.Ink;
import casestudies.pen.pens.Nib;
import casestudies.pen.pens.Refil;
import casestudies.pen.pens.WriteStrategy.WriteStrategy;

public class FountainPen extends Pen{

    private Ink ink;
    private Nib nib;
    private Refil refil;

    public FountainPen(WriteStrategy writeStrategy) {
        super(writeStrategy);
    }

    @Override
    public void write() {

    }
}
