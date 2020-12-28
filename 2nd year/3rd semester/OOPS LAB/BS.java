
import java.util.*;

public class BS {
   static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
 		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n = scanner.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter the elements for  array");
		for(int i=0;i<n;i++)
			arr[i]=scanner.nextInt();
		scanner.close();
		 bubbleSort(arr);
		System.out.println("Sorted array");
		 printArray(arr);
	}
}
