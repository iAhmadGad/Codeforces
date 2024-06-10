import java.util.Scanner;

/* 
 * 59A - Word
 */

public class P59A {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine(), output = "";
		scanner.close();
		
		byte counter = 0;
		
		for(char c : input.toCharArray())
		{
			if(Character.isLowerCase(c)) counter++;
		}
		
		if(counter < input.length() - counter) output = input.toUpperCase();
		else output = input.toLowerCase();
		
		System.out.println(output);
	}
}
