package encapsulation;

import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        // findReplaceString();
        createUser();
    }

    static void createUser() {

        User user = new User();

        System.out.println("new character replaced is : " + user.getStringName());
       System.out.println("name of user: " + user.getNameUser());
        System.out.println("age of user multiply  their name : " + user.getAgeUser());

    }

    static void findReplaceString() {

        String name = "hello world";
        char[] chars = new char[14];
        name.getChars(0, 11, chars, 0);
        // System.out.println(chars);

        char[] value1 = name.toCharArray();
        int num = 0;
        for (int i = 0; i < value1.length; i++) {
            num++;
            if (value1[i] == 'j' || value1[i] == ' ') {
                value1[i] = 'n';
            }
            System.out.println(value1[i]);

        }

        System.out.println(Arrays.toString(value1));
        char value = name.charAt(6);
        System.out.println(value + " " + num);
    }

}
