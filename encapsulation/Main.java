package encapsulation;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Main {
    public static void main(String[] args) {
        createString();
        //createUser();
    }
       static void createUser(){
            
        User user = new User("salem", 12, "str");
        user.setNameUser("ALICE");
        user.setStrUser("John" + " *** " + "salem");
        user.setAgeUser(45);

        System.out.println(user.getName() + " " + user.getStr() + " " + user.getAge());
    }

    static void createString() {
       
        String name = "hello world";
        char[] chars = new char[14];
        name.getChars(0 , 11, chars, 0);
        System.out.println(chars);
        
        char[] value1 = name.toCharArray();
        int num = 0;
        for (int i = 0; i < value1.length; i++) {
            num++;
        if(value1[i] == 'j' || value1[i] == ' ') {
            value1[i] = 'n';
           // value1[i] = 'f';
            System.out.println(value1[i]);
            }
            
            
        }
       
        System.out.println(Arrays.toString(value1));
        char value = name.charAt(6);
        System.out.println(value + " " + num);
    }
}
