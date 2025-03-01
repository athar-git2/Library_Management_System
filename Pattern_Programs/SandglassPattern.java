// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *


public class SandglassPattern {
    
    public static void main(String[] args) {
        
        int n = 5;

        for(int i = 1 ; i<=n;i++)
        {
            for(int j = 1; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =n-1;i>=0;i--)
        {
            for(int j = i; j >=0; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// public class Pattern10 {
    
//     public static void main(String[] args) {
        
//         int n =5;

//         for(int i =1 ; i<=n;i++)
//         {
//             System.out.println("*".repeat(i));
//         }

//         for(int i =n-1;i>=0;i--)
//         {
//             System.out.println("*".repeat(i));
//         }
//     }
// }
