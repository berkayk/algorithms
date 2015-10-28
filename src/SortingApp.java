public class SortingApp {

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
        QuickSort.sort(testArr);
        print(testArr);
    }
}
