import java.util.Scanner;

public class LargestElementinArray {
     static int largest(int arr[],int n)
    {
        int largest = arr[0];
        
        for(int i = 1 ;i< n ;i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }
        return largest;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of elements: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0 ; i <n ;i++)
		{
		    System.out.print("Enter number "+(i+1)+ ":");
		    arr[i] = sc.nextInt();
		    
		}
		
		int result = largest(arr,n);
		
		System.out.println("Largest element is "+result);

	}
}



// Enter no of elements: 5
// Enter number 1:56
// Enter number 2:76
// Enter number 3:87
// Enter number 4:67
// Enter number 5:09
// Largest element is 87