import java.util.Scanner;


public class Exercise03_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year:");
		int year = input.nextInt();
		System.out.print("Enter month:");
		int m = input.nextInt();
		System.out.print("Enter the day of the month:");
		int q = input.nextInt();
		int h;
		int j = year/100;
		int k = year%100;
		h = (q+(26*(m+1)/10)+k+k/4+j/4+5*j)%7;
		if (h==0)
			System.out.print("Day of the week is Saturday");
		if (h==1)
			System.out.print("Day of the week is Sunday");
		if (h==2)
			System.out.print("Day of the week is Monday");
		if (h==3)
			System.out.print("Day of the week is Tuesday");
		if (h==4)
			System.out.print("Day of the week is Wednesday");
		if (h==5)
			System.out.print("Day of the week is Thursday");
		if (h==6)
			System.out.print("Day of the week is Friday");
		
		
		
		
	 }

}
