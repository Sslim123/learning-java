import java.util.*;
import java.util.Arrays;
public class LearningArray {
    public static void main(String[] args){
        String[] array = {"salem", "Alice", "Bob"};
        String arrString = "";
ArrayList<String> str = new ArrayList<>(Arrays.asList("salem", "Alice", "Bob"));
  str.add(0, "alalem");
  System.out.println(array[1]);
  for(int i=0; i<array.length; i++){ 
    arrString += array[i];
    System.out.println(i);
  }

System.out.println(str +" "+arrString + "  "+ str.size());
}
}
