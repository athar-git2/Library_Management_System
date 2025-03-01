import java.util.*;
public class IsSortedArray {
    public static int isSorted(int n, int []a) {
        // Write your code here.

        for(int i = 1; i < n; i++)
        {
            if(a[i] >= a[i - 1])
            {

            }
            else{
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements: ");
        int n  = sc.nextInt();

        System.out.print("Enter array elements: ");
        int a[] = new int[n];
        for(int i = 0 ;i<n;i++)
        {
          a[i] = sc.nextInt();
        }

      int result = isSorted(n, a);

      if(result != 0)
      {
        System.out.println("Array "  +Arrays.toString(a) + " is sorted.");
      }
      else{
        System.out.println("Array " +Arrays.toString(a) +"is not sorted.");
      }
      
    }
}

//OUTPUT

// Enter no of elements: 5
// Enter array elements: 1 2 3 4 5 
// Array [1, 2, 3, 4, 5] is sorted.