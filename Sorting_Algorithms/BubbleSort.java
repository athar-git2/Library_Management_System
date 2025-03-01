import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int arr[], int n)
    {
        for(int i = n-1; i>=0; i--)
        {
            for(int j = 0; j<=i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    
                }
            }
        }

        System.out.print("After Sorting: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements: ");
        int n = sc.nextInt();

        System.out.print("Enter array elements: ");
        int arr[] = new int[n];

        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr,n);
    }
}


//OUTPUT**************************    //time complexity  O(N^2) 

// Enter no of elements: 5
// Enter array elements: 56 29 5 38 2
// After Sorting: 2 5 29 38 56 

//******************************** */

//Optimal Solution***********          // time complexity  O(N) 

// public static void bubbleSort(int arr[], int n)
// {
//     for(int i = n-1; i>=0; i--)
//     {
//         boolean flag = false;

//         for(int j = 0; j<=i-1;j++)
//         {
//             if(arr[j] > arr[j+1])
//             {
//                 int temp = arr[j+1];
//                 arr[j+1] = arr[j];
//                 arr[j] = temp;
//                 flag = true;
//             }
//         }
//         if(flag == false)
//         {
//             break;
//         }
//     }

//     System.out.print("After Sorting: ");
//     for(int i = 0; i < n; i++)
//     {
//         System.out.print(arr[i] + " ");
//     }
//     System.out.println();

// }
