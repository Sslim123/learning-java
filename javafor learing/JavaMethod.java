import java.util.*;

//import javax.swing.*;

public class JavaMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("java");
        list.add("list");
        System.out.println(list);
            
        
        //JavaMethod method = new JavaMethod();
        // double sqroot = Math.sqrt(34.2);
        // Scanner userNumber = new Scanner(System.in);
        // System.out.println("this is the userNumber :");
        // int userNumberOut = userNumber.nextInt(31) + 5;
        // System.out.println(userNumberOut);

        // Random random = new Random();
        // int interRandom = random.nextInt(31) + 5;
        // System.out.println("the random number is" + interRandom);
        // method.area();
        // JFrame frame = new JFrame();
        // JOptionPane.showMessageDialog(frame, interRandom);
       // int i = 2;
        //int j = 4;
        // int k = mainMethod(i, j);
        // System.out.println(k);
    }

    public static int mainMethod(int i, int j) {
        int min;
        if (i > j) {
            min = i;
        } else {
            min = j;
        }
        return min;

    }

    public void area(){ 
    

        Scanner sc = new Scanner(System.in);
        System.out.println(" inter the radius of the cercel");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println(" this is the area :" + area);
    }
    
}
