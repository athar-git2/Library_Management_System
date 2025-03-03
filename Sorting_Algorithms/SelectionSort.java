import java.util.Scanner;

public class SelectionSort {
	public static void selectionSort(int arr[], int n) {
		// Write your code here.

		for(int i = 0;i<n-1;i++)
		{
			int min = i;

			for(int j = i+1;j<n;j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
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

		selectionSort(arr, n);
		
	}
}

//OUTPUT*******************    //time complexity  O(N^2) 

// Enter no of elements: 5
// 23 98 24 56 12
// After Sorting: 12 23 24 56 98 
