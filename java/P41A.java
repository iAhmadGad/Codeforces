import java.util.Scanner;

/*
 * A - Translation
 */

public class P41A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next(), t = scanner.next();
		boolean correct = true;
		for(byte i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != t.charAt(t.length() - 1 - i))
			{
				correct = false;
				break;
			}
		}
		
		String output = correct ? "YES" : "NO";
		System.out.println(output);
	}
}
