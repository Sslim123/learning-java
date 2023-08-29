package javaChallenges;

import java.util.*;

public class AnagramGrouper {
    public static void main(String[] args) {

        // groupAnagrams();
        // perfectPangram();
        double build = 135.79;
        double grouper = reverse(build);
        System.out.println(" the number is:" + grouper);
    }

    static void groupAnagrams() {
        // create checker for sentence and return true if sentence anagram
        // return false is not
        String input = "The quick brown fox jumps over the lazy dog";
        char[] liner = input.toLowerCase().toCharArray();
        HashSet<Character> lines = new HashSet<>();
        for (int i = 0; i < liner.length; i++) {
            System.out.println(liner[i] + " ");
            if (Character.isLetter(liner[i])) {
                lines.add(liner[i]);
            }
        }
        System.out.println(lines.size() == 26);

    }

    static void perfectPangram() {
        String input = "Mr. Jock, TV quiz Ph.D., bags few lynx.";
        char[] liner = input.toLowerCase().toCharArray();
        HashSet<Character> lines = new HashSet<>();
        for (int i = 0; i < liner.length; i++) {
            System.out.println(liner[i] + " ");
            if (Character.isLetter(liner[i])) {
                lines.add(liner[i]);
            }
        }
        System.out.println(input.replaceAll("[a-zA-Z]+", "java"));
        System.out.println(lines.size() == 26 && input.replaceAll("[^a-zA-Z]", "").length() == 26);

    }

    static int numbersReverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;

        // String number1 = Integer.toString(number);
        // char[] num = number1.toCharArray();
        // for (int i = num.length - 1; i >= 0; i--) {
        // System.out.println(num[i]);
        // }
        // for (char number2 : num) {
        // System.out.println(" reverse number are: " + number2 + ", ");
        // }
        // return number;
    }

    public static double reverse(double build) {

        String builder = String.valueOf(build);
        System.out.println(builder);
        String[] reverse = builder.split("\\.");
        String integerPart = reverse[0];
        String decimalPart = reverse[1];
        int result0 = numbersReverse(Integer.parseInt(integerPart));
        String result = new StringBuilder(decimalPart).reverse().toString();
        return Double.parseDouble(result + "." + result0);
    }

}
