import java.util.Scanner;

public class Exercise07_31
{
	public static void main(String[] args)
	{
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
		System.out.print("The merged list is ");

		int[] list3 = merge(list1, list2);

		for (int i = 0; i < list3.length; i++)
			System.out.print(list3[i] + " ");
		
		input.close();
	}

	public static int[] merge(int[] list1, int[] list2) {
		int[] listnew = new int[list1.length + list2.length];
		for (int i = 0;i< list1.length;i++) {
			listnew[i] = list1[i];
			
			
			}
		for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
			listnew[j] = list2[i];}
		sort(listnew);
		
		return listnew;
		

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
