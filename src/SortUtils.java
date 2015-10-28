/**
 * Created by berkay on 10/28/2015.
 */
public class SortUtils {
    public static void shuffle(Comparable[] arr){
        if (arr == null){
            throw new NullPointerException("Array is null at shuffle");
        }

        System.out.println("Everyday I'm shuffling");

        int size = arr.length;
        for (int i = 0; i < size; i++){
            int r = (int)(Math.random() * size);
            swap(arr, i, r);
        }
    }

    public static void swap(Comparable[] arr, int i, int j){
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }

    public static boolean less(Comparable[] arr, int i, int j){
        return arr[i].compareTo(arr[j]) < 0;
    }
}
