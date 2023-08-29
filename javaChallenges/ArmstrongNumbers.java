package javaChallenges;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int pow = (int) Math.pow(4, 3);
        System.out.println(pow);
        int num = 153;
        boolean number = wholeNumber(num);
        System.out.println(number);

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
}
