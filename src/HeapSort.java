/**
 * Created by berkay on 10/28/2015.
 */
public class HeapSort {
    public static void sort(Comparable[] arr){
        System.out.println("Heap sorting started");
    }

    public static void sink(int index, Comparable[] arr){
        while (2*index < arr.length){
            int left = 2 * index;
            int right = left + 1;

            if (SortUtils.less(arr, index, left) || SortUtils.less(arr, index, right))

            index = index *2;
        }
    }
}
