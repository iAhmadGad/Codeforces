import java.util.Scanner;

/*
 * A - Nearly Lucky Number
 */

public class P110A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		byte counter = 0;
		
		for(byte i = 0; i < input.length(); i++)
		{
			if(input.charAt((int) i) == '4' || input.charAt((int) i) == '7') counter++;
		}
		
		String output = (counter == 4 || counter == 7) ? "YES" : "NO";
		System.out.println(output);
	}
}
