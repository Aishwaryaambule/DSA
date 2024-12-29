
import java.util.*;

public class Voting {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a age :");
    int age = in.nextInt();
   
    PersonAge(age);
  }

  public static void PersonAge(int age) {
    if (age >= 18) {
      System.out.println("Person is eligible for voting");
    }

    else {
      System.out.println("Person is not eligible for voting");
    }
  }

}
