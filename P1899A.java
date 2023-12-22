import java.util.Scanner;

/*
 * A - Game with Integers
 */

public class P1899A
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		byte t = scanner.nextByte();
		for(byte i = 0; i < t; i++)
		{
			if(scanner.nextShort() % 3 == 0) System.out.println("Second");
			else System.out.println("First");
		}
		
		scanner.close();
		System.exit(0);
	}
}
