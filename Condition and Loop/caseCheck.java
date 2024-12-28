import  java.util.*;

public class caseCheck {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    
        //trim remove extra space in word
        char ch = in.next().trim().charAt(0); 
          
        if( ch >= 'a' && ch <= 'z'){
          System.out.println("Lowercase");
        }else{
          System.out.println("Uppercase");
        }

 
        // if(Character.isLowerCase(ch)) {
        //   System.out.println("Character is LowerCase"); 
        // } else {
        //   System.out.println("Character is UpperrCase");

        // }
       
        // String word = "hello";
        // System.out.println(word.charAt(2)); 
        // char return character type

       //  System.out.println(in.next().trim());

  }
}
