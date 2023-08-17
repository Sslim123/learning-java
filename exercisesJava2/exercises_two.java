package exercisesJava2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class exercises_two {

    public static void main(String[] args) {
        // sumNumbers();
        // largestSecondeNumber();
        // convertedArray();
        // createListOfArray();
        // reversedArray();
        // checkCharacter();
        roundUp();
    }

    static void sumNumbers() {
        int numbers = 2345;
        int sub = 0;
        while (numbers > 0) {
            sub = sub * 10 + numbers % 10;
            numbers = numbers / 10;
            System.out.println(" the sum numbers are:  " + sub + "  the reverse numbers : " + numbers);
        }
        System.out.println("the reversed numbers: " + sub);

    }

    static void largestSecondeNumber() {
        int[] arr = { 2, 8, 16, 32, 3, 64, 9 };
        int large = 0;
        int seconds = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + arr[i]);
            seconds = large;
            large = arr[i];
        }
        System.out.println(seconds);
    }

    static void convertedArray() {
        String[] arr = { "a", "b", "c", "d", "e" };

        List converted = Arrays.asList(arr);
        System.out.println(converted);
        List<String> result = new ArrayList<>();
        Collections.addAll(result, arr);
        System.out.println(result);
        List<String> result1 = new ArrayList<>();

        for (String str : arr) {
            result1.add(str);
        }
        System.out.println("the result is:" + result1);
    }

    static void createListOfArray() {
        int[] arr = { 2, 8, 16, 32, 3, 64, 9 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + arr[i]);
        }
        ArrayList<Integer> array = new ArrayList<>();
        array.add(34);
        array.add(35);
        array.add(36);
        int index = 0;
        while (index < array.size()) {
            int element = array.get(index);
            System.out.println(array + " " + element);
            index++;
        }
        System.out.println(index);

        array.add(0, 37);
        array.remove(3);
        System.out.println(array);
    }

    static void reversedArray() {
        int[] array = { 2, 3, 5, 7, 9, 11 };
       
        String[] str = { "a", "b", "c", "d" };
        List str1 = Arrays.asList(str);
        Collections.reverse(str1);
        System.out.println(str1);
        int reversed = 0;
        int size = str.length;
        for (int i = 0; i < size; i++) {
            reversed = (reversed * 10) + (size % 10);
            System.out.println(reversed);
            size = size / 10;
        }
        System.out.println(reversed);

    }

    static void checkCharacter() {
        String str = "salem alalem", str2 = "dayfan ";
        String str3 = str.concat(" " + str2);
        System.out.println(str3);

        int index = 4;
        if (index >= 0 && index < str.length()) {
            int unicodePointAt = str.codePointAt(index);
            System.out.println(index + "  " + unicodePointAt);
            System.out.println("this is unicode point " + Character.toString(unicodePointAt));
        }
    }

    static void roundUp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" inter number to division");
        int number = scanner.nextInt();
        int divide = number / 4;
        int reminder = number % 4;
        if (reminder != 0) {
            divide++;
        }
        System.out.println(number + " result is : " + divide + " and reminder is " + reminder);
    String checked = "hello ";
    String result = " ";
    boolean result1 =
    checked.endsWith(result);
        System.out.println(result1);
    
    // List<String> resultList = new ArrayList<String>();
    // List resulList = Arrays.asList(checked);
    // System.out.println(resultList);
    }

}
