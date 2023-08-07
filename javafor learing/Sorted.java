import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        // Sorted sorted = new Sorted();
        // sorted.revenueProduct();
        //threeNumbers();
        //promptUser();
        //studentAverage();
        naturalNumber();
    }

    public void revenueProduct() {
        double discount = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("inter your product  price ");
        Double price = scanner.nextDouble();
        System.out.println("inter your product quantity ");
        int quantity = scanner.nextInt();
        double revenue = price * quantity;
        if (revenue > 5000) {
            discount = revenue / 10;
        }
        double netRevenue = revenue - discount;
        System.out.println("the revenue is:" + revenue);
        System.out.println(" discount is : " + discount);
        System.out.println("the netRevenue is : " + netRevenue);

    }

    static void threeNumbers() {
        int number1;
        int number2;
        int number3;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" inter three number1");
        number1 = scanner.nextInt();
        System.out.println(" inter three number2");
        number2 = scanner.nextInt();
        System.out.println(" inter three number3");
        number3 = scanner.nextInt();

        int maxAndMin = Math.max(Math.max(number1, number2), number3);

        System.out.println("the  greater number is : " + maxAndMin);

    }

    static void promptUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inter your number please");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("the number is positive: " + number);
        } else if (number < 0) {
            System.out.println("the number is negative:  " + number);

        } else {
            System.out.println("the number is 0:  " + number);

        }
    }
    static  void studentAverage(){
        Scanner student = new Scanner(System.in);
        System.out.println("inter the first  student subject mark");
        int count1 = student.nextInt();
        System.out.println("inter  the second student subject mark");
        int count2 = student.nextInt();
        System.out.println("inter  the third student subject mark");
        int count3 = student.nextInt();
        int countAveraged = count1 + count2 + count3;
        System.out.println("the average of student subject " +countAveraged);
    char grade;
    if(countAveraged >= 90){
        grade = 'A';
    }
    else if(countAveraged >= 80){
        grade = 'B';
    }
    else if(countAveraged >= 70){
        grade = 'C';
    }
    else if(countAveraged >= 60){
        grade = 'D';
    }
    else if(countAveraged >= 50){
        grade = 'E';
    }
    else{
        grade = 'F';
    }
    System.out.println("the grade of student  " + grade);
    
    
    }
    static void naturalNumber(){
        int sum= 0;
        int n = 10;
for (int i = 1; i <= n; i++){
     sum += i;
     System.out.println( " the number are : " + i);
}
System.out.println("the sum of natural numbers" + sum);
    }
    

}
