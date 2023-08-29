package encapsulation;

public class Department {
    public static void main(String[] args) {
        Email emailUser = new Email("Ali", "Salem");
        System.out.println(emailUser.firstName + " " + emailUser.lastName);
        emailUser.setMailboxCapacity(199);
        System.out.println("capacity is: " + emailUser.getMailboxCapacity());
    }
}
