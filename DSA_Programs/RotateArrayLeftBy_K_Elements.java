
import java.util.Scanner;

public class RotateArrayLeftBy_K_Elements {
    
    public static void RotateArray(int arr[],int k,int n)
    {   
        if(n == 0)
        {
            return;
        }

        k = k % n;
        if(k == 0)
        { 
            return;
        }
        

         int temp[] = new int[k];

        for(int i = 0 ;i<k ; i++)
         {
            temp[i] = arr[i];
         }

         for(int i = 0; i< n-k;i++)
         {
           arr[i] =  arr[i+k];
         }

         for(int i = 0 ; i < k;i++)
         {
            arr[n - k + i] = temp[i];
         }
         
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements: ");
        int n = sc.nextInt();

        System.out.print("Enter no of places of rotation: ");
        int k = sc.nextInt();

        System.out.print("Enter the array elements: ");

        int arr[] = new int[n];

        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

         RotateArray(arr,k,n);

       System.out.print("Rotated Array by k elements: ");

       for(int i = 0;i<n;i++)
       {
        System.out.print(arr[i]+ " ");
       }
    }
}

// OUTPUT

// Enter no of elements: 5
// Enter no of places of rotation: 2
// Enter the array elements: 1 2 3 4 5
// Rotated Array by k elements: 3 4 5 1 2 


// ************************************************************

//Optimised solution

//we can create another method reverse and solve this problem


import java.util.Scanner;

public class Prog {
    
    public static void reverse(int arr[],int start,int end)
        {
            while(start <= end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

    public static void RotateArray(int arr[],int k,int n)
    {
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{	
		Scanner sc  = new Scanner(System.in);
        System.out.print("Enter Number of Elements: ");
        int n = sc.nextInt();
        
        System.out.print("Enter number of rotation: ");
        int k = sc.nextInt();
        
        System.out.print("Enter array elements: ");
        
        int arr [] = new int[n];
        
        for(int i = 0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        RotateArray(arr,k,n);
        
        for(int i = 0 ; i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }

	}
}


// OUTPUT

// Enter Number of Elements: 5
// Enter number of rotation: 2
// Enter array elements: 1 2 3 4 5
// 3 4 5 1 2 
