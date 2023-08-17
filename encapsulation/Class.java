package encapsulation;
 import java.util.Scanner;
  class User {
 String name;
    int age;
    String str;
User(String name, int age, String str) {
    this.setNameUser(name);
    this.setAgeUser(age);
    this.setStrUser(str);
}
     public void setNameUser(String num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inter your name");
         num = scanner.next();
         this.name = num;
        
     }
    
     public void setAgeUser(int theAge) {
        this.age = theAge;

    }
    public void setStrUser(String str){
this.str = str;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public int getAge() {
        return age;
    }
public String getStr(){
    return str;
}
}