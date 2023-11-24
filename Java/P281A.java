import java.util.Scanner;

/*
 * A - Word Capitalization
 */

public class P281A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		String input = scanner.nextLine();
		scanner.close();
		
		char first = Character.toUpperCase(input.charAt(0));
	    input = input.substring(1);
		System.out.println(first + input);
	}
}
