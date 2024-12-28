import java.util.*;

public class ClaculatorProgram {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int ans = 0;
     //Take input from user till user does not press X or x

    while(true) {
      //take the operator as input

      System.out.println("Enter a operator : ");
      char op = in.next().trim().charAt(0);
      if(op == '+' || op == '-' || op == '*' || 
      op == '/' || op == '%') {

        //input two numbers
        System.out.println("Enter two numbers");
        int num1  = in.nextInt();
        int num2  = in.nextInt();

        if(op == '+'){
          ans = num1 + num2;
        }

        if(op == '-'){
          ans = num1 - num2;

        }

        if(op == '*'){
          ans = num1 * num2;
        }

        if(op == '/'){
          if(num2 != 2){
            ans = num1 * num2;
          }
        }
        System.out.println(ans);
        
      } else if (op == 'X' || op == 'x'){
        break;
      } else {
        System.out.println("Invalid Operator");
      }
    }
  }
}