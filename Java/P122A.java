import java.util.Scanner;

/*
 * A - Lucky Division
 */

public class P122A {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		short n = scanner.nextShort();
		scanner.close();
		
		String output = isAlmostLucky(n) ? "YES" : "NO";
		System.out.println(output);
	}
	
	static boolean isLucky(short n)
	{
		while(n != 0)
		{
			if (n % 10 != 4 && n % 10 != 7)
	        {
	            return false;
	        }
	        n /= 10;
		}
		return true;
	}
	
	static boolean isAlmostLucky(short n)
	{
		if(isLucky(n)) return true;
		for(short i = 2; i <= n / 2; i++)
		{
			if(n % i == 0 && (isLucky(i) || isLucky((short) (n / i))))
			{
				return true;
			}
		}
		return false;
	}
}
