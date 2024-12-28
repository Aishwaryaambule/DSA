import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    // String fruit = in.next();

      // switch(fruit){
      //   case "Mango":
      //     System.out.println("King of a Fruit");
      //     break;
      //   case "Apple":
      //     System.out.println("A sweet red fruit");
      //     break;
      //   case "Orange":
      //     System.out.println("Round fruit");
      //     break;
      //   case "Grapes":
      //     System.out.println("Small fruit");
      //     break;
      //     default:
      //     System.out.println("Please enter a valid fruit");
      // }
    

      // int day = in.nextInt();
      // switch (day) {
      //   case 1: System.out.println("Monday");
      //   break;
      //   case 2: System.out.println("Tuesday");
      //   break;
      //   case 3: System.out.println("Wednesday");
      //   break;
      //   case 4: System.out.println("Thursday");
      //   break;
      //   case 5: System.out.println("Friday");
      //   break;
      //   case 6: System.out.println("Saturday");
      //   break;
      //   case 7: System.out.println("Sunday");
      //   break;
      //   default:
      //   System.out.println("Please enter a valid day");
      // }

      
      int day = in.nextInt();
      switch (day) {
        case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
        case 6, 7 -> System.out.println("Weekends");
        default -> System.out.println("Please enter a valid day");
      }
  }
}
