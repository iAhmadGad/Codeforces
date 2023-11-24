import java.util.Scanner;
import java.util.Arrays;
/*
 * A - Tram
 */

public class P116A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		short n = scanner.nextShort();
		int passengers[] = new int[n];
		
		scanner.nextInt();
		passengers[0] = scanner.nextInt();
		for(short i = 1; i < n; i++)
		{
			passengers[i] = (passengers[i - 1] - scanner.nextInt());
			passengers[i] += scanner.nextInt();
		}
		
		Arrays.sort(passengers);
		System.out.println(passengers[passengers.length - 1]);
	}
}
