import java.util.Scanner;


/*
 * A - String Task
 */

public class P118A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();
		text = text.toLowerCase();
		
		for(byte i = 0; i < text.length(); i++)
		{
			char c = text.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') continue;
			else System.out.print("." + text.charAt(i));
		}
	}
}
