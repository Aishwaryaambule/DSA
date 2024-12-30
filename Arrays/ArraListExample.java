import java.util.*;

public class ArraListExample {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // Syntax
    ArrayList<Integer> list = new ArrayList<>();

    // list.add(34);
    // list.add(31);
    // list.add(12);
    // list.add(89);
    // list.add(17);
    // list.add(34);
    // list.add(34555);
    // list.add(545);
    // list.add(145);
    // list.add(455);
    // list.add(345);

    // System.out.println(list.contains(455)); //check list contain or not
    // System.out.println(list);

    // list.set(0,99); //change the index value i.e 34 change with 99

    // list.remove(2);

    // System.out.println(list);

    // input
    for (int i = 0; i < 5; i++) {
      list.add(in.nextInt());
    }

    // get item at any index
    for (int i = 0; i < 5; i++) {
      System.out.println(list.get(i)); //pass index here, list[index] syntax will not work here 
    }

    System.out.println(list);
  }
}
