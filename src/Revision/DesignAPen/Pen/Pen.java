package Revision.DesignAPen.Pen;

import Revision.DesignAPen.Cap;
import Revision.DesignAPen.strategy.WriteStrategy;

public abstract class Pen {

    private String brand;
    private int length;
    private WriteStrategy writeStrategy;
    private String name;
    private Cap cap;


    public Pen(WriteStrategy writeStrategy){
        this.writeStrategy = writeStrategy;
    }

    public abstract void write();


    public WriteStrategy getWriteStrategy() {
        return writeStrategy;
    }


    //Getter & Setter

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cap getCap() {
        return cap;
    }

    public void setCap(Cap cap) {
        this.cap = cap;
    }




}
