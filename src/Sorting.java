public class Sorting {

    public static void swap(Comparable[] arr, int i, int j){
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }

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

    public static void print(Comparable[] arr){
        if (arr == null){
            throw new NullPointerException("Array is null at print");
        }

        System.out.println("Printing array...");

        int size = arr.length;
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("---");
    }

    public static void quickSort(Comparable[] arr){
        if (arr == null){
            throw new NullPointerException("Array is null at quickSort");
        }

        shuffle(arr);
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(Comparable[] arr, int lo, int hi){
        System.out.println("Quick sorting indexes " + lo + " - " + hi);
        if (lo < hi){
            int p = partition(arr, lo, hi);

            quickSort(arr, lo, p-1);
            quickSort(arr, p+1, hi);
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

            swap(arr, i, j);
        }

        swap(arr, j, lo);
        return j;
    }

    public static void main(String[] args){
        System.out.println("Hello Sorting");

        int testSize = 100;
        int maxValue = 100;
        Integer[] testArr = new Integer[testSize];
        for (int i = 0; i < testSize; i++){
            int r = (int)(Math.random() * maxValue);
            testArr[i] = r;
        }

        print(testArr);
        quickSort(testArr);
        print(testArr);
    }
}
