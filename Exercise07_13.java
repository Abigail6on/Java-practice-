import java.util.Arrays;

public class Exercise07_13
{
	public static void main(String[] args)
	{
		int [] arr = {1, 2, 3, 10};
		boolean inArray = true;
		int randValue = 0;
		//randValue = getRandom(arr);
	
		
		while (inArray) {
			randValue = getRandom(arr);
			//System.out.println("The Random Number is:" + randValue);
			//randValue = getRandom(arr);
			if(!isInArray(randValue, arr)) {
				break;
			
			}
		}
		System.out.println("The Random Number is: " + randValue);
		//if(inArray) System.out.println("getRandom() returned value "+randValue+" which is in "+ Arrays.toString(arr));
		//else System.out.println("getRandom() returned 10000 values which did not include " + Arrays.toString(arr));
	}

	// Generate a random number between 1 and 54 excluding numbers
	public static int getRandom(int[] numbers){
		int randValue = 0;
		randValue = 1 + (int)(Math.random() * 54);
		return(randValue);
		
	}
	
	// Checks if int value is in the array
	public static boolean isInArray(int value, int [] array)
	{
		boolean retValue = false;
		
		for(int i =0 ; i < array.length && !retValue; i++)
			if(value == array[i]) retValue = true;
		
		return(retValue);
	}
}
