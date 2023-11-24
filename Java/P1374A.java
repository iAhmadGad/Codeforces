import java.util.Scanner;

/*
 * A - Required Remainder
 */

public class P1374A
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i = 0; i < t; i++) System.out.println(solve(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
		scanner.close();
		System.exit(0);
	}
	
	public static int solve(int x, int y, int n)
	{
		return n - n % x + y <= n ? n - n % x + y : n - n % x - (x - y);
	}
}
