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
        shuffle(arr);
    }

    public static void main(String[] args){
        System.out.println("Hello Java");

        int testSize = 10;
        int maxValue = 100;
        Integer[] testArr = new Integer[testSize];
        for (int i = 0; i < testSize; i++){
            int r = (int)(Math.random() * maxValue);
            testArr[i] = r;
        }

        print(testArr);
        shuffle(testArr);
        print(testArr);
    }
}
