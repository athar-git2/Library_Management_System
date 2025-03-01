import java.util.*;
public class SecondLargestElementinArray {
    
    static int sLargest(int arr[]){

        int n = arr.length;
        int largest = arr[0];
        int slargest = -1;
        for(int  i =0 ;i<n;i++)
        {
            if(arr[i] > largest){
                
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > slargest)
            {
                slargest = arr[i];
            }
        }
        return slargest;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements: ");

        int num = sc.nextInt();

        int arr[] = new int[num];

        System.out.print("Enter array elements: ");
        for(int i = 0 ;i< num ;i++)
        {
            arr[i] = sc.nextInt();
        }

       System.out.println("Second Largest element in "+Arrays.toString(arr) + " is " +sLargest(arr));
    }
}


// Enter no of elements: 5
// Enter array elements: 2 8 9 5 7
// Second Largest element in [2, 8, 9, 5, 7] is 8