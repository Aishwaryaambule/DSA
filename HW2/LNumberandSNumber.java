import java.util.*;

public class LNumberandSNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a first value");
    int First = in.nextInt();

    System.out.println("Enter a Second Number");
    int Second = in.nextInt();

    System.out.println("Enter a Third Number");
    int Third = in.nextInt();

    System.out.println("Largest number of First, Second, Third is :");
    System.out.println(Largest(First,Second,Third));

    System.out.println("Smaller number of First, second, Third, is :");
    System.out.println(Smallest(First, Second , Third));


  }

  static int Largest(int First, int Second, int Third) {
    int max = First;

    if (Second > max) {
      max = Second;
    }

    if (Third > max) {
      max = Third;
    }
    return max;
  }

  static  int Smallest(int First, int Second, int Third){
    int min = First;

    if (Second < min){
      min = Second;
    }
    if(Third < min){
      min = Third;
     }
     return  min;
  }

}
