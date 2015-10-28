/**
 * Created by berkay on 10/28/2015.
 */
public class QuickSort {
    public static void sort(Comparable[] arr){
        if (arr == null){
            throw new NullPointerException("Array is null at sort");
        }

        SortUtils.shuffle(arr);
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(Comparable[] arr, int lo, int hi){
        System.out.println("Quick sorting indexes " + lo + " - " + hi);
        if (lo < hi){
            int p = partition(arr, lo, hi);

            sort(arr, lo, p - 1);
            sort(arr, p + 1, hi);
        }
        else
            return;
    }

    private static int partition(Comparable[] arr, int lo, int hi) {
        System.out.println("Partitioning indexes " + lo + " - " + hi);
        Comparable divider = arr[lo];
        int i = lo;
        int j = hi + 1;
        while (true){
            while (arr[++i].compareTo(divider) < 0){
                if (i == hi)
                    break;
            }

            while (arr[--j].compareTo(divider) > 0){
                if (j == lo){
                    break;
                }
            }

            if (i >= j){
                break;
            }

            SortUtils.swap(arr, i, j);
        }

        SortUtils.swap(arr, j, lo);
        return j;
    }
}
