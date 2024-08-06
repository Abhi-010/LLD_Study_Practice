package Revision.DesignAPen.client;

import Revision.DesignAPen.Ink;
import Revision.DesignAPen.Nib;
import Revision.DesignAPen.Pen.*;
import Revision.DesignAPen.Refill;
import Revision.DesignAPen.Refillable;
import Revision.DesignAPen.enums.RefillType;
import Revision.DesignAPen.strategy.SmoothBehaviourStrategy;

import java.sql.Ref;

public class Client {
    public static void main(String[] args){

        Refillable reyonds = new ReyondsBallPen(new SmoothBehaviourStrategy());

        reyonds.refill();

        Pen ballPen = new BallPen(new SmoothBehaviourStrategy());

        String ballPenBrand = ballPen.getBrand() ;
        System.out.println("Brand is " + ballPenBrand);
        ballPen.write();

        /*

       GelPen reyondlPen = new GelPen(new SmoothBehaviourStrategy());

       Ink ink = new Ink();
       ink.setColour("Colour.BLACK");

        Refill blackRefill = new Refill();
        blackRefill.setInk(ink);
        blackRefill.setRefillType(RefillType.GELL);

        Nib nib = new Nib();
        nib.setDimension(1);

        blackRefill.setNib(nib);

        reyondlPen.setRefill(blackRefill);

        reyondlPen.write();
        System.out.println(reyondlPen.getRefill().getInk());

         */
    }
}
