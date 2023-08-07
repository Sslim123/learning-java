import java.util.*;

public class Searching {
    public static void main(String[] args) {
        //Searching m = new Searching();
        //m.mainNumbers();
        // int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // searchBinary(numbers, 7);
        // if (found != -1) {
        // System.out.println("the vale is found" + found);
        // } else {
        // System.out.println("the vale is not found");
        // }
        // sequenceSearcher(numbers, 10);
        // sequenceSearcher(numbers, 11);
    }

    static int searchBinary(int[] numbers, int value) {
        int lowest = 0;
        int highest = numbers.length - 1;

        while (highest >= lowest) {

            int middle = (lowest + highest) / 2;
            if (numbers[middle] == value) {

                System.out.println("the index of the number  ( " + middle + " ) ");
                return middle;
            }
            if (numbers[middle] < value) {
                lowest = middle + 1;
                System.out.println(" the lowest is " + lowest);
            }
            if (numbers[middle] > value) {
                highest = middle - 1;
                System.out.println(" the highest is " + highest);
            }

        }
        System.out.println("this is the value" + value);
        return value;
    }

    public static void sequenceSearcher(int[] numbers, int value) {

        for (int i = 0; i < numbers.length; i++) {
            // System.out.println(numbers[i]);
            if (numbers[i] == value) {

                System.out.println("the value " + value + "in the position" + i);

            }

        }
        System.out.println("the value " + value + "is not the list");

    }

    public static void mainNumbers() {
        int values;
        // int arr;
        int item;
        Scanner sc = new Scanner(System.in);
        System.out.println(" inter the number for array");
        values = sc.nextInt();
        int[] arr = new int[values];
        System.out.println("inter " + values + " numbers");
        for (int i = 0; i < values; i++) {

            System.out.println("fill the array with numbers" + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("inter the search values");
        item = sc.nextInt();
        for (int i = 0; i < values; i++) {
            System.out.println("this is index : " + i + " the number of arrays" + arr[i]);
            if (arr[i] == item) {
                System.out.println(item + " is found ");
                break;
            }else{
                System.out.println(item + " is not found");
            }

        }
        if (item == values) {
            System.out.println(item + "item do not exit in array");
        }
    }

}
