import java.util.Scanner;

/*
 * A - I_love_%username%
 */

public class P155A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		short n = scanner.nextShort(), best = scanner.nextShort(), worst = best, current, counter = 0;

		for(short i = 0; i < n - 1; i++)
		{
			current = scanner.nextShort();
			if(current > best)
			{
				counter++;
				best = current;
			}
			else if(current < worst)
			{
				counter++;
				worst = current;
			}
		}
		
		scanner.close();
		
		System.out.println(counter);
	}
}
