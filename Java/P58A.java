import java.util.Scanner;

/*
 * A - Chat room
 */

public class P58A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next(), h = "hello";
		byte stringCounter = 0;
		scanner.close();
		
		for(byte i = 0; i < s.length(); i++)
		{
			if(stringCounter == 5) break;
			if(s.charAt(i) == h.charAt(stringCounter)) stringCounter++;
		}
		
		String output = (stringCounter == 5) ? "YES" : "NO";
		System.out.println(output);
	}
}
 