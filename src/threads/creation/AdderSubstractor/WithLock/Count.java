package threads.creation.AdderSubstractor.WithLock;

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
}
