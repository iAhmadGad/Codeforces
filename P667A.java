import java.util.Scanner;

/*
 * A - Vanya and Fence
 */

public class P667A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		short n = scanner.nextShort(), h = scanner.nextShort(), counter = 0;
		
		for(short i = 0; i < n; i++)
		{
			short a = scanner.nextShort();
			if(a > h) counter += 2;
			else counter++;
		}
		
		scanner.close();
		System.out.println(counter);
	}
}
