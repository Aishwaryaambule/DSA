

public class Scope {
  public static void main(String[] args) {
     int a = 10;
     int b= 20;
     String name = "Kunal";
    
     {
        // int a = 78; 
        //already initialised outside the block in the same method , hence you cannot initialize again
          
        a = 67; //reassigh original ref variable to some other value
        System.out.println(a);

        int c = 99;
        // value initialized in this block , will remain in this block

        name = "Rahul"; //you only update not create a value
        System.out.println(name);

     }
        System.out.println(67);
        System.out.println("Rahul");

      // Block scope
      //if value is already initialize , you cannot intialize it again in same function
     
      // System.out.println(c);  
      //cannot use outside the block
  
      // Scoping in for loops
      for(int i =0;
      i < 4 ; i++){
        System.out.println(i);
        int num = 99;
        // int a = 10; //not assigh again vaue of a
      }

      System.out.println(i);

    
  }
  static  void random (int marks){
    int num = 67;
    System.out.println(num);
    System.out.println(marks);
  }
}
