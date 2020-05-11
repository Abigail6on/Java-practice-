import java.util.Scanner;

public class Exercise06_31 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a credit card number as a long integer: ");
		long number = input.nextLong();

		if (isValid(number))
			System.out.println(number + " is valid");
		else
			System.out.println(number + " is invalid");
	}

	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		int sumOfDoubleEvenPlace = 0;
		int sumOfOddPlace = 0;
		boolean result = false;
		if (getSize(number) >= 13 && getSize(number)<= 16) {
			if (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6) || prefixMatched(number, 37)) 
				result = (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
		}
	return result;
	}

	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number){
		int sum = 0;
		String newnum = number + "";
		int a  = getSize(number);
		for (int i = a - 2; i >= 0; i -= 2) {
			sum += getDigit(Integer.parseInt(newnum.charAt(i) + "") * 2);
		}
		return sum;
		
	}

	/**
	 * Return this number if it is a single digit, otherwise, return the sum of
	 * the two digits
	 */
	public static int getDigit(int number) {
		
		if (number < 9) 
            return number; 
        return number / 10 + number % 10; 

	}

	/** Return sum of odd place digits in number */
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		String newnum = number + "";
		int a  = getSize(number);
		for (int i = a - 1; i >= 0; i -= 2) {
			sum += getDigit(Integer.parseInt(newnum.charAt(i) + ""));
		}
		return sum;
		


	}

	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		return getPrefix(number, getSize(d)) == d;
    }

	/** Return the number of digits in d */
	public static int getSize(long d) {
		String num = d + "";
		return num.length();
		
		//return Long.toString(d).length();
	}

	/**
	 * Return the first k number of digits from number. If the number of digits
	 * in number is less than k, return number.
	 */
	public static long getPrefix(long number, int k) {
		if (getSize(number) > k)  {
			String num = number + "";
			return  Long.parseLong(num.substring(0, k));
		}
		return number;


	}

}
