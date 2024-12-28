import  java.util.*;

public class loops {
  public static void main(String[] args) {

    /*
       Syntax of For loop:
       for(initialisation ; condition ; increment/decrement){
        // body
       } 
     */
    
     // Q: Prime numbers from 1 to 5
    //  for (int num= 1; num<=5 ; num++){
    //  System.out.println(num);
    //  }

   //  print number from 1 to n 
   Scanner in = new Scanner(System.in);
  //  int n = in .nextInt();
  //  for(int num = 1; num <= n; num++){
  //   System.out.println(num);
  //  }

   /*
    Syntax for While Loop
      
      while(condition){
        //body
       }
    */

   //Print number from 1 to 5 (in while loop)
      //  int num = 1;
      //  while (num <= 5) {
      //   System.out.println(num);
      //   num += 1; //num++
      //  }

       /*
          Do while loop  {loop execute at least one}

    Syntax=> do{
                //body
               } while(condition);
      */

       int n = 1;
      //  do { 
      //      System.out.println("Hello World");
      //      n++;
      //  } 
      //  while (n <= 5);

      do { 
        System.out.println("Hello World");
    } 
      while (n != 1);
}
}
