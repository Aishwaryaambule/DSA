import  java.util.*;

public class NestedSwitch {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int empID = in.nextInt();
    String dep = in.next();

    switch(empID){
      case 1:
      System.out.println("Kunal Kushwaha");
      break;

      case 2 :
      System.out.println("Rahul Rana");
      break;

      case 3:
      System.out.println("Emp Number 3");
      switch (dep) {
        case "IT":
        System.out.println("IT Department");
        break;

        case "CSE":
        System.out.println("CSE Department");
        break;
       default:
          System.out.println("No Department entered ");
      }
      break;
      default:
      System.out.println("Enter correct empID");
    }
  }
}
