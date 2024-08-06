package threads.creation.AdderSubstractor.WithAtomicIntegers;

import java.util.concurrent.atomic.AtomicInteger;

public class Count {
    private AtomicInteger count = new AtomicInteger(0);

    public AtomicInteger getCount() {
        return count;
    }

//    public void setCount(AtomicInteger count) {
//        this.count = count;
//    }
}
