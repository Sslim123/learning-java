public class LearningString
 {
    public static void main(String[] args) {

        LearningString mainString = new LearningString();
        mainString.area();
        mainString.subMethod();
    }

    public void area() {
        String str = "Salem-ala-lem";
        int firstChar = str.indexOf('l');
        int secondChar = str.indexOf('l', firstChar + 1);
        int secondChars = str.indexOf('l', firstChar + 2);

        System.out.println("index of string is " + str.charAt(4));
        System.out.println("first char is " + firstChar + " " + secondChar + "" + secondChars);

    }
    public void subMethod(){
        String compare = "al"; 
        String sub = "hello world!";
        //String compareString = sub.compareTo(compare);
        System.out.println("the compare is" + sub.compareTo(compare));
        String str = sub.replace("l", "L");
        String firstSub = sub.substring(1, 5);
        String secondSub = sub.substring(5, 10);
        String thirdSub = sub.substring(7);
        System.out.println(firstSub+ " " + str + " " + secondSub+ " " + thirdSub);
    }
}
