import  java.util.*;

public class operator {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter a first number :");
     double num1 = in.nextDouble();
    
     System.out.println("Enter a second number");
     double num2= in.nextDouble();

     System.out.println("Enter an opertor(+,-,*,/)");
     char operator = in.next().charAt(0);

     if(operator == '+'){
      System.out.println(num1 + num2);
     }
     else if (operator == '-'){
      System.out.println(num1 -num2);
     }
      else if(operator == '*'){
        System.out.println(num1 * num2);
      }
     
      else if(operator == '/'){
        System.out.println(num1 / num2);
      }
     }
}
