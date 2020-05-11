import java.util.Scanner;
public class Exercise05_45 {

	public static void main(String[] args) {
		System.out.print("Enter ten numbers: ");
		double array[]=new double[10];
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<10;i++){
		array[i]=scanner.nextDouble();
		}
		System.out.print("The mean is ");
		//System.out.print(array[1]);
		double sum = 0;
		double tempSquare = 0;
		double square = 0;
		double dev = 0;
		double sumSquare = 0;
		double average = 0;
		for (int i = 0; i < array.length; i++) {
		sum=sum+array[i];
		average = sum/array.length;
		tempSquare = Math.pow(array[i],2);
		square = square + tempSquare;
		sumSquare = Math.pow(sum, 2);
		dev = Math.pow ((square-sumSquare/10)/(10-1), 0.5);
		//System.out.println(dev);
		//System.out.println(square);
		//System.out.println(sumSquare);
		//System.out.println(array[i]);
		
		
		}
		System.out.printf("%.2f \n",average);
		System.out.print("The standard deviation is ");
		System.out.printf("%.5f",dev);
		
	

	     
		
		
	}
	}	     
