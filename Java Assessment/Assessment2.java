import java.util.*;

public class Assessment2 {
    public static void main(String[] args) {
         
        // splitArray();
        castingJava();
        long[] calculationsTime = { 23, 343, 200, 100, 80, 54, 123, 600, 400 };
        Arrays.sort(calculationsTime);
        System.out.println(calculationsTime);
        for (long time : calculationsTime) {
            // System.out.print(time + "ms " );
        }
    }

    static void splitArray() {
        int[] array = { 2, 4, 1, 6, 5, 3, 12, 9, 8, 7 };
        Arrays.sort(array);

        ArrayList<Integer> array1 = new ArrayList<>();
        // int[ ] array1 = new int[];
        ArrayList<Integer> array2 = new ArrayList<>();
        // ArrayList<Integer> array3 = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array1.add(array[i]);
            } else if (array[i] % 2 == 1) {
                array2.add(array[i]);
            }

        }
        ArrayList array3 = new ArrayList();
        for (int i = 0; i < array1.size(); i++) {
            array3.add(array1);
        }
        System.out.println(array3);

        // for(int i = 0; i < array2.size(); i++){
        // array3 = array2;
        // }

    }

    static void castingJava() {
        int[] array = { 2, 4, 1, 6, 5, 123, 3, 12, 9, 8, 7, 11 };
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            // System.out.print(" " + array[i]);
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    number = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = number;
                }
            }
        }
        for (int num : array) {
            System.out.println(num);
        }
        System.out.println("number is  " + number);
        // byte num;
        // double num2 = 127;
        // num = (byte) num2;
        // System.out.println(num);
        // short a, b, c;
        // a = 4;
        // b = 6;
        // c = (short) (a + b);
        // System.out.println(c);
    }
}
