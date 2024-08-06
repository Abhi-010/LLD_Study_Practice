package threads.creation.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    public Sorter(List<Integer> arrayToSort){
        this.arrayToSort = arrayToSort;
    }

    @Override
    public List<Integer> call() throws Exception {
        int n = arrayToSort.size();
        if(n <= 1){
            return arrayToSort;
        }
        int mid = n/2;
        List<Integer> leftArray  = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i= 0 ; i < mid ; i++){
            leftArray.add(arrayToSort.get(i));
        }
        for(int i = mid ; i < n ; i++){
            rightArray.add(arrayToSort.get(i));
        }
        Sorter leftSorter = new Sorter(leftArray);
        Sorter rightSorter = new Sorter(rightArray);

        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<List<Integer>> leftSorterFuture = executorService.submit(leftSorter);
        Future<List<Integer>>  rightSorterFuture = executorService.submit(rightSorter);

        List<Integer> leftSortedFuture = leftSorterFuture.get();
        List<Integer> rightSortedFuture = rightSorterFuture.get();
        List<Integer> ans = new ArrayList<>();
        int i = 0 ;
        int j = 0 ;
        while(i < leftSortedFuture.size() && j < rightSortedFuture.size()){
            if(leftSortedFuture.get(i) <= rightSortedFuture.get(i)){
                ans.add(leftSortedFuture.get(i));
                i++;
            }
            else {
                ans.add(rightSortedFuture.get(j));
                j++;
            }
        }
        while(i < leftSortedFuture.size()){
            ans.add(leftSortedFuture.get(i));
            i++;
        }
        while(j < rightSortedFuture.size()){
            ans.add(rightSortedFuture.get(j));
            j++;
        }
        return ans;
    }
}
