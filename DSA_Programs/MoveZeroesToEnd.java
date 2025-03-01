//Optimal Solution

import java.util.Scanner;

public class MoveZeroesToEnd
{
    public static int[] moveZeroes(int[] arr,int n)
    {
        int j = -1;

        //place the pointer j: 
        //if there is no any 0 present in array
        //return the non zero array elements
        //if found zero assign the index of 0 to j
        
        for(int i =0;i<n;i++)
        {
            if(arr[i] == 0)
            {
                j = i;
                break;
            }
        }

            if(j == -1) return arr;
        
            //0 found at j index
            //i will always start from j+1 index

        for(int i = j+1;i<n;i++)
        {
            if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
                j++;
            }
            
        }
        return arr;
    }
     

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements: ");
        int n = sc.nextInt();

        System.out.print("Enter the array elements: ");

        int arr[] = new int[n];

        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int[] result = moveZeroes(arr, n);

        for(int i = 0; i<n;i++)
        {
            System.out.print(result[i] + " ");
        }

    }

}

// OUTPUT

// Enter no of elements: 7
// Enter the array elements:  1 2 3 0 3 5 0
// 1 2 3 3 5 0 0 


//***********************BRUTE FORCE APPROACH**********************

// import java.util.ArrayList;

// public class MoveZeroesToEnd {
//         public static int[] moveZeros(int n, int []a) {
//         // Write your code here.

//         ArrayList<Integer> temp = new ArrayList<>();

//         for(int  i = 0;i<n;i++)
//         {
//             if(a[i] !=0)
//             {
//                 temp.add(a[i]);
//             }
//         }

//         int j = temp.size();

//         for(int i=0;i<j;i++)
//         {
//            a[i] = temp.get(i);
//         }

//         for(int i =j ;i<n;i++)
//         {
//             a[i] = 0;
//         }
//         return a;

//     }
// }