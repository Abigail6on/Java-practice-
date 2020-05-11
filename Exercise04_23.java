import java.util.Scanner;

public class Exercise04_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employer's name: ");
		String name = input.nextLine();
		System.out.print("Enter number of hours woeked in a week: ");
		double hour = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double rate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double federal = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
	    input.nextLine();
	    String state = input.nextLine();
	    System.out.print("The rate of the state is "+state+ "\n");
		double newstate = Double.parseDouble(state);
		double federalWithholding = hour*rate*federal;
		double StateWithholding = hour*rate*newstate;
		double totalDuction = federalWithholding + StateWithholding;
		double stateWithholding = hour*rate*newstate;
		double pay = hour*rate;
		double netPay = pay-totalDuction;
		System.out.print("Employee Name: "+name +"\n");
		System.out.print("Hours Worked: "+hour+"\n");
		System.out.print("Pay Rate: "+rate+"\n");
		System.out.print("Gross Pay: "+pay+"\n");
		System.out.println("Deductions: ");
		System.out.printf("  Federal Withholding (%.1f %%): $ %.2f \n",federal*100, federalWithholding);
		System.out.printf("  State Withholding (%.1f %%): $ %.2f \n",newstate*100,stateWithholding);
		System.out.printf("  Total Deduction: $%.2f \n",totalDuction);
		System.out.printf("Net Pay: $ %.2f \n",netPay);
		
	
	}

}
