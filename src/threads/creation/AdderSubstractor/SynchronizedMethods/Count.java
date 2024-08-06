package threads.creation.AdderSubstractor.SynchronizedMethods;

public class Count {
    private int count = 0;
    public Count(){}
    public Count(int count){
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public synchronized void incrementValue(int offset){
        this.count = this.count + offset;
    }
}
