import java.util.Scanner;

public class LeftRotateArrayByOne {
    
    public static int[] rotateArray(int[] arr,int n)
    {
        
        int temp = arr[0];
        
        for(int i = 1; i<n; i++)
        {
            arr[i-1] = arr[i];
        }
        
        arr[n-1] = temp;
        
    return arr;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of elements: ");
		int n = sc.nextInt();
		
		System.out.print("Enter the array elements: ");
		
		int arr[] = new int[n];
		
		for(int i = 0; i<n; i++)
		{
		    arr[i] = sc.nextInt();
		}
		
		int[] result = rotateArray(arr,n);
		
        System.out.print("Array elements after rotating: ");
		for(int i = 0;i<n;i++)
		{
		    System.out.print(result[i] + " ");
		}
	}
}


//OUTPUT

// Enter no of elements: 5
// Enter the array elements: 1 2 3 4 5
// Array elements after rotating: 2 3 4 5 1 