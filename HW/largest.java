import java.util.*;

public class largest{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
   
    System.out.println("Enter a first number :");
    int num1 = in.nextInt();
  
    System.out.println("Enter a second number :");
    int num2 = in.nextInt();
   
    if(num1 > num2){
      System.out.println(num1);
    }
   else {System.out.println(num2);}
      
  }
  
}
