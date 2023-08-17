package exercisesJava2;

import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class exercises_three {
    public static void main(String[] args) {
        // dateFormate();
         //bubbleSorted();
        // mergeSorted();
        linearSearch();
        //int[] numbers = { 71, 45, 32, 56, 7, 3, 5, 12, 2, 1 };
        //int target = 12;
       // int index = searchingBinary(numbers, target);
        // if (index == -1) {
        //     System.out.print(target + " ");
        // } else {

        //     System.out.println(target + "  " + index);
        // }

    }

    static void dateFormate() {
        SimpleDateFormat frame = new SimpleDateFormat("yyyy-MM-dd EEEE: HH:mm:ss a");
        Date date = new Date();
        System.out.println(frame.format(date));
        Calendar cal = Calendar.getInstance();

        int year = cal.getActualMinimum(Calendar.YEAR);
        int month = cal.getActualMinimum(Calendar.MONTH + 1);
        int day = cal.getActualMinimum(Calendar.DAY_OF_MONTH);
        int week = cal.getActualMinimum(Calendar.WEEK_OF_MONTH);
        System.out.println(year + " " + month + " " + week + " " + day);
        System.out.println(date);
        Calendar calNewYork = Calendar.getInstance();
        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.print(calNewYork.get(Calendar.HOUR_OF_DAY) + ":");
        System.out.print(calNewYork.get(Calendar.MINUTE) + ":");
        System.out.print(calNewYork.get(Calendar.SECOND));

    }

    static void bubbleSorted() {
        int[] sorted = { 14, 6, 3, 4, 2, 12, 11 };
        int num = 0;
        for (int i = 0; i < sorted.length; i++) {
            for (int j = 0; j < sorted.length - 1; j++) {
                if (sorted[j] <= sorted[i]) {
                    num = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = num;
                }
            }
        }
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
       // System.out.println(num + " ");
    }

    static void mergeSorted() {
        int[] sorted = new int[] { 11, 23, 6, 3, 4, 2, 1, 5 };
        int lowest = 0;
        int highest = sorted.length - 1;
        int middle = lowest + (highest - lowest) / 2;

        int array1 = (middle - lowest) + 1;
        int array2 = highest - middle;
        // System.out.println(middle);

        int[] left_array = new int[array1];
        int[] right_array = new int[array2];

        for (int i = 0; i < array1; i++) {
            left_array[i] = sorted[i];
            // System.out.println(left_array[i]);
        }

        for (int j = 0; j < array2; j++) {
            right_array[j] = sorted[middle + 1 + j];
            // System.out.println(right_array[j]);
        }
        int sorted1 = 0;
        int sorted2 = 0;
        int sortedAll = 0;
        while (sorted1 < array1 && sorted2 < array2) {

            if (left_array[sorted1] < right_array[sorted2]) {
                sorted[sortedAll] = left_array[sorted1];
                sorted1++;
                // System.out.println(sorted1 + " ");
            } else {
                sorted[sortedAll] = right_array[sorted2];
                sorted2++;
                System.out.println(sorted2 + "  ");
            }
            sortedAll++;
            // System.out.println(sortedAll);
        }
        // System.out.println(sortedAll + " "+sorted1 + " "+sorted2);
        while (sorted1 < array1) {
            sorted[sortedAll] = left_array[sorted1];
            sorted1++;
            sortedAll++;
        }
        while (sorted2 < array2) {
            sorted[sortedAll] = right_array[sorted2];
            sorted2++;
            sortedAll++;
        }
        // int[] sortedArray = new int[sorted[i]];
        System.out.println(Arrays.toString(sorted));

    }

    public static int searchingBinary(int[] numbers, int target) {
        int highest = numbers.length - 1;
        int lowest = 0;

        while (highest >= lowest) {
            int middle = lowest + (highest - lowest) / 2;
            if (numbers[middle] > target) {
                highest = middle - 1;
            } else if (numbers[middle] < target) {
                lowest = middle + 1;
            } else {
                return target;
            }
        }

        return -1;
    }

    static void linearSearch() {
        int[] num = { 0, 1, 7, 9, 2, 3, 4, 5 };
        int target = 3;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                System.out.println(i + " " + num[i]);
            }
        }
    }
}
