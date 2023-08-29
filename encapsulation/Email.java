package encapsulation;
//Scenario . you are IT support Administrator and charge with the 

//task to create email account for new hires account
//your application should do the fellowing >..

// 1- generate email with the following syntax; ,firstNamelastName@department.com
// 2- determine th department (sale, development,accounting )if none leave blank
//3- generate random string password
//4- have set method to change password set the mailbox ,capacity and defined the alternate email address
//5- have get method to display name ,email  and mailbox  capacity 
import java.util.*;

class Email {
    String firstName;
    String lastName;
    String department;
    String emailAddress;
    String password;
    String passwords;
    String mailboxAccount = "org.uk";
    String alternativeEmail;
    int capacity;

    Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.password = getPasswordString(10);
        System.out.println(" the password is : " + password);
        setNewPassword(passwords);
        this.department = getDeterment();
        System.out.println("department is : " + this.department);

        emailAddress = this.firstName + "" + this.lastName + "@" + department + "." + this.mailboxAccount;
        System.out.println(emailAddress);
    }

    static String getDeterment() {
        System.out
                .println(
                        "the determent of hires\n1- sales,\n2- development,\n3- account,\n0- for none\n: inter your department hire");
        Scanner scanner = new Scanner(System.in);
        int hiresDepartment = scanner.nextInt();
        scanner.close();
        if (hiresDepartment == 1) {
            return "sales";
        }

        else if (hiresDepartment == 2) {
            return "development";
        } else if (hiresDepartment == 3) {
            return "accounting";
        } else {
            return " ";
        }
    }

    static String getPasswordString(int length) {

        String password = "abcdefdwertoiuylkjhgmvncxzpq@*&%$£";
        char[] passwordChar = new char[password.length()];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordChar.length);
            passwordChar[i] = password.charAt(random);
        }
        return new String(passwordChar);
    }

    public void setMailboxCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void alternativeEmail(String alternativeEmail) {
        this.alternativeEmail = alternativeEmail;
    }

    public void setNewPassword(String passwords) {
        System.out.println("inter your new pass word :");
        Scanner scanner = new Scanner(System.in);
        this.passwords = scanner.next();
        if(scanner.next() ==  ""){
    
System.out.println("please inter your password");

        }
       // System.out.println(" your new password is :" + this.passwords);
    }

    String getNewPassword() {

        return passwords;
    }

    int getMailboxCapacity() {
        return capacity;
    }

    String getAlternativeEmail() {
        return alternativeEmail;
    }

}
