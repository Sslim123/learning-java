import java.util.Scanner;

class Test {
    // Enter the scores of 10 students by using a Scanner object
    // Display the scores that you entered
    // Calculate the average of the scores that you entered
    public static void main(String[] args) {
        Test test = new Test();
        // test.createApp();
        // test.forScanner();
        test.theSmallest();
    }

    public void createApp() {
        long[] arrayOfScore = new long[] { 10, 20, 30, 40, 50, 60, 70, 80, 100 };
        // holder of input scanner
        // int averageScore;
        long average = 0;
        double score = 0;
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("inter your score");
        // int holderScore = scanner.nextInt();
        for (int i = 0; i < arrayOfScore.length; i++) {
            average = average + arrayOfScore[i];
            score = average / arrayOfScore.length;
            // System.out.println("inter anther score"+ arrayOfScore[i]);
            // i = scanner.nextInt();
            // averageScore = arrayOfScore[i] + holderScore;
            System.out.println("the average score are: " + i + " " + average + " " + score);

        }
        System.out.println("the score of average are: " + average);
    }

    public void forScanner() {
        int count[] = new int[4];
        Scanner sc = new Scanner(System.in);
        // System.out.print("inter the number of scaaner:");
        // int score = sc.nextInt();
        for (int i = 0; i < count.length; i++) {
            System.out.print(" print the value of:" + i);
            count[i] = sc.nextInt();

        }
        for (int i = 0; i < count.length; i++) {
            System.out.println("the value of count :" + i + " " + count[i]);
        }
    }

    public void theSmallest() {
        int[] smaller = new int[] { 11, 2,1, 31, 4, 53, 66, 3, 7, 8 };
        int min = smaller[0];
        for (int i = 1; i < smaller.length; i++) {
            if (smaller[i] < min) {
              int num =   (min = smaller[i]);
              System.out.println(num);
            }
        }

        //System.out.println(min);
    }
}