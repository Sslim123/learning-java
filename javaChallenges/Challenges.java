package javaChallenges;

import java.util.*;

class Challenges {
    public static void main(String[] args) {

        // setChallengeString();
        // findWord();
        // boolean outPut = returnBoolean();
        // System.out.println(outPut);
        // numberTimes();
        // anagramWords();
        separateAnagramArray();
    }

    public static void setChallengeString() {
        String words = "the life is easy !";
        // split words
        String[] challenge = words.split(" ");
        for (int i = challenge.length - 1; i >= 0; i--) {

            System.out.print(challenge[i] + " ");
        }
        System.out.println(challenge);
        for (String str : challenge) {
            System.out.print(str);

        }

    }

    static void findWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inter your sentence");
        String word = scanner.nextLine();
        String[] theWord = word.split(" ");
        int count = 0;
        for (int i = 0; i <= theWord.length; i++) {
            count += i;
            if (count == 3) {
                System.out.println("the word is : [" + theWord[i] + "]  index : " + i);
            }
        }
        scanner.close();
    }

    static boolean returnBoolean() {
        String theWord = "hello world";
        String startInput = "hello";
        boolean result = theWord.startsWith(startInput);

        return result;

    }

    static void numberTimes() {
        String theString = "iam oyu hello hello to hello to world";
        String theWord = "hello";

        int count = 0;
        int lastIndex = 0;
        while (lastIndex != -1) {
            lastIndex = theString.indexOf(theWord, lastIndex);
            if (lastIndex != -1) {
                count++;

                lastIndex += theWord.length();
            }
        }
        System.out.println(count);
    }

    public static void anagramWords() {
        String firstWord = "salem";
        String secondWord = "selam";
        char[] strChar2 = secondWord.toCharArray();
        Arrays.sort(strChar2);
        char[] strChar3 = firstWord.toCharArray();

        Arrays.sort(strChar3);

        System.out.println(Arrays.equals(strChar2, strChar3));
    }

    static void separateAnagramArray() {
        String[] input = { "tar", "mteas", "rat", "art", "meats", "steam" };
        HashMap<String, ArrayList<String>> output = new HashMap<String, ArrayList<String>>();
        for (String key : input) {
            char[] value = key.toCharArray();
            Arrays.sort(value);
            String listed = new String(value);
            output.putIfAbsent(listed, new ArrayList<>());
            output.get(listed).add(key);
         //   System.out.println(listed);
        }
        System.out.println(output.values());

    }
}