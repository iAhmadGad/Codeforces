import java.util.Scanner;

/*
 * A - Stones on the Table
 */

public class P266A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte n = scanner.nextByte(), counter;
		String input = scanner.next();
		counter = 0;
		scanner.close();
		
		for(byte i = 1; i < n; i++) 
		{
			if(input.charAt(i) == input.charAt(i - 1)) counter++;
		}
		
		System.out.println(counter);
	}
}