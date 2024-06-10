import java.util.Scanner;

/*
 * A - Football
 */

public class P96A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		byte counter = 1;
		
		for(byte i = 1; i < input.length(); i++)
		{
			if(counter == 7) break;
			if(input.charAt(i) == input.charAt(i - 1)) counter++;
			else if(input.charAt(i) != input.charAt(i - 1)) counter = 1;
		}
		
		String output = (counter >= 7) ? "YES\r\n" + "" : "NO\r\n" + "";
		System.out.println(output);
	}
}
