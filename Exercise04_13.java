import java.util.Scanner;

public class Exercise04_13 
{
	public static void main(String[] args) {
		String set1 = 
				"a e i o u A E I O U";
		String set2 = 
				"b c d f g h j k l m n p q r s t v w x y z ";
		String set3 = 
				"B C D F G H J K L M N P Q R S T V W X Y Z";
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String letter = input.nextLine();
		if (set1.contains(letter)) {
			System.out.println(letter+" is a vowel");
		}
		else if (set2.contains(letter) || set3.contains(letter)) {
			System.out.println(letter+" is a consonant");
		}
		else {
			System.out.println(letter+" is an invalid input");
			
		}
			
		
	}
}
