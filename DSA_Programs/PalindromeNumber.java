
import java.util.Scanner;

public class PalindromeNumber {
    
    public static boolean isPalindrome(int n)
    {
        int reverse = 0;
        int original = n;

        if(n <= 0){
            return false;
        }

        while(n > 0)
        {
           int digit =  n % 10;

           reverse = reverse * 10 + digit;

           n = n /10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        sc.close();

        System.out.println("Is Palindrome? " +isPalindrome(n));
    }
}


//OUTPUT**********************

// Enter a number: 101
// Is Palindrome? true

// Enter a number: 324
// Is Palindrome? false