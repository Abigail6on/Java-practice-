import java.util.Arrays;
import java.util.Scanner;

public class Exercise08_27
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		final int ROW_SIZE = 3;
		final int COLUMN_SIZE = 3;
		System.out.println("Enter a 3 by 3 matrix row by row: ");
		double[][] m = new double[ROW_SIZE][COLUMN_SIZE];

		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[0].length; j++)
				m[i][j] = input.nextDouble();

		double[][] result = sortColumns(m);

		for (int i = 0; i < result.length; i++)
		{
			for (int j = 0; j < result[0].length; j++)
				System.out.print(result[i][j] + " ");
			System.out.println();
		}
		
		input.close();
	}

	public static double[][] sortColumns(double[][] m)  {
		double[][] n = new double[m.length][m[0].length];
		copyMatrix(m, n);
		for (int col = 0; col < n.length; col++) {
			for (int row = 0; row < n.length - 1; row++) {
				double min = n[row][col];
				int index = row;
				for (int j = row + 1; j < n.length; j++) {
					if (min > n[j][col]) {
						min = n[j][col];
						index = j;
					}
				}
				if (index != row) {
					n[index][col] = n[row][col];
					n[row][col] = min;
				}
			}
		}
		return n;
		
		
	}
	public static void copyMatrix(double[][] original, double[][] copy) {
		for (int i = 0; i < original.length; i++) {
			for (int j = 0; j < original[i].length; j++) {
				copy[i][j] = original[i][j];
				//could only copy one character at a time
			}
		}
	}
}

