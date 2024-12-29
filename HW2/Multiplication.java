
import java.util.Scanner;

public class Multiplication {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a first number");
    int num1 = in.nextInt();

    System.out.println("Enter a Secong number");
    int num2 = in.nextInt();
    
    System.out.println("Multiplication of two no :");
    MultiplyNo(num1, num2);
  }

  static void MultiplyNo(int num1, int num2) {
    System.out.println(num1 * num2);
  }
}
