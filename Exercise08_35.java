import java.util.Scanner;

public class Exercise08_35
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of rows in the square matrix: ");
		int size = input.nextInt();

		int[][] m = new int[size][size];

		System.out.println("Enter the matrix row by row: ");

		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++)
				m[i][j] = input.nextInt();

		int[] result = findLargestBlock(m);

		System.out.println("The maximum square submatrix is at (" + result[0]
				            + ", " + result[1] + ") with size " + result[2]);
		
		input.close();
	}

	/*
	 * Strategy:(DID NOT USE IN THIS EXAMPLE)
	 * 1) Create 2-D array, count, the size of m
	 * 2) For each position, count the number of rows in the block at that position
	 *      a) start at lower right corner add work back up to upper left corner
	 *      b) Use dimension of lower right block to search rows/columns for 1's
	 * 3) Search the count matrix for the maximum value - gives # of rows and position. 
	 */
	public static int[] findLargestBlock(int[][] m){
		int submatrix []= new int [3];
		//define the integer array of size of 3
		for (int i=0; i<m.length;i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1) {
					//get the size of each matrix after the chaRacter that is 1
					int size = getSubMatrixSize(i, j, m);
					if (size > submatrix[2]) {
						submatrix[0] = i;
						submatrix[1] = j;
						submatrix[2] = size;
					}	
				}
			}
		}
		return submatrix;
		//the submatrix includes the location and size of submatix that are all 1s.
	}
	public static int getSubMatrixSize(int row, int column, int[][] m) {
		int result = 0;
		for (int i = row; i < m.length; i++) {
			for (int j = column; j < m[i].length; j++) {
				for (int size = 1; size < m.length; size++) {
					if (!isAll1s(row, column, size, m)) {
						if (result < (size - 1)) {
							result = size - 1;
							//goes to the previous size
						}
						break;
						//only breaks the inner loop (the current loop)
					}
				}
			}
		}
		return result;
	}
	
	public static boolean isAll1s(int row, int column, int size, int[][] m) {
		for (int i = row; i < row + size; i++) {
			if (i >= m.length) {
				return false;
				//special case for the last character
			}
			for (int j = column; j < column + size; j++) {
				if (j >= m[i].length) {
					return false;
					//special case for the last character
				}
				if (m[i][j] != 1) {
					return false;
				}

			}
		}
		return true;
	}
	
}
