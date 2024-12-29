import java.util.*;

public class SUm {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a first number");
    int num1 = in.nextInt();

    System.err.println("Enter a Second Number");
    int num2 = in.nextInt();
    
    System.out.println("Sum of two Number is :" );
    SumNumber(num1, num2);
  }

  public static void SumNumber(int num1, int num2) {
    // return num1 + num2;
    System.out.println(num1 + num2);

  }
}
