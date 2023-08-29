package encapsulation;

import java.util.Arrays;
import java.util.Scanner;

class User {
    private String name;
    int age;
    char[] reverse;
    String names = " salem attacks";
    int charCount;
    String nameChar;
    String replace;
    int length;

    User() {
        setCharacterArray(nameChar);
        setNameUser(name);
        setAgeUser(age, name);
        setStringName(names, replace);
    }

    public void setCharacterArray(String nam) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inter your string name");
        nam = scanner.next();
        String reverseName = nam;
        int count = 0;
        char[] reverse = new char[nam.length()];
        for (int i = nam.length() - 1; i >= 0; i--) {
            reverse[count] = nam.charAt(i);
            count++;
        }
        System.out.println(" the number of array: " + count + " your name is : (" + reverseName
                + ") and your reverse name is:" + Arrays.toString(reverse));

    }

    public void setStringName(String names, String replace) {
        for (int i = 0; i < names.length(); i++) {
            if (names.charAt(i) == 'm') {
                replace = names.replace('m', 'n');
                System.out.println("replace char : " + replace);
            }

        }
        System.out.println("replace new name: " + names.replace("salem", "dayfan"));
        this.replace = replace;

    }

    public String getStringName() {
        return replace;

    }

    public void setNameUser(String num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inter your name");
        num = scanner.next();
        scanner.close();
       this.name = num;

    }

    public String getNameUser() {
        return name;
    }

    public void setAgeUser(int theAge, String name) {
        length = name.length();
        System.out.println("the length of the name is: " + length);

    }

    public int getAgeUser() {
        return length * name.length();
    }

}