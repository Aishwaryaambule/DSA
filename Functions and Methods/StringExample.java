import  java.util.*;

public class  StringExample{
  public static void main(String[] args) {
  //     String message = greet();
  //     System.out.println(message);

    Scanner in = new Scanner(System.in);
    System.out.println("Enter a name");
    String naam = in.next();
   String personalized  = myGreet(naam);
   System.out.println(personalized);
}

static String myGreet(String name){
  String message = "Heyy" + name;
  return message;
}


  // static  String greet(){
  //   String greeting = "How are you Aish";
  //   return  greeting;
  // }
}