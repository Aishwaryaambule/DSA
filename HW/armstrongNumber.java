import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Input the number to check
        System.out.println("Enter the number to check if it's an Armstrong number:");
        int num = in.nextInt(); // Input number
        
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
    }
    
    // Method to check if the number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0, digits = 0;
        
        // Calculate number of digits
        while (num > 0) {
            digits++;
            num /= 10;
        }
        
        num = originalNum; // Reset num to original number
        
        // Calculate the sum of digits raised to the power of 'digits'
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        
        return sum == originalNum; // If sum equals the original number, it's an Armstrong number
    }
}
