import java.util.Scanner;
import java.util.Arrays;

/*
 * A - Amusing Joke
 */

public class P141A 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		s1 += scanner.nextLine();
		String s2 = scanner.nextLine();
		scanner.close();
		
		char letters1[] = new char[s1.length()];
		char letters2[] = new char[s2.length()];
		
		for(short i = 0; i < s1.length(); i++) letters1[i] = s1.charAt(i);
		for(short i = 0; i < s2.length(); i++) letters2[i] = s2.charAt(i);
		
		Arrays.sort(letters1);
		Arrays.sort(letters2);
		
		if(Arrays.equals(letters1, letters2)) System.out.println("YES");
		else System.out.println("NO");
	}
}
