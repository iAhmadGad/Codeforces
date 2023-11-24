import java.util.Scanner;

/*
 * A - YES or YES?
 */

public class P1703A 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		short t = scanner.nextShort();
		for(short i = 0; i < t; i++)
		{
			String s = scanner.next();
			s = s.toUpperCase();
			if(s.compareTo("YES") == 0) System.out.println("YES");
			else System.out.println("NO");
		}
		scanner.close();
	}
}
