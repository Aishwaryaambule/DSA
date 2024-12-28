import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Input the string to check
        System.out.println("Enter the string to check if it's a palindrome:");
        String input = in.nextLine().replaceAll("\\s", "").toLowerCase();  // Remove spaces and convert to lowercase
        
        if (isPalindrome(input)) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }
    }

    // Method to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        int length = str.length(); //Get the length of a string
        for (int i = 0; i < length / 2; i++) { // Loop from the start to the middle of the string

            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;  // If characters do not match
            }
        }
        return true;  // If all characters match
    }
}
