import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_27 {
	public static void main(String[] args) {
		Scanner input = new java.util.Scanner(System.in);

		// Enter values for list1
		System.out.print("Enter list1: ");
		int size1 = input.nextInt();
		int[] list1 = new int[size1];

		for (int i = 0; i < list1.length; i++)
			list1[i] = input.nextInt();

		// Enter values for list2
		System.out.print("Enter list2: ");
		int size2 = input.nextInt();
		int[] list2 = new int[size2];

		for (int i = 0; i < list2.length; i++)
			list2[i] = input.nextInt();
		

		if (equals(list1, list2))
		{
			System.out.println("Two lists are identical");
		} 
		else
		{
			System.out.println("Two lists are not identical");
		}
		
		input.close();
	}

	public static boolean equals(int[] list1, int[] list2) {
		//System.out.println(list1.length + " "+list2.length);
		if (list1.length != list2.length) 
			return false;
		//System.out.println(list1 + " "+list2);
		sort(list1);
		sort(list2);
		//System.out.println(list1 + " "+list2);
		for (int i = 0; i<list1.length; i++) {
			//System.out.println(list1[i] + ""+list2[i]);
			if (list1[i]!=list2[i])
				return false;			
		}
		return true;
		
		
	}
	

	
	public static void sort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int min = list[i];
			int minIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < min) {
					min = list[j];
					minIndex = j;
				}
			}

			if (minIndex != i) {
				list[minIndex] = list[i];
				list[i] = min; 
			}
		}
	}
}




	
		
