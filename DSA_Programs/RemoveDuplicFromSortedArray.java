import java.util.*;
public class RemoveDuplicFromSortedArray {
    
    static int removeDuplicate(int arr[],int n)
    {
        int i = 0;
        for(int j = 1 ;j<n;j++)
        {
            if(arr[i] != arr[j])
            {
                arr[i+1] = arr[j]; 
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter no of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter elements: " + " ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

       int result = removeDuplicate(arr, n);

       for(int i = 0;i<result;i++)
       {
        System.out.print(arr[i]+ " ");
       }

       System.out.println();

       System.out.println("Count of unique elements: "+result);
    }
}


//OUTPUT

// Enter no of elements: 5
// Enter elements:  1 1 2 2 3 3
// 1 2 3 
// Count of unique elements: 3