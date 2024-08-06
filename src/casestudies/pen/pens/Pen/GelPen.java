package casestudies.pen.pens.Pen;

import casestudies.pen.pens.Refil;
import casestudies.pen.pens.WriteStrategy.WriteStrategy;

public class GelPen extends Pen{

    private Refil refil;

    public GelPen(WriteStrategy writeStrategy) {
        super(writeStrategy);
    }

    public Refil getRefil() {
        return refil;
    }

    public void setRefil(Refil refil) {
        this.refil = refil;
    }

    @Override
    public void write() {

    }
}
