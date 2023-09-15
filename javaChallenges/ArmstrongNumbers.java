package javaChallenges;

import java.util.*;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int pow = (int) Math.pow(4, 3);
        // System.out.println(pow);
        // int num = 153;
        // boolean number = wholeNumber(num);
        // System.out.println(number);

        // int numbers = 2468;
        // List<Integer> integers = findArmstrongNumbers(numbers);
        // System.out.println(numbers + " " + integers);
        productOfArray();

    }

    public static List<Integer> findArmstrongNumbers(int num1) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < num1; i++) {
            if (ArmstrongCalNumbers(i)) {
                numbers.add(i);
            }
        }
        return numbers;
    }

    static boolean ArmstrongCalNumbers(int num) {
        int number = num;
        int numbers = String.valueOf(num).length();
        int calculated = 0;

        while (num != 0) {
            int digit = num % 10;
            calculated += Math.pow(digit, numbers);
            num /= 10;
        }
        return calculated == number;
    }

    static boolean wholeNumber(int number) {
        // return boolean true
        // the whole number equal of the sum of the digits of the numbers
        // raised to power of the total of the digits
        int numbers = number;
        int number1 = String.valueOf(numbers).length();
        int current = 0;
        while (number != 0) {
            int digit = number % 10;
            current += Math.pow(digit, number1);
            number /= 10;

        }
        System.out.println(numbers + " " + current);
        return current == numbers;

    }

    static void productOfArray() {
        int[] numbers = { 2, 4, 20, 7, 6, 8 };

        int maxProduct = 0;
        int num1 = 0, num2 = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {
                int product = numbers[i] * numbers[j];
                if (product > maxProduct) {
                    maxProduct = product;
                    num1 = numbers[i];
                    num2 = numbers[j];
                    // System.out.println(num1);
                    // System.out.println(num2);
                }
            }

        }
        System.out.println("numbers : " + num1 + "," + num2);
        System.out.println("product : " + maxProduct);
        int[] array1 = { 1, 3, 5, 7, 9 };
        int[] array2 = { 2, 4, 6, 8,10 };
        int num3 = 0;
        int num4 = 0;
        int maxProduct2 = 0;
        int pro1 =0;
        int pro2 =0;

        for (int i = 0; i < array1.length; i++) {
             pro1 = Math.max(1, array1[i]);
            for (int j = 0; j < array2.length; j++) {
                 pro2 = Math.max(1, array2[j]);
                int product2 = array1[i] * array2[j];
                if (product2 > maxProduct2) {
                maxProduct2 = product2;
                    num3 = array1[i];
                    num4 = array2[j];
                }
            }
        }
        int pro3 = pro1 * pro2;
        System.out.println(num3 + " "+ pro1+" " + num4 + " " + pro2);
        System.out.println(maxProduct2 +" " + pro3);

    }

}
