import java.util.Scanner;

class Exercises {
    public static void main(String[] args) {
        // integersNumber();
        // numbersReversed();
        // factorialNumbers();
        multiplyNumbers();

    }

    static void integersNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inter number to calculate");
        int numbers = scanner.nextInt();

        int sum = 0;
        int odd = 0;
        int even = 0;
        for (int i = 0; i <= numbers; i++) {
            if (i % 2 == 0) {
                even = (sum += i);
                System.out.println("even " + i + " number " + even);
            } else {
                odd = (sum += i);
                System.out.println("odd " + i + " number " + odd);
            }
        }
        sum = odd + even;
        System.out.println("the sum of  numbers " + sum);
        System.out.println("the sum of odd numbers " + odd);
        System.out.println("the sum of even numbers " + even);

    }

    static void numbersReversed() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" inter the number to reverse");
        int reversed = scanner.nextInt();
        int result = 0;
        // int reminder=0;
        while (reversed != 0) {
            int reminder = reversed % 10;
            result = (result * 10) + reminder;
            System.out.println(result);
            reversed = reversed / 10;
        }
        System.out.println("result is:" + result);

    }

    static void factorialNumbers() {
        int num = 5;
        int factor = 1;
        for (int i = 1; i <= num; i++) {
            factor = factor * i;
            System.out.println(factor);
        }
        System.out.println(factor);
    }

    static void multiplyNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inter your number");
        int number = scanner.nextInt();
        
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}