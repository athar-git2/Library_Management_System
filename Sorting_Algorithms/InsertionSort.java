import java.util.Scanner;

public class InsertionSort{

    public static void insertionSort(int arr[],int n)
    {
        for(int i = 0; i <= n-1; i++)
        {
            int j = i;

            while(j > 0 && arr[j-1] > arr[j]){

                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.print("After Sorting: ");
		for(int i = 0;i < n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no of elements: ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}

		insertionSort(arr,n);
		
	}
}

// OUTPUT***********************  

// Enter no of elements: 5
// 34 78 65 2 15
// After Sorting: 2 15 34 65 78 

//Time Complexity:

//Worst Case - O(N^2)
//Best case - for already sorted array - O(N).
