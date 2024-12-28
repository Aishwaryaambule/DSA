import java.util.*;

public class Condition {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    /*
        Syntax of if statements:
        if(boolean expression T or F ){
        //body
        }else {
        //do this
        }
 */

      int salary = 24000;
      // if(salary>10000){
      //   salary = salary + 2000;
      // }
      // else{
      //   salary = salary + 1000;
      // }

     
      //multiple if-else
      if(salary > 10000){
        salary += 2000; //salary = salary + 2000;
      } else if (salary> 20000)
      {
        salary += 3000;

      }
      else{
        salary += 1000;
       }
      System.out.println(salary);

      
      int a = 45;
      int b = 12;

     // if(a == 45 && b == 12){
     //   System.out.println("Hello World");
    // }

   //  if(a == 45 || b == 10){
   //   System.out.println("Hello World");
   // }

 //   if ( a != 35 ){
 //     System.out.println("Hello World");
 //   }
  }

}
