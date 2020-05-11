import java.util.Scanner;

public class Exercise02_23 {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the driving distance:");
		double s = input.nextDouble();
		System.out.print("Enter miles per gallon:");
		double m = input.nextDouble();
		System.out.print("Enter price per gallon:");
		double p = input.nextDouble();
		Double a = s/m*p;
		System.out.printf("The cost f driving is $"+"%.2f",a);
	
	}
}
