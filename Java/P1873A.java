import java.util.Scanner;

/*
 * A - Short Sort
 */

public class P1873A
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		byte t = scanner.nextByte();
		for(byte i = 0; i < t; i++)
		{
			String s = scanner.next();
			System.out.println((s.compareTo("abc") == 0 || ("" + s.charAt(0) + s.charAt(2) + s.charAt(1)).compareTo("abc") == 0 || ("" + s.charAt(1) + s.charAt(0) + s.charAt(2)).compareTo("abc") == 0 || ("" + s.charAt(2) + s.charAt(1) + s.charAt(0)).compareTo("abc") == 0) ? "YES": "NO");
		}
		scanner.close();
		System.exit(0);
	}
}
