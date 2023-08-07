import java.util.ArrayList;

class ArrayLists {
  public static void main(String[] args) {
    ArrayLists list = new ArrayLists();
    // list.addArrayList();
    list.test();
  }

  public void addArrayList() {

    ArrayList listOfArray = new ArrayList();
    listOfArray.add("salem");
    listOfArray.add("salm");
    listOfArray.add("saem");
    System.out.println("listOfArray" + listOfArray);
    System.out.println("listOfArray" + listOfArray.size());
    listOfArray.add(2, "Ali");

    System.out.println("listOfArray" + listOfArray);
    System.out.println("listOfArray" + listOfArray.size());
    listOfArray.removeAll(listOfArray);
    System.out.println("listOfArray is removed" + listOfArray);

  }

  public void test() {
    char[] newChar = new char[] { 'a', 'b', 'd', 'e', 'f' };
    String merge = "";
    for (int i = 0; i < newChar.length; i++) {
      merge += newChar[i];
      System.out.println(newChar[i]);
    }
    System.out.println(merge);
  }
}
