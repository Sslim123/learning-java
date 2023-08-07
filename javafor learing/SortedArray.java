import java.util.ArrayList;
import java.util.Arrays;
public class SortedArray{
    public static void main(String[] args) {
        System.out.println("Sorting");
        int[] array = {2, 6, 7, 1, 32, 3, 5};
        // selectionSortedValues(array);
        // SortedArray m = new SortedArray();
        //selectionSort(array);
        bubbleSort(array);
        //selectionSortedValue(array);
    }// end of the method main

    static void bubbleSort(int[] array) {
        int sum = 0;
        // int[] array = { 4, 2, 6, 7, 1, 32, 3, 5 };
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            int arrSum = sum / array.length;
            System.out.println(" this is the average" + arrSum + " of " + array[i]);
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        
        }
        ArrayList arr = new ArrayList();
        for(int i = 0; i < array.length; i++) {
           arr.add(array[i]);

        }
         System.out.println(arr);
        System.out.println(Arrays.toString(array));
    
    }

    static void selectionSort(int[] array) {
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            indexMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < indexMin) {
                    indexMin = j;
                }
            }
            int elmIndex = array[i];
            array[i] = array[indexMin];
            array[indexMin] = elmIndex;
            System.out.println(array[indexMin]);
        }
        for (int i = 0; i <array.length; i++) {
            System.out.println("selection index " + array[i]);
        }

    }// end of the method selectionSorted

    static void selectionSortedValue(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("the value of " + array[i] + " ");
        }
        System.out.println("\n");
    }// end of the method selectionSortedValues
}
