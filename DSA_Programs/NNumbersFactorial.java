import java.util.*;

class NNumbersFactorial
{
    
    static int factorial(int n)
    {
        if(n <= 0) return -1;
        
        int fact = 1;
        
        for(int i=1;i<=n;i++)
        {
            fact = fact * i;   
        }
        return fact;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter the number of integers n: ");
		int count  = sc.nextInt();
		
		for(int i=1;i<=count;i++)
		{   
            System.out.print("Enter the " + i + " number: ");
		    int n = sc.nextInt();
            int result = factorial(n);

		if(result != -1)
		System.out.println(result);
        else
        System.out.println("Error! Negative Number");
        }
	}
}

// OUTPUT***************************

// Enter the number of integers n: 
// 4
// Enter the 1 number: 4
// 24
// Enter the 2 number: 5
// 120
// Enter the 3 number: 6
// 720
// Enter the 4 number: -1
// Error! Negative Number



