package threads.creation.MergeSort;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrayToSort = List.of(4,5,10,9,8,12);

        Sorter sorter = new Sorter(arrayToSort);
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<List<Integer>> sortedArrayFuture = executorService.submit(sorter);

        List<Integer> sortedArray = sortedArrayFuture.get();
        for(int i = 0 ; i < sortedArray.size() ; i++){
            sortedArray.get(i);
        }
    }
}
