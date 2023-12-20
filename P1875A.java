import java.util.Scanner;

/*
 * A - Jellyfish and Undertale
 */

public class P1875A
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		short t = scanner.nextShort();
		for(short i = 0; i < t; i++)
		{
			long a = scanner.nextInt(), b = scanner.nextInt(), seconds = b;
			byte n = scanner.nextByte();
			for(byte j = 0; j < n; j++) seconds += Math.min(a - 1, scanner.nextInt());
			System.out.println(seconds);
		}
		scanner.close();
		System.exit(0);
	}
}