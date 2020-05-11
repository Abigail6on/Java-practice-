import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise02_13 {
	
	private static DecimalFormat df2 = new DecimalFormat(".##");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount:");
		double s = input.nextDouble();
		int i=1;
		double a=s;
		double t=0;
		while(i<=6) {
			a = (a+t)*1.00417;
	    	i++;
	    	t=s;
			//System.out.println(a);
	    }
		System.out.println("After the sixth month, the account value is $"+df2.format(a));
		//System.out.printf("After the sixth month, the account value is $"+"%.2f",a);
     }
	}